import pandas as pd
import os.path
import sys

# Load a csv file with the results of multiple executions.
df = pd.read_csv(sys.argv[1])

# Calculate and print some useful information
average_inferred = df['inferred_nf'].mean()
average_filtered_ma = df['filtered_ma'].mean()
average_filtered_buckets = df['filtered_buckets'].mean()

print("Executions: %d" % len(df))
print("Avg inferred: {:.2f}".format(average_inferred))
print("Avg filtered ma: {:.2f}".format(average_filtered_ma))
print("Avg filtered buckets: {:.2f}".format(average_filtered_buckets))