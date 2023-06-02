import numpy as np
import pandas as pd

from RWK import compute_kernel_matrix, find_Features
import networkx as nx
import pickle
from os.path import join
import os
from pathlib import Path
import sys
import csv

BASE = Path(os.getcwd()).parent
WRITE_SOURCE = "classification"
READ_SOURCE =  "minimized_data_set"

# Constants
C_param = 1000
lambda_param = 1.2
random_state = np.random.RandomState(0)

### LEVERAGING MUTANTS DATASET
# LM_MR = "permutative"
# LM_OPERATORS = {
#   "org": 1,
#   "m1": 1,
#   "m3": 0,
#   "m4": 0
# }
# LM_operators = "_".join([op for op, add in LM_OPERATORS.items() if add])
# gpickle_File_Path = join(BASE, SOURCE, "gpickles", "LM", LM_MR, "{}_{}.gpickle".format(LM_MR, LM_operators))
# labels_File_Path = join(BASE, SOURCE, "labels", "LM", LM_MR, "final_labels", "{}_{}.txt".format(LM_MR, LM_operators))
# save_RWK_kernel_path = join(BASE, SOURCE, "kernels", "LM", LM_MR, "LM_kernel_{}_{}.csv".format(LM_MR, LM_operators))

### NON-EQUIVALENT MUTANTS DATASET
MRS = ["additive", "permutative", "inclusive"]
OPERATORS = {
  "original": 1,
  "AODU": 0,
  "AOIS": 0,
  "AOIU": 0,
  "AORB": 0,
  "AORS": 0,
  "ASRS": 0,
  "CDL": 0,
  "COI": 0,
  "COR": 0,
  "LOI": 0,
  "ODL": 0,
  "ROR": 0,
  "SDL": 0,
  "VDL": 0
}
operators = "_".join([op for op, add in OPERATORS.items() if add])


labels = {
  "additive": [],
  "permutative": [],
  "inclusive": []
}
graphs = []
hasGraphs = False
for MR in MRS:
  for operator in [op for op, add in OPERATORS.items() if add]:
    with open(join(BASE, READ_SOURCE, operator, "labels", "Final_{}_{}_labels.csv".format(operator, MR)), "r") as csvFile:
      print("Reading from label-file:\n    {}".format(csvFile.name))
      reader = csv.reader(csvFile)
      for row in reader:
        method = row[0].removesuffix("_m")
        label = row[1]
        labels[MR].append((method, label))

        if not hasGraphs:
          dotFile = join(BASE, READ_SOURCE, operator, "dot", "{}.dot".format(method))# row[0] if not row[0].endswith("_m") else row[0].removesuffix("_m")))  
          G = nx.drawing.nx_pydot.read_dot(dotFile)
          graphs.append((method, G))
      csvFile.close()
  hasGraphs = True 


  print("Creating pickle for MR: {}".format(MR))
  print("Creating pickle for operators: {}".format([op for op, val in OPERATORS.items() if val == 1]))
  gPicklePath = join(BASE, WRITE_SOURCE, "gpickles", MR)
  if not os.path.exists(gPicklePath):
    os.makedirs(gPicklePath)
  gpickle_File_Path = join(gPicklePath, "gpickle_{}_{}.gpickle".format(MR, operators))
  os.makedirs()
  with open(gpickle_File_Path, "wb") as f:
    pickle.dump(graphs, f, protocol=pickle.HIGHEST_PROTOCOL)
    f.close()
  print("Pickle stored at:\n    {}".format(gpickle_File_Path))

  labelsPath = join(BASE, WRITE_SOURCE, "labels", MR)
  if not os.path.exists(labelsPath):
    os.makedirs(labelsPath)
  labels_File_Path = join(labelsPath, "labels_{}_{}.txt".format(MR, operators))
  with open(labels_File_Path, "w") as f:
    for item in labels[MR]:
      f.write("{},{}\n".format(item[0], item[1]))
    f.close()
  print("Labels stored at:\n    {}".format(labels_File_Path))


lenArrLabels = [len(arr) for arr in labels.values()]
if lenArrLabels.count(lenArrLabels[0]) != len(lenArrLabels):
  print("Label arrays are of different sizes {}".format(lenArrLabels))
  sys.exit(1)

if len(graphs) != lenArrLabels[0]:
  print("Graph array size [{}] does not match label array sizes [{}]".format(len(graphs), lenArrLabels[0]))
  sys.exit(1)


data = np.asarray(graphs)


hasComputedKernel = False
RWK_kernel = None
column_Names = []
for MR in MRS:
  print("Calculating RWK for {}-MR".format(MR))
  target = np.asarray(labels[MR])
  
  if data.shape != target.shape:
    print("Shape of data [{}] does not match shape of target [{}]".format(data.shape, target.shape))
    sys.exit(1)

  for i in range(data.shape[0]):
    if data[i][0] != target[i][0]:
      print("Graph did not correspond to correct label")
      sys.exit(1)

  if not hasComputedKernel:
    RWK_kernel = compute_kernel_matrix(data[:, 1], data[:, 1], lmb=lambda_param)
    for i in range(np.shape(RWK_kernel)[0]):
      column_Names.append("FM_{}".format(str(i+1)))
    hasComputedKernel = True

  df_RWK_kernel = pd.DataFrame(RWK_kernel, columns=column_Names)
  df_RWK_kernel["Methods"] = target[:, 0]
  df_RWK_kernel["Labels"] = target[:, 1]

  RWK_Path = join(BASE, WRITE_SOURCE, "kernels", MR)
  if not os.path.exists(RWK_Path):
    os.makedirs(RWK_Path)
  save_RWK_kernel_path = join(RWK_Path, "kernel_{}_{}.csv".format(MR, operators))
  df_RWK_kernel.to_csv(save_RWK_kernel_path)

  print("Saving RWK {} kernel to: {}".format(MR, save_RWK_kernel_path))