#!/bin/bash

# Verify that the required environment variables have been set
[[ -z "$EVOSPEX" ]] && { echo "> The environment variable EVOSPEX is empty" ; exit 1; }
[[ -z "$GASSERTDIR" ]] && { echo "> The environment variable GASSERTDIR is empty" ; exit 1; }
[[ -z "$SPECFUZZER" ]] && { echo "> The environment variable SPECFUZZER is empty" ; exit 1; }

# Read arguments
root_dir=$EVOSPEX;
gassert_subject=$1
fqname=$2
method=$3
executions=10


evospex_jar=$EVOSPEX/lib/evospex-jar-with-dependencies.jar

echo '> Running EvoSpex on GAssert subject: '$fqname'.'$method
echo 'executions: '$executions

# Get required variables
gassert_dir=$GASSERTDIR
subject_sources=$gassert_dir/subjects/$gassert_subject
subject_cp="$subject_sources/build/libs/*"
resources_base=$subject_sources/evospex-resources
target_class_sn=${fqname##*.}
model_file=$resources_base/model/$target_class_sn.als
base_folder=$resources_base'/3/objects/';
cd $base_folder;
num_args="$( ls -l in*.xml | wc -l )";
num_outputs="$( ls -l out*.xml | wc -l )";
cd $root_dir;
echo 'model: '$model_file
echo 'base_folder: '$base_folder
echo 'num_args: '$num_args
echo 'num_outputs: '$num_outputs


output_dir=$SPECFUZZER/"experiments/gassert/$gassert_subject/evospex"
mkdir -p $output_dir
for value in $(eval echo {1..$executions})
do
	echo '> Execution number '$value' being sent to '$output_dir/$target_class_sn-$method-evospex-$value.assertions
	java -cp $subject_cp:$evospex_jar main.EvoSpex $model_file $base_folder $num_args $num_outputs 'to=5400' $3 $4 $5 $6 $7 > $output_dir/$target_class_sn-$method-evospex-$value.assertions  
done

echo '> Computing final csv with data from all the executions'
csv_file=$output_dir/$target_class_sn-$method-evospex.csv 
touch $csv_file
echo "class,method,exec_number,totaltime,positive_ce,negative_ce,total_assertions" >> $csv_file
for value in $(eval echo {1..$executions})
do
	(echo -n "$target_class_sn,$method,$value," ; tail -1 $output_dir/$target_class_sn-$method-evospex-$value.assertions;) >> $csv_file
done

echo 'Output csv file: '$csv_file
echo 'Processing output..'
python3.7 $EVOSPEX/experiments/process-csv.py $csv_file
echo ''


