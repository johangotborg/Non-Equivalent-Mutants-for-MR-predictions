import random
NUMBER_OF_TEST_CASES = 15
MAX_VAL = 20
MIN_VAL = 0

MAX_SIZE = 10
MIN_SIZE = 1

def add_values():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCases.append([[random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))]])
  return testCases

def array_calc():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCase = []
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))])
    testCase.append(random.randint(MIN_VAL, MAX_VAL)) # variance
    while (testCase[1] == 0):
      testCase[1] = random.randint(MIN_VAL, MAX_VAL)
    testCases.append(testCase)
  return testCases


def array_copy():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCases.append([[random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))]])
  return testCases

def autoCorrelation():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCase = []
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))])
    testCase.append(random.randint(0, len(testCase[0]))) # lag
    testCase.append(random.randint(MIN_VAL, MAX_VAL)) # mean
    testCase.append(random.randint(MIN_VAL, MAX_VAL)) # variance
    while (testCase[3] == 0):
      testCase[3] = random.randint(MIN_VAL, MAX_VAL)

    testCases.append(testCase)
  return testCases
  
def average():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCases.append([[random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))]])
  return testCases

def bi_SearchFromTo():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCase = []
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(3, MAX_SIZE))])
    testCase.append(random.randint(MIN_VAL, MAX_VAL)) # key
    testCase.append(random.randint(0, len(testCase[0])-2)) # from
    testCase.append(random.randint(testCase[2], len(testCase[0])-1)) # to

    testCases.append(testCase)
  return testCases

def bubble():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCases.append([[random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))]])
  return testCases

def cal_AbsoluteDiff():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCases.append([[random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))]])
  return testCases

def cal_Diff():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCase = []
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))])
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(len(testCase[0]))])
    testCases.append(testCase)
  return testCases


def cal_DividedDiff():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCase = []
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))])
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(len(testCase[0]))])
    testCases.append(testCase)
  return testCases

def canberraDist():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCase = []
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))])
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(len(testCase[0]))])
    testCases.append(testCase)
  return testCases

def chebyshevDist():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCase = []
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))])
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(len(testCase[0]))])
    testCases.append(testCase)
  return testCases

def check_eq_tolerance():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCase = []
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))])
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(len(testCase[0]))])
    testCase.append(random.randint(MIN_VAL, MAX_VAL))
    testCases.append(testCase)
  return testCases

def check_equal():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCase = []
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))])
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(len(testCase[0]))])
    testCases.append(testCase)
  return testCases

def checkNonNegative():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCase = []
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))])
    testCases.append(testCase)
  return testCases

def checkPositive():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCase = []
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))])
    testCases.append(testCase)
  return testCases

def chiSquare():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCase = []
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))])
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(len(testCase[0]))])
    testCases.append(testCase)
  return testCases

def clip():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCase = []
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))])
    testCase.append(random.randint(MIN_VAL, MAX_VAL-1))
    testCase.append(random.randint(testCase[1], MAX_VAL))
    
    testCases.append(testCase)
  return testCases

def cnt_zeroes():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCases.append([[random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))]])
  return testCases

def cosineDistance():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCase = []
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))])
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(len(testCase[0]))])
    testCases.append(testCase)
  return testCases

def count_k():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCase = []
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))])
    testCase.append(random.randint(MIN_VAL, MAX_VAL))
    testCases.append(testCase)
  return testCases

def count_non_zeroes():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCases.append([[random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))]])
  return testCases

def covariance():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCase = []
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))])
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(len(testCase[0]))])
    testCases.append(testCase)
  return testCases

def dec():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCase = []
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))])
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(len(testCase[0]))])
    testCases.append(testCase)
  return testCases

def dec_array():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCase = []
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))])
    testCase.append(random.randint(MIN_VAL, MAX_VAL))
    testCases.append(testCase)
  return testCases

def dist():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCase = []
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))])
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(len(testCase[0]))])
    testCases.append(testCase)
  return testCases

def distInf():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCase = []
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))])
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(len(testCase[0]))])
    testCases.append(testCase)
  return testCases

def dot_product():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCase = []
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))])
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(len(testCase[0]))])
    testCases.append(testCase)
  return testCases

def durbinWatson():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCases.append([[random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))]])
  return testCases

def ebeAdd():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCase = []
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))])
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(len(testCase[0]))])
    testCases.append(testCase)
  return testCases

def ebeDivide():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCase = []
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))])
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(len(testCase[0]))])
    testCases.append(testCase)
  return testCases

def ebeMultiply():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCase = []
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))])
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(len(testCase[0]))])
    testCases.append(testCase)
  return testCases

def ebeSubtract():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCase = []
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))])
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(len(testCase[0]))])
    testCases.append(testCase)
  return testCases

def elemtWise_equal():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCase = []
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))])
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(len(testCase[0]))])
    testCases.append(testCase)
  return testCases

def elemtWise_max():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCase = []
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))])
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(len(testCase[0]))])
    testCases.append(testCase)
  return testCases

