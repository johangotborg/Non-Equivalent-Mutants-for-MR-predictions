import numpy as np
import pandas as pd
import networkx
from scipy.sparse import lil_matrix, kron
import networkx as nx

def find_Features(df):
    featureNames = []
    for columnName in list(df.columns):
        if columnName.find('FM_') != -1:
            featureNames.append(columnName)
    return featureNames

def norm_mat(adj_mat):
    norm = adj_mat.sum(axis=0)
    norm[norm == 0] = 1
    return adj_mat / norm


def compute_kernel_matrix(X, Y, lmb):

    kernel_matrix = np.zeros([len(X), len(Y)])
    compute_matrix = np.zeros([len(X), len(Y)])
    size = len(X)
    for i in range(0, len(X)):
      print("Computing RWK for CFG {} [{}]".format(str(i+1), str(size)))
      for j in range(0, len(Y)):
        if i == j:
            kernel_matrix[i, j] = 1.0
        elif compute_matrix[j, i] == 1:
          kernel_matrix[i, j] = kernel_matrix[j, i]
        else:          
          kernel_matrix[i, j] = RWK_norm(X[i], Y[j], lmb)
          compute_matrix[i, j] = 1
    return kernel_matrix

def RWK(X, Y, lmb):

    step = 10
    weighted_sum = 0
    g1 = norm_mat(networkx.adjacency_matrix(X))
    g2 = norm_mat(networkx.adjacency_matrix(Y))
    g_prod = kron(lil_matrix(g1), lil_matrix(g2))

    for n in range(step):
        weighted_sum += (g_prod ** n).dot(lmb ** n)

    k = weighted_sum.sum()

    return k

def RWK_norm(X, Y, lmb):

    step = 10
    weighted_sum = 0
    weighted_sum_1 = 0
    weighted_sum_2 = 0
    g1 = norm_mat(networkx.adjacency_matrix(X))
    g2 = norm_mat(networkx.adjacency_matrix(Y))
    g_prod = kron(lil_matrix(g1), lil_matrix(g2))
    g_prod_1 = kron(lil_matrix(g1), lil_matrix(g1))
    g_prod_2 = kron(lil_matrix(g2), lil_matrix(g2))

    for n in range(step):
        weighted_sum += (g_prod ** n).dot(lmb ** n)
        weighted_sum_1 += (g_prod_1 ** n).dot(lmb ** n)
        weighted_sum_2 += (g_prod_2 ** n).dot(lmb ** n)

    k = weighted_sum.sum()
    k_1 = weighted_sum_1.sum()
    k_2 = weighted_sum_2.sum()
    k_norm = k / np.sqrt(k_1 * k_2)

    return k_norm

