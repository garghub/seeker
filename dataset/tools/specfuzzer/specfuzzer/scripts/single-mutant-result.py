# This script process process the results after checking the assertions on a single mutant. 
# It takes the csv file containing the assertions that failled at least once on the given 
# mutants file, and the extends the invs-by-mutants.csv file which will contain the
# results after processing all the mutants.  

import pandas as pd
import os.path
import sys

# Load file and arguments
df = pd.read_csv(sys.argv[1]) # Csv containing the assertions that failed on the mutant_file
iteration = sys.argv[2] # Iteration
mutant_file = sys.argv[3] # Mutant file

# Extend the current df with the new columns
df["iteration"]=iteration
df["mutant"]=mutant_file

# Incorporate the frame corresponding to the current mutant in the frame of all mutants.
df_all = pd.read_csv('invs-by-mutants.csv')
frames = [df_all, df]
joined = pd.concat(frames)

# Save the extended frame in the file invs-by-mutants.csv
joined.to_csv('invs-by-mutants.csv', mode= 'w', index = False, header=True)

