import os, pathlib
from os import listdir
from os.path import isfile, isdir, join
from pathlib import Path
from os.path import join
import sys
import csv

BASE = Path(os.getcwd()).parent
WRITE_SOURCE = "classification"
READ_SOURCE =  "minimized_data_set"
BASE = Path(os.getcwd()).parent

def getOgName(mutName):
  return "_".join(mutName.strip().split("_")[:-2]) + "_m"

WRITE_PATH = "minimized_data_set"

### NON-EQUIVALENT MUTANTS DATASET
MRS = ["additive", "permutative", "inclusive"]
OPERATORS = ["AODU", "AOIS", "AOIU", "AORB", "AORS", "ASRS", "CDL", "COI", "COR", "LOI", "ODL", "ROR", "SDL", "VDL"]

SAT = 0
NOT_SAT = 1

ORIGINAL_ADD = {}
ORIGINAL_PERM  = {}
ORIGINAL_INC = {}
ORIGINAL = {
  "additive": {},
  "permutative": {},
  "inclusive": {}
}
ORIGINAL_COUNT = 0
ORIGINAL_TOTAL_POS = 0
ORIGINAL_TOTAL_NEG = 0
ORIGINAL_MR_COUNT = {
  "additive": [0, 0],
  "permutative": [0, 0],
  "inclusive": [0, 0]
}
for MR in MRS:
  with open(join(BASE, READ_SOURCE, "original", "labels", "Final_original_{}_labels.csv".format(MR)), 'r') as f:
    reader = csv.reader(f)
    for row in reader:
      ORIGINAL_COUNT += 1
      
      ORIGINAL_TOTAL_POS += 1 if int(row[1]) == 1 else 0
      ORIGINAL_TOTAL_NEG += 1 if int(row[1]) == -1 else 0

      ORIGINAL_MR_COUNT[MR][SAT if int(row[1]) == 1 else NOT_SAT] += 1

      ORIGINAL[MR][row[0]] = int(row[1])
  f.close()


MUTANTS = {
  "additive": {},
  "permutative": {},
  "inclusive": {}
}

MUTANT_COUNT = 0
MUTANT_TOTAL_POS = 0
MUTANT_TOTAL_NEG = 0
MUTANT_MR_COUNT = {
  "additive": {},
  "permutative": {},
  "inclusive": {}
}
MUTANTS_EQUAL_SAT = {
  "additive": {},
  "permutative": {},
  "inclusive": {}
}
MUTANTS_EQUAL_NOT_SAT = {
  "additive": {},
  "permutative": {},
  "inclusive": {}
}
for MR in MRS:
  equalCount = 0
  notequalCount = 0
  totalCount = 0
  totalRight = 0
  for operator in OPERATORS:
    MUTANTS[MR][operator] = {}
    MUTANT_MR_COUNT[MR][operator] = [0, 0]
    MUTANTS_EQUAL_SAT[MR][operator] = 0
    MUTANTS_EQUAL_NOT_SAT[MR][operator] = 0
    with open(join(BASE, READ_SOURCE, operator, "labels", "Final_{}_{}_labels.csv".format(operator, MR)), 'r') as f:
      reader = csv.reader(f)
      for row in reader:
        ogName = getOgName(row[0])
        MUTANT_COUNT += 1

        MUTANT_TOTAL_POS += 1 if int(row[1]) == 1 else 0
        MUTANT_TOTAL_NEG += 1 if int(row[1]) == -1 else 0

        MUTANT_MR_COUNT[MR][operator][SAT if int(row[1]) == 1 else NOT_SAT] += 1

        MUTANTS_EQUAL_SAT[MR][operator] += 1 if int(row[1]) == ORIGINAL[MR][ogName] and int(row[1]) == 1  else 0
        MUTANTS_EQUAL_NOT_SAT[MR][operator] += 1 if int(row[1]) == ORIGINAL[MR][ogName] and int(row[1]) == -1 else 0
        
        MUTANTS[MR][operator][ogName] = int(row[1])
    f.close()