def elemtWise_min():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCase = []
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))])
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(len(testCase[0]))])
    testCases.append(testCase)
  return testCases

def elemtWise_not_eq():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCase = []
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))])
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(len(testCase[0]))])
    testCases.append(testCase)
  return testCases

def entropy():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCases.append([[random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))]])
  return testCases

def equals():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCase = []
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))])
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(len(testCase[0]))])
    testCases.append(testCase)
  return testCases

def errorRate():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCase = []
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))])
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(len(testCase[0]))])
    testCases.append(testCase)
  return testCases

def euc_Dist():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCase = []
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))])
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(len(testCase[0]))])
    testCases.append(testCase)
  return testCases

def eval_Internal():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCase = []
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))])
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(len(testCase[0]))])
    testCase.append(random.randint(MIN_VAL, MAX_VAL))
    testCases.append(testCase)
  return testCases

def evalNewton():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCase = []
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))])
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(len(testCase[0]))])
    testCase.append(random.randint(MIN_VAL, MAX_VAL))
    testCases.append(testCase)
  return testCases

def evaluateHoners():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCase = []
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))])
    testCase.append(random.randint(MIN_VAL, MAX_VAL))
    testCases.append(testCase)
  return testCases

def evalWeightedProd():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCase = []
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))])
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(len(testCase[0]))])
    testCase.append(random.randint(0, len(testCase[0])-1))
    testCase.append(random.randint(0, len(testCase[0])-1-testCase[2]))
    testCases.append(testCase)
  return testCases

def find_diff():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCase = []
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))])
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(len(testCase[0]))])
    testCases.append(testCase)
  return testCases

def find_euc_Dist():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCase = []
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))])
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(len(testCase[0]))])
    testCases.append(testCase)
  return testCases

def find_magnitude():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCases.append([[random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))]])
  return testCases

def find_max():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCases.append([[random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))]])
  return testCases

def find_max2():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCases.append([[random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(2, MAX_SIZE))]])
  return testCases

def find_median():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCases.append([[random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))]])
  return testCases

def find_min():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCases.append([[random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))]])
  return testCases

def g_Test():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCase = []
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))])
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(len(testCase[0]))])
    testCases.append(testCase)
  return testCases

def geometric_mean():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCases.append([[random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))]])
  return testCases

def get_array_value():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCase = []
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))])
    testCase.append(random.randint(MIN_VAL, MAX_VAL))
    testCases.append(testCase)
  return testCases

def hamming_dist():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCase = []
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))])
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(len(testCase[0]))])
    testCases.append(testCase)
  return testCases

def harmonicMean():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCases.append([[random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))]])
  return testCases

def insertion_sort():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCases.append([[random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))]])
  return testCases

def kurtosis():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCases.append([[random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))]])
  return testCases

def lag():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCase = []
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))])
    testCase.append(random.randint(MIN_VAL, MAX_VAL))
    testCases.append(testCase)
  return testCases

def manhattanDist():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCase = []
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))])
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(len(testCase[0]))])
    testCases.append(testCase)
  return testCases

def manhattanDist2():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCase = []
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))])
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(len(testCase[0]))])
    testCases.append(testCase)
  return testCases

def max():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCases.append([[random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))]])
  return testCases

def mean_abs_error():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCase = []
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))])
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(len(testCase[0]))])
    testCases.append(testCase)
  return testCases

def mean_Diff():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCase = []
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))])
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(len(testCase[0]))])
    testCases.append(testCase)
  return testCases

def meanDeviation():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCase = []
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))])
    testCase.append(random.randint(MIN_VAL, MAX_VAL))
    testCases.append(testCase)
  return testCases

def min():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCases.append([[random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))]])
  return testCases

def partition():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCase = []
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(3, MAX_SIZE))])
    testCase.append(random.randint(0, len(testCase[0])-2)) # begin
    testCase.append(random.randint(testCase[1], len(testCase[0])-1)) # end
    testCase.append(random.randint(0, len(testCase[0])-1)) # pivot
    testCases.append(testCase)
  return testCases

def polevl():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCase = []
    testCase.append(random.randint(MIN_VAL, MAX_VAL))
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))])
    testCase.append(random.randint(0, len(testCase[1])-1))
    testCases.append(testCase)
  return testCases

def pooledMean():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCase = []
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))])
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(len(testCase[0]))])
    testCases.append(testCase)
  return testCases

def pooledVariance():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCase = []
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))])
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(len(testCase[0]))])
    testCases.append(testCase)
  return testCases

def power():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCase = []
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))])
    testCase.append(random.randint(MIN_VAL, MAX_VAL))
    testCases.append(testCase)
  return testCases

def product():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCase = []
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))])
    testCases.append(testCase)
  return testCases

def quantile():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCase = []
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))])
    testCase.append(random.randint(0, 1))
    testCases.append(testCase)
  return testCases

def reverse():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCases.append([[random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))]])
  return testCases

def s_add():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCase = []
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))])
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(len(testCase[0]))])
    testCases.append(testCase)
  return testCases

def safeNorm():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCases.append([[random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))]])
  return testCases

