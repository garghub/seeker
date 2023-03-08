#!/bin/bash

# This script allows to setup the analysis for a class of a GASSERT subject

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
specfuzzer_cp="lib/*"

# Compile project
echo ""
echo "> Compiling GAssert subject: $gassert_subject"
pushd $subject_sources > /dev/null
./gradlew -q -Dskip.tests jar
popd > /dev/null
subject_cp="$subject_sources/build/libs/*:$subject_sources/libs/*"
echo ''

# Test generation
echo '> Test Generation'
outdir_tests=$subject_sources/src/test/java
echo "going to generate JUnit tests in: $outdir_tests"
echo "cleaning up old tests: $outdir_tests"
rm -r $outdir_tests/*
mkdir -p $outdir_tests
classes_flags="--testclass=$fqname"
echo 'classes: '$classes_flags
# Ignore all methods from javax.swing.* package to avoid breaking randoop
omitmethods="toString|hashCode|equals|clone|compareTo|javax.swing.*|ASTNode.dump|ASTNode.getTree|ASTNode.display|ASTNode.createTree|dk.statsbiblioteket.summa.common.util.PriorityQueue.getComparator|java.lang.Iterable.forEach|java.lang.Iterable.spliterator|java.util.List.spliterator|java.util.Collection.stream|java.util.AbstractList.subList|java.util.List.sort|jahuwaldt.plot.LinearAxisScale.findGoodLimits"
test_class_name=$class_name'Tester'
echo 'test class: '$test_class_name
echo ''
echo "Executing Randoop"
java -cp lib/randoop-all-4.2.4.jar:$subject_cp randoop.main.Main gentests $classes_flags --output-limit=500 --literals-level=ALL --literals-file=$SPECFUZZER/literals/lits.txt --omitmethods=$omitmethods --only-test-public-members=true --usethreads=false --junit-package-name='testers' --junit-output-dir=$outdir_tests --junit-reflection-allowed=false --regression-test-basename=$test_class_name --no-regression-assertions=true --randomseed=0
echo "Finished!"
echo ''

# Compile again
echo "> Compiling GAssert subject again: $gassert_subject"
pushd $subject_sources > /dev/null
./gradlew -q -Dskip.tests jar
popd > /dev/null
echo ''

# Collect state objects and mutants
echo '> Running DynComp, Chicory and Mutation Analysis with MAJOR'
driver_name=$test_class_name'Driver'
driver_fqname='testers.'$driver_name
setup_output_dir=experiments/$gassert_subject/setup-files/
echo 'Running DynComp from driver: '$driver_fqname
mkdir -p $setup_output_dir
java -cp lib/daikon.jar:$subject_cp daikon.DynComp $driver_fqname --output-dir=$setup_output_dir
echo ''
cmp_file=$setup_output_dir$driver_name'.decls-DynComp'
omit_pattern=$test_class_name'.*'
objs_file=$setup_output_dir$driver_name'-objects.xml'
echo 'Running Chicory for dtrace generation from driver: '$driver_fqname
java -cp lib/daikon.jar:$subject_cp daikon.Chicory --output-dir=$setup_output_dir --comparability-file=$cmp_file --ppt-omit-pattern=$omit_pattern $driver_fqname $objs_file
echo 'Objects saved in file: '$objs_file
echo ''
# Use Major to create the mutated traces
echo '> Generating mutants with MAJOR'
target_file="${fqname//.//}".java
./experiments/gen-mutated-traces.sh $gassert_subject $subject_sources $target_file $test_class_name
echo ''

# Grammar Extraction
echo '> Grammar Extraction'
java -cp $specfuzzer_cp:$subject_cp grammar.GrammarExtractor $fqname $setup_output_dir
echo ''
