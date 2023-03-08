#!/bin/bash

# This script allows to run SpecFuzzer for a GAssert subkect. 

# Verify that the required environment variables have been set
[[ -z "$SPECFUZZER" ]] && { echo "> The environment variable SPECFUZZER is empty" ; exit 1; }
[[ -z "$GASSERTDIR" ]] && { echo "> The environment variable GASSERTDIR is empty" ; exit 1; }

# Read arguments
gassert_subject=$1
fqname=$2
method_name=$3

# Create useful variables
gassert_dir=$GASSERTDIR
subject_sources=$gassert_dir/subjects/$gassert_subject
class_package=$(echo "$fqname" | sed 's/\.[^.]*$//')
class_name=${fqname##*.}
setup_files=experiments/$gassert_subject/setup-files
subject_cp=$subject_sources/build/libs/*

# Input files
grammar_to_fuzz=$setup_files/$class_name'Grammar.json'
objects_file=$setup_files/$class_name'TesterDriver-objects.xml'
dtrace_file=$setup_files/$class_name'TesterDriver.dtrace.gz'
mutants_dir=$setup_files/mutants
target_name=$class_name'TesterDriver'
invs_file=$target_name'.inv.gz'
output_dir=experiments/$gassert_subject/output/
mkdir -p $output_dir
executions=10
# SpecFuzzer params
invs_to_fuzz=2000;

# Start
echo '> SpecFuzzer'
echo 'target: '$gassert_subject'/'$fqname$'.'$method_name
echo 'grammar: '$grammar_to_fuzz
echo 'dtrace: '$dtrace_file
echo 'objects: '$objects_file
echo 'executions: '$executions
echo ''


# Build classpath
cp_for_daikon=lib/*:$subject_cp

# Execution SpecFuzzer the specified number of times.
for value in $(eval echo {1..$executions})
do
echo '> Execution number: '$value
SECONDS=0

# Prepare files
base_file_name=$class_name'-'$method_name'-specfuzzer-'$value
rm -f invs_file.xml
rm -f invs-by-mutants.csv
cp base_invs_file.xml invs_file.xml
cp base-invs-by-mutants.csv invs-by-mutants.csv
log_file=$output_dir$base_file_name'.log'

echo '> SpecFuzzer' > $log_file
echo '# Inference step (Daikon + Fuzzed Specs)' >> $log_file
# Run SpecFuzzer
java -Xmx8g -cp $cp_for_daikon daikon.Daikon --grammar-to-fuzz $grammar_to_fuzz --living-fuzzed-invariants invs_file.xml --fuzzed-invariants $invs_to_fuzz --serialiazed-objects $objects_file $dtrace_file >> $log_file
inference_sec=$SECONDS

# Now perform the filtering step using a seconds budget. If the budget is passed, then stop.
FILTERING_BUDGET=5400
SECONDS=0
mutations_log=$mutants_dir'/'$target_name'-mutants.log' 
processed_mutants=0
echo '' >> $log_file
echo '# Filtering step' >> $log_file
echo '' >> $log_file
for mutant_dtrace in $mutants_dir"/"$target_name*.dtrace.gz; do
  base_name=${mutant_dtrace/%$".dtrace.gz"}
  mutant_objects_file=$base_name"-objects.xml"
  mutant_number=${base_name#$mutants_dir'/'$target_name'-m'}
  curr_mutant=$(sed -n $mutant_number'p' $mutations_log)
  if [[ $curr_mutant == *$class_name':'* || $curr_mutant == *$class_name'@<init>'* || $curr_mutant == *$class_name*$method_name* ]]; then
    # The mutant is in a static method OR in a constructor OR in the current method
    echo '- Mutation is: '$curr_mutant >> $log_file
    echo 'Checking invs on mutant: '$mutant_dtrace >> $log_file
    java -Xmx8g -cp $cp_for_daikon daikon.tools.InvariantChecker --conf --serialiazed-objects $mutant_objects_file $invs_file $mutant_dtrace >> $log_file
    echo 'Saving mutants results file' >> $log_file
    python3 scripts/single-mutant-result.py invs.csv 1 $mutant_dtrace >> $log_file
    echo '' >> $log_file
    processed_mutants=$((processed_mutants+1))
  fi
  # Check budget
  if [ "$SECONDS" -gt "$FILTERING_BUDGET" ]; then
    echo 'Filtering step finished due to timeout: '$SECONDS >> $log_file
    break
  fi
done # End Mutation Analysis based filtering.
filtering_sec=$SECONDS
mutka_file=$output_dir$base_file_name'-invs-by-mutants.csv'
echo '# Mutation killing ability results saved in: '$mutka_file >> $log_file
cp invs-by-mutants.csv $mutka_file

# Saving assertion files
echo '' >> $log_file
assertions_file=$output_dir$base_file_name.assertions
echo '# Writing assertions to file: '$assertions_file >> $log_file
java -cp $cp_for_daikon daikon.PrintInvariants $invs_file --ppt-select '.'$class_name':::OBJECT' --format java > $assertions_file
java -cp $cp_for_daikon daikon.PrintInvariants $invs_file --ppt-select '.'$class_name'\.'$method_name'.' --format java >> $assertions_file
mv $invs_file $output_dir$base_file_name.inv.gz
mv invs_file.xml $output_dir$base_file_name'-filteredinvs.xml'

# Filter the specs with the buckets approach
echo '' >> $log_file
echo '# Filtering specs with buckets' >> $log_file
SECONDS=0
python3 scripts/buckets-filter.py $mutka_file $assertions_file $class_name $method_name >> $log_file
buckets_sec=$SECONDS
echo '' >> $log_file

# Save stats to the csv file
base_csv_file=$class_name'-'$method_name'-specfuzzer'
csv_file=$output_dir$base_csv_file.csv
echo '# Writing stats to csv file: '$csv_file 
if [[ "$value" == 1 ]]; then
  echo "class,method,exec_nr,fuzzed_nr,inference_time,inferred_nf,mutants_nr,filtering_time,filtered_ma,buckets_time,buckets_nr,filtered_buckets" > $csv_file
fi
python3 scripts/save-stats-csv.py $class_name $method_name $value $invs_to_fuzz $processed_mutants $inference_sec $filtering_sec $buckets_sec $assertions_file $mutka_file $csv_file
echo '# Finished execution '$value
echo ''

done # Close executions loop

echo '> Done!'