# ------------------------------------------------------
# Conditional Probability
# Calculated for each mutation operator 
#     P(mutantSat | originalSat) = P(mutantSat AND originalSat) / P(originalSat)
#       and, the negative case
#     P(mutantNotSat | originalNotSat) = P(mutantNotSat AND originalNotSat) / P(originalNotSat)
#     

P_ORIGINAL_SAT = {
  "additive": ORIGINAL_MR_COUNT["additive"][SAT] / sum(ORIGINAL_MR_COUNT["additive"]),
  "permutative": ORIGINAL_MR_COUNT["permutative"][SAT] / sum(ORIGINAL_MR_COUNT["permutative"]),
  "inclusive": ORIGINAL_MR_COUNT["inclusive"][SAT] / sum(ORIGINAL_MR_COUNT["inclusive"]),
}
P_ORIGINAL_NOT_SAT = {
  "additive": ORIGINAL_MR_COUNT["additive"][NOT_SAT] / sum(ORIGINAL_MR_COUNT["additive"]),
  "permutative": ORIGINAL_MR_COUNT["permutative"][NOT_SAT] / sum(ORIGINAL_MR_COUNT["permutative"]),
  "inclusive": ORIGINAL_MR_COUNT["inclusive"][NOT_SAT] / sum(ORIGINAL_MR_COUNT["inclusive"]),
}


for operator in OPERATORS:
  P_TRANSFER = [-1, -1, -1]
  for index, MR in enumerate(MRS):
    P_CP_SAT = MUTANTS_EQUAL_SAT[MR][operator] / sum(MUTANT_MR_COUNT[MR][operator])
    P_CP_NOT_SAT = MUTANTS_EQUAL_NOT_SAT[MR][operator] / sum(MUTANT_MR_COUNT[MR][operator])

    P_TRANSFER[index] = (MUTANTS_EQUAL_SAT[MR][operator] + MUTANTS_EQUAL_NOT_SAT[MR][operator]) / sum(MUTANT_MR_COUNT[MR][operator])

    # print("MR: {}\nOperator: {}\n    P_CP_SAT: {}\n    P_CP_NOT_SAT: {}".format(MR, operator, P_CP_SAT, P_CP_NOT_SAT))

  print("{},{},{},{}".format(operator, P_TRANSFER[0], P_TRANSFER[1], P_TRANSFER[2]))

    # P_MUTANT_SAT = MUTANT_MR_COUNT[MR][operator][SAT] / sum(MUTANT_MR_COUNT[MR][operator])
    # P_JOINT = P_MUTANT_SAT * P_ORIGINAL_SAT[MR]
    # P_CP_SAT = P_JOINT / P_ORIGINAL_SAT 

    # P_MUTANT_NOT_SAT = MUTANT_MR_COUNT[MR][operator][NOT_SAT] / sum(MUTANT_MR_COUNT[MR][operator])
    # P_JOINT = P_MUTANT_SAT * P_ORIGINAL_SAT
    # P_CP_SAT = P_JOINT / P_ORIGINAL_SAT 

# ------------------------------------------------------
# Conditional probability
# Calculated over each MR
# 

for MR in MRS:
  SUM_TOTAL_EQUAL_SAT = 0
  SUM_TOTAL_EQUAL_NOT_SAT = 0
  NUMBER_OF_MUTANTS = 0

  for operator in OPERATORS:
    SUM_TOTAL_EQUAL_SAT += MUTANTS_EQUAL_SAT[MR][operator]
    SUM_TOTAL_EQUAL_NOT_SAT += MUTANTS_EQUAL_NOT_SAT[MR][operator]
    NUMBER_OF_MUTANTS += len(MUTANTS[MR][operator].keys())
  print(MR)
  print(SUM_TOTAL_EQUAL_SAT / NUMBER_OF_MUTANTS)
  print(SUM_TOTAL_EQUAL_NOT_SAT / NUMBER_OF_MUTANTS)

print(NUMBER_OF_MUTANTS)
