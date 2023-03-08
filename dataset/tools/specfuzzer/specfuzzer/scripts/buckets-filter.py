# This script implements the Buckets-based filtering mechanism. 

import pandas as pd
import os.path
import sys
from re import search
import numpy

# Load file and arguments
csv_file=sys.argv[1] # Csv file containing assertions with it mutant killing ability.
assertion_file=sys.argv[2] # Assertions file containing all the inferred assertions.
clazz=sys.argv[3] # Target class
method=sys.argv[4] # Target method

print ("> Mutant filter from file: "+csv_file)
df = pd.read_csv(csv_file)
unique_mut = df.mutant.unique()
print("Unique mutants: "+str(len(unique_mut)))
mutants_ids={}
mid=0
for mutant in unique_mut:
    mutants_ids[mutant]=mid
    mid=mid+1


postcondition_delimiter=clazz+"."+method+"\("

def is_non_inv_line(curr_line):
    return search(":::OBJECT", curr_line) or search("==============", curr_line) or search(":::EXIT", curr_line) or search(":::ENTER", curr_line)

object_assertions=set()
postcondition_assertions=set()
def load_specs_from_assertion_file(assert_file):
    all_assertions=set()
    print("Loading assertions from: "+assert_file)
    with open(assert_file) as f:
        count = 0
        count_enabled = True
        is_object_prop = False
        for line in f:
            curr_line = line.strip()
            if (is_non_inv_line(curr_line)):
                obj_line = search(":::OBJECT", curr_line)
                if (obj_line or (search(postcondition_delimiter, curr_line) and search(":::EXIT", curr_line))):
                    if (obj_line):
                        is_object_prop = True
                    else:
                        is_object_prop = False
                    count_enabled = True
                else:
                    count_enabled = False
                continue
            if (count_enabled):
                if (is_object_prop):
                    object_assertions.add(curr_line)
                else:
                    postcondition_assertions.add(curr_line)
                all_assertions.add(curr_line)

    return all_assertions

assertions = load_specs_from_assertion_file(assertion_file)

# Build a dict with only the specs of interes, i.e., those specs that are part of the OBJECT pp or the POSTCONDTION
def is_of_interest(spec):
    curr_spec = spec
    if (curr_spec.startswith("FuzzedInvariant:")):
        curr_spec = curr_spec.replace("FuzzedInvariant:","")
    if ("daikon.Quant.memberOf" in spec):
        return True
    for inv in assertions:
        if (curr_spec in inv):
            return True
    return False

killers_and_mutants={}
unique_inv = df.invariant.unique()
for invariant in unique_inv:
    if is_of_interest(invariant):
        kl = df[df['invariant']==invariant]
        killed = kl.mutant.unique()
        killers_and_mutants[invariant]=(killed)

print("Specs killing mutants: "+str(len(killers_and_mutants)))

print()
print("> Minimizing by exploring the bit vector of each spec")
print("Building bit vectors of size: "+str(len(unique_mut)))
spec_vectors={}
for spec, mutants in killers_and_mutants.items():
    bit_vector = numpy.zeros(len(unique_mut))
    for mutant in mutants:
        bit_vector[mutants_ids[mutant]]=1
    spec_vectors[spec]=bit_vector

def count_ocurrences(inv):
    rows = df.apply(lambda x: True if x['invariant'] == inv else False , axis=1)
    num = len(rows[rows == True].index)
    return num

print("Building buckets")
visited=set()
buckets={}
for spec, vector in spec_vectors.items():
    #print(spec," -> ",str(vector))
    if str(vector) in visited:
        buckets[str(vector)].add(spec)
        continue
    else:
        visited.add(str(vector))
        buckets[str(vector)]=set()
        buckets[str(vector)].add(spec)

def print_mutants(vector):
    keys=list(mutants_ids.keys())
    vals=list(mutants_ids.values())
    convertible=vector.replace("[","").replace("]","").replace(".","")
    array = numpy.fromstring(convertible, sep=" ")
    print("Mutants:")
    for idx in range(array.shape[0]):
        if array[idx]==1:
            position=vals.index(idx)
            print("\t"+keys[position])


"""
Determine the total amount of failures of the given inv
"""
def all_amount_of_fails(inv):
    kl = df[df['invariant']==inv]
    return len(kl)

"""
Determine the quality of a spec considering: amount of fails + involving vars
"""
def quality(spec):
    fails=all_amount_of_fails(spec)
    variables= int("_Variable_0" in spec) + int("Variable_1" in spec) + int("Variable_2" in spec)
    return fails + variables

def get_daikon_quant(some_set):
    members = [x for x in some_set if "daikon.Quant" in x and "getClass" not in x and "fuzzy" not in x]
    return set(members)

print("=====================================")
print("Buckets: "+str(len(buckets)))
invs_killer_set=set()
for vector, specs_set in buckets.items():
    print("Vector: "+vector)
    print_mutants(vector)
    print("Specs:")
    sorted_set = sorted(specs_set, key=quality ,reverse=True)
    for spec in sorted_set:
        fails = all_amount_of_fails(spec)
        print("\t"+spec+" l: ",len(spec)," - Fails: ",fails, "Quality: ", quality(spec))
    print("Picked:")
    picked_set=set()
    picked_set.add(next(iter(sorted_set)))
    picked_set = picked_set.union(get_daikon_quant(sorted_set))
    for picked in picked_set:
        print("\t"+picked)
    invs_killer_set = invs_killer_set.union(picked_set)
    print()

unique_obj_assertions=set()
unique_pc_assertions=set()
visited=set()
for curr_inv in invs_killer_set:
    if ("memberOf" in curr_inv):
        print(curr_inv)
    if (curr_inv in visited):
        continue
    visited.add(curr_inv)
    if (curr_inv.startswith("FuzzedInvariant:")):
        curr_inv = curr_inv.replace("FuzzedInvariant:","")
    is_obj_inv = False
    for inv in object_assertions:
        if (curr_inv in inv):
            unique_obj_assertions.add(curr_inv)
            is_obj_inv = True
            break
    if (not is_obj_inv):
        added = False
        for inv in postcondition_assertions:
            if (curr_inv in inv):
                unique_pc_assertions.add(curr_inv)
                added = True
        if (not added):
            index = df.index
            condition = df['invariant']==curr_inv
            indices = index[condition]
            if (search(postcondition_delimiter, df['ppt'][indices[0]])):
                unique_pc_assertions.add(curr_inv)


all_assertions=len(unique_obj_assertions)+len(unique_pc_assertions)

print("Buckets: "+str(len(buckets)))
print("Specs: "+str(all_assertions))

buckets_file=assertion_file.replace('.assertion','-buckets.assertion')
print("Saved in file: "+buckets_file)
f=open(buckets_file,"w+")
f.write("buckets=%d\n" % len(buckets))
f.write("specs=%d\n" % all_assertions)
f.write("=====================================\n")
f.write(":::OBJECT\n")
for unique in unique_obj_assertions:
    f.write(unique+"\n")
f.write("=====================================\n")
f.write(":::POSTCONDITION\n")
for unique in unique_pc_assertions:
    f.write(unique+"\n")
f.close()

"""
Determine the amounf of fails of the given inv on the given mutant
"""
def amount_of_fails(inv, mutant):
    kl = df[df['mutant']==mutant]
    return len(kl[kl['invariant']==inv])