def sampleKurtosis(): ## Unnecessary 
  pass

def sampleSkew():
  pass

def sampleVariance():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCase = []
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))])
    testCase.append(random.randint(MIN_VAL, MAX_VAL))
    testCases.append(testCase)
  return testCases

def sampleWeightedVar():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCase = []
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))])
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(len(testCase[0]))])
    testCases.append(testCase)
  return testCases

def scale():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCase = []
    testCase.append(random.randint(MIN_VAL, MAX_VAL))
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))])
    testCases.append(testCase)
  return testCases

def selection_sort():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCases.append([[random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))]])
  return testCases

def sequential_search():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCase = []
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))])
    testCase.append(random.randint(MIN_VAL, MAX_VAL))
    testCases.append(testCase)
  return testCases

def set_min_val():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCase = []
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))])
    testCase.append(random.randint(MIN_VAL, MAX_VAL))
    testCases.append(testCase)
  return testCases

def shell_sort():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCases.append([[random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))]])
  return testCases

def skew():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCases.append([[random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))]])
  return testCases

def square():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCases.append([[random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))]])
  return testCases

def standardize():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCases.append([[random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))]])
  return testCases

def sum():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCases.append([[random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))]])
  return testCases

def sum_labeled():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCase = []
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))])
    testCase.append(random.randint(MIN_VAL, MAX_VAL))
    testCase.append(random.randint(MIN_VAL, MAX_VAL))
    testCases.append(testCase)
  return testCases

def sum_Power_Deviat():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCase = []
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))])
    testCase.append(random.randint(MIN_VAL, MAX_VAL))
    testCase.append(random.randint(MIN_VAL, MAX_VAL))
    testCases.append(testCase)
  return testCases

def sumOfLogarithms():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCases.append([[random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))]])
  return testCases

def tanimotoDist():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCase = []
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))])
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(len(testCase[0]))])
    testCases.append(testCase)
  return testCases

def var_Difference():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCase = []
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))])
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(len(testCase[0]))])
    testCases.append(testCase)
  return testCases

def variance():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCases.append([[random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))]])
  return testCases

def weighted_average():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCase = []
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))])
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(len(testCase[0]))])
    testCases.append(testCase)
  return testCases

def weightedMean():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCase = []
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))])
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(len(testCase[0]))])
    testCases.append(testCase)
  return testCases

def weightedRMS():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCase = []
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(MIN_SIZE, MAX_SIZE))])
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(len(testCase[0]))])
    testCases.append(testCase)
  return testCases

def winsorizedMean():
  testCases = []
  for _ in range(NUMBER_OF_TEST_CASES):
    testCase = []
    testCase.append([random.randint(MIN_VAL, MAX_VAL) for _ in range(random.randint(3, MAX_SIZE))])
    testCase.append(random.randint(0, len(testCase[0])-2))
    testCase.append(random.randint(testCase[1], len(testCase[0])-1))
    testCases.append(testCase)
  return testCases



FUNCS = [
product,
euc_Dist,
clip,
variance,
g_Test,
cal_DividedDiff,
mean_Diff,
sum,
scale,
dot_product,
ebeMultiply,
meanDeviation,
durbinWatson,
find_max,
manhattanDist2,
geometric_mean,
min,
bubble,
sequential_search,
errorRate,
manhattanDist,
entropy,
skew,
chiSquare,
autoCorrelation,
mean_abs_error,
standardize,
harmonicMean,
cosineDistance,
ebeDivide,
weightedMean,
count_k,
eval_Internal,
insertion_sort,
weightedRMS,
evalWeightedProd,
lag,
winsorizedMean,
count_non_zeroes,
array_copy,
ebeSubtract,
hamming_dist,
dec_array,
chebyshevDist,
cal_Diff,
partition,
safeNorm,
ebeAdd,
canberraDist,
elemtWise_max,
evalNewton,
kurtosis,
dist,
find_max2,
quantile,
sum_Power_Deviat,
power,
set_min_val,
get_array_value,
sum_labeled,
evaluateHoners,
array_calc,
find_median,
cal_AbsoluteDiff,
bi_SearchFromTo,
polevl,
square,
find_euc_Dist,
distInf,
find_magnitude,
find_diff,
weighted_average,
pooledVariance,
sampleVariance,
pooledMean,
sampleWeightedVar,
elemtWise_min,
shell_sort,
covariance,
cnt_zeroes,
max,
sumOfLogarithms,
selection_sort,
var_Difference,
add_values,
tanimotoDist,
average,
reverse,
find_min,
]



def main():
  with open("testCases.txt", "w") as f:
    for func in FUNCS:
      print(func.__name__)
      testCases = func()
      line = str(func.__name__)
      for testCase in testCases:
        line += "#"
        for param in testCase:
          if type(param) == list:
            line += "[" + ",".join(list(map(str,param))) + "];"
          else:
            line += str(param) + ";"
        line = line.rstrip(';')
      line += "\n"
      print(line)
      f.write(line)
    f.close()

if __name__ == "__main__":
  main()