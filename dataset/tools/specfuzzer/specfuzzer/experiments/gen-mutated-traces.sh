#!/bin/bash

echo '> Cleaning previous mutants'
rm -f mutants.log
rm -rf mutants/

MAJOR_HOME=../major/
gassert_subject=$1
subject_sources=$2
target_file=$3
driver_base=$4
build_dir=$subject_sources/build/classes/java/main
source_dir=$subject_sources/src/main/java/
setup_output_dir=experiments/$gassert_subject/setup-files

echo 'Build dir: '$build_dir
echo 'Source dir: '$source_dir
echo '> Generating mutants with Major for file: '$target_file
$MAJOR_HOME/bin/javac -cp $build_dir:$subject_sources/libs/* -nowarn -J-Dmajor.export.mutants=true -XMutator:ALL -d $build_dir $source_dir$target_file
echo '> Mutants generated!'
mutants_dir=$setup_output_dir/mutants
mkdir -p $mutants_dir
mv mutants.log $mutants_dir/$driver_base'Driver-mutants.log'
echo ''

cp_with_tests="$build_dir:$subject_sources/build/classes/java/test:$subject_sources/libs/*"

echo '> Processing mutants'
for dir in mutants/*/     # list directories in the form "/tmp/dirname/"
do
  echo '> Processing mutant: '$dir$target_file
  echo '> Compiling mutant'
  javac -cp $build_dir:$subject_sources/libs/* -g $dir$target_file -d $build_dir
  echo '> Mutant compiled'
  echo '' 
  echo '> Generating traces with Chicory from mutant'
  dir2=${dir%*/}
  number=${dir2##*/}
  java -cp lib/daikon.jar:$cp_with_tests daikon.Chicory --output-dir=$mutants_dir --comparability-file=$setup_output_dir/$driver_base'Driver.decls-DynComp' --ppt-omit-pattern=$driver_base'.*' --ppt-omit-pattern='org.junit.*' --dtrace-file=$driver_base'Driver-m'$number'.dtrace.gz' testers.$driver_base'Driver' $mutants_dir/$driver_base'Driver-m'$number'-objects.xml'
done

echo '> Done!'

