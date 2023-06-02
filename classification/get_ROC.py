import os
import numpy as np
import pandas as pd
import matplotlib.pyplot as plt
from numpy import interp
from sklearn.svm import SVC
from sklearn.model_selection import StratifiedKFold
from sklearn.metrics import roc_curve, auc, precision_recall_curve
from RWK import find_Features
from os.path import join
from pathlib import Path

### CONSTANTS
BASE = Path(os.getcwd()).parent
SOURCE = "classification"
C_param = 1000
lambda_param = 1.2
random_state = np.random.RandomState(0)
k_Fold_splits = 10

### LEVERAGING MUTANTS KERNELS
# MR = "additive"
# OPERATORS = {
#   "org": 1,
#   "m1": 1,
#   "m3": 1,
#   "m4": 0
# }
# operators = "_".join([op for op, add in OPERATORS.items() if add])
# kernel_File_Path = join(BASE, SOURCE, "kernels", "LM", MR, "LM_kernel_{}_{}.csv".format(MR, operators))

### NON-EQUIVALENT MUTANTS KERNELS
# MR = "additive"
# MR = "permutative"
MR = "inclusive"
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
kernel_File_Path = join(BASE, SOURCE, "kernels", MR, "kernel_{}_{}.csv".format(MR, operators))


# -----------------------------------------------------------------


print("Starting to read CSV: {}".format(kernel_File_Path))
df = pd.read_csv(kernel_File_Path) # .sample(frac=1, random_state=random_state)

# Find feature columns
featureNames = find_Features(df)

# Kernel and labels separation
RWK_kernel = np.asarray(df[featureNames])
target = np.asarray(df['Labels'])

print("Running classification on kernel:\n    size: {}".format(RWK_kernel.shape))

#Define parameters for SVM
print("Initiating the SVM-model")
skf = StratifiedKFold(n_splits=k_Fold_splits)
SVM = SVC(C=C_param, kernel="precomputed", probability=True, random_state=random_state)

print("    Number of splits: {}".format(skf.get_n_splits()))

tprs = []
aucs = []
AUCS = []
mean_fpr = np.linspace(0, 1, 100)

print("Fitting the SVM model")
i = 0
for train_index, test_index in skf.split(RWK_kernel, target):    
    X_train, X_test = RWK_kernel[train_index,:][:, train_index], RWK_kernel[test_index,:][:, train_index]
    y_train, y_test = target[train_index], target[test_index]
    # X_train, X_test = RWK_kernel[train_index], RWK_kernel[test_index]
    # y_train, y_test = target[train_index], target[test_index]
    

    model_RWK = SVM.fit(X_train, y_train)
    prediction = model_RWK.predict_proba(X_test)

    predic = prediction[:, 1]
    fpr, tpr, thresholds = roc_curve(target[test_index], predic)
    roc_auc = auc(fpr, tpr)
    
    tprs.append(interp(mean_fpr, fpr, tpr))
    tprs[-1][0] = 0.0
    
    AUCS.append(roc_auc)
    aucs.append(roc_auc)
    print("    Fitting iteration {}     AUC-score: {}".format(str(i+1), str(np.round(roc_auc, 4))))

    precision, recall, thresholds = precision_recall_curve(y_test, predic)
    plt.plot(fpr, tpr, lw=1, alpha=0.3, label='ROC fold %d (AUC = %0.2f)' % (i, roc_auc))
    i += 1

print("    Mean ROC: {}".format(np.round(np.mean(AUCS), 4)))

plt.plot([0, 1], [0, 1], linestyle='--', lw=2, color='r', label='Line of no discrimination', alpha=.8)
mean_tpr = np.mean(tprs, axis=0)
mean_tpr[-1] = 1.0
mean_auc = auc(mean_fpr, mean_tpr)
std_auc = np.std(aucs)
plt.plot(mean_fpr, mean_tpr, color='b', label=r'Mean ROC (AUC = %0.2f $\pm$ %0.2f)' % (mean_auc, std_auc), lw=2, alpha=.8)
std_tpr = np.std(tprs, axis=0)
tprs_upper = np.minimum(mean_tpr + std_tpr, 1)
tprs_lower = np.maximum(mean_tpr - std_tpr, 0)
plt.fill_between(mean_fpr, tprs_lower, tprs_upper, color='grey', alpha=.2, label=r'$\pm$ 1 std. dev.')

plt.xlim([-0.05, 1.05])
plt.ylim([-0.05, 1.05])
plt.xlabel('False Positive Rate')
plt.ylabel('True Positive Rate')
plt.title('ROC for ' + str(MR)+' MR, parameters = [C = ' + str(C_param)+', Lambda = ' + str(lambda_param)+ ']')
plt.legend(loc="lower right")
plt.show()

