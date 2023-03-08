# This file save the stats of a single SpecFuzzer execution.

# Imports
import pandas as pd
import sys
from re import search

# Read arguments
target_class=sys.argv[1] # Target class name
target_method=sys.argv[2] # Target method name
exec_nr=sys.argv[3] # Execution number being analyzed (usually will be between 1..10)
fuzzed_nr=sys.argv[4] # Number of fuzzed specs
mutants_nr=sys.argv[5] # Number of mutatns processed to filter specs
inference_time=sys.argv[6] # Inference time (Step 1)in seconds
filtering_time=sys.argv[7] # Filtering time (Step 2.1) in seconds
buckets_time=sys.argv[8] # Buckets-based Filtering time (Step 2.2) in seconds
assertions_file=sys.argv[9] # Csv file containing all the assertions inferred (Step 1)
invs_by_mutants_file=sys.argv[10] # File containing specs with the mutants they kill (Step 2.1)
output_file=sys.argv[11] # Output csv file

# Define functions and utilities
postcondition_delimiter=target_class+"."+target_method+"\("

def is_non_inv_line(curr_line):
    return search(":::OBJECT", curr_line) or search("==============", curr_line) or search(":::EXIT", curr_line) or search(":::ENTER", curr_line)

def all_inferred_assertions(assert_file):
	all_assertions=set()
	with open(assert_file) as f:
		count = 0
		count_enabled = True
		for line in f:
			curr_line = line.strip()
			if (is_non_inv_line(curr_line)):
				if (search(":::OBJECT", curr_line) or (search(postcondition_delimiter, curr_line) and search(":::EXIT", curr_line))):
					count_enabled = True
				else:
					count_enabled = False
				continue
			if (count_enabled):
				all_assertions.add(curr_line)

	return all_assertions

def all_mutant_killing_assertions(mka_file, all_assertions):
	df = pd.read_csv(mka_file)
	unique_assertions=set()
	visited=set()
	for idx in df.index:
		curr_inv = df['invariant'][idx]
		if (curr_inv in visited):
			continue
		visited.add(curr_inv)
		if (curr_inv.startswith("FuzzedInvariant:")):
			curr_inv = curr_inv.replace("FuzzedInvariant:","")
		for inv in all_assertions:
			if (curr_inv in inv):
				unique_assertions.add(curr_inv)
				break
	return unique_assertions

def buckets_report(buckets_file):
	f = open(buckets_file, 'r')
	fst_line = f.readline()
	snd_line = f.readline()
	f.close()
	buckets_nr=fst_line.replace("buckets=","").replace("\n","")
	specs_nr=snd_line.replace("specs=","").replace("\n","")
	return buckets_nr, specs_nr

# Load output file and stuff
output_df = pd.read_csv(output_file)
assertions = all_inferred_assertions(assertions_file)
filtered_assertions = all_mutant_killing_assertions(invs_by_mutants_file, assertions)
buckets_file=assertions_file.replace('.assertion','-buckets.assertion')
buckets_nr, filtered_buckets = buckets_report(buckets_file)

# Build the new row
row_to_add = {
"class":[target_class],
"method":[target_method],
"exec_nr":[exec_nr],
"fuzzed_nr":[fuzzed_nr],
"inference_time":[inference_time],
"inferred_nf":[len(assertions)],
"mutants_nr":[mutants_nr],
"filtering_time":[filtering_time],
"filtered_ma":[len(filtered_assertions)],
"buckets_time":[buckets_time],
"buckets_nr":[buckets_nr],
"filtered_buckets":[filtered_buckets]
}

# Append the new row to the output data frame
output_df = output_df.append(pd.DataFrame(row_to_add), ignore_index=True)

# Save the extended frame
output_df.to_csv(output_file, mode= 'w', index = False, header=True)