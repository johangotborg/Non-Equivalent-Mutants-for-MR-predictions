package processing;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.lang.reflect.InvocationTargetException;

public class ThreadMetamorphic extends Thread {
  
  Executable executable;
  Object[] preParams;
  Object[] postParamsPermutative;
  Object[] postParamsAdditive;
  Object[] postParamsInclusive;

  static double errorLimitFloatingPoint = 1e-8;

  public void set(Executable ex, Object[] p) {
      executable = ex;
      preParams = p;

      if (ex.isPermutative) {
        postParamsPermutative = transformPermutative((Object[]) PipedDeepCopy.copy(preParams));
      }
      if (ex.isAdditive) {
        postParamsAdditive = transformAdditive((Object[]) PipedDeepCopy.copy(preParams));
      }
      if (ex.isInclusive) {
        postParamsInclusive = transformInclusive((Object[]) PipedDeepCopy.copy(preParams));
      }
    }

  @Override
  public void run() throws RuntimeException {
    if (!executable.isPermutative && !executable.isAdditive && !executable.isInclusive) {
      return;
    }

    Object preResult = null;
    try {
      // Base-case
      preResult = executable.method.invoke(null, preParams);

    } catch (IllegalAccessException iae) {
      executable.setExecutableStatus(false);
      return;
    } catch (InvocationTargetException ite) {
      executable.setExecutableStatus(true);
      return;
    } catch (IllegalArgumentException iae) {
      executable.setExecutableStatus(false);
      return;
    } catch (Exception e) {
      return;
    }

    try {
      // Permutative
      if (preResult != null && executable.isPermutative) {
        Object postResultPermutative = executable.method.invoke(null, postParamsPermutative);
        executable.setIsPermutative(evaluateConstant(preResult, postResultPermutative, executable.returnType));
      }
    } catch (IllegalAccessException iae) {
    } catch (InvocationTargetException ite) {
    } catch (IllegalArgumentException iae) {
    } catch (Exception e) {
    }

    try {
      // Additive
      if (preResult != null && executable.isAdditive) {
        Object postResultAdditive = executable.method.invoke(null, postParamsAdditive);
        executable.setIsAdditive((evaluateEqualOrIncreased(preResult, postResultAdditive, executable.returnType)));
      }
    } catch (IllegalAccessException iae) {
    } catch (InvocationTargetException ite) {
    } catch (IllegalArgumentException iae) {
    } catch (Exception e) {
    }

    
    try {
      // Inclusive
      if (preResult != null && executable.isInclusive) {
        Object postResultInclusive = executable.method.invoke(null, postParamsInclusive);
        executable.setIsInclusive((evaluateEqualOrIncreased(preResult, postResultInclusive, executable.returnType)));
      }
    } catch (IllegalAccessException iae) {
    } catch (InvocationTargetException ite) {
    } catch (IllegalArgumentException iae) {
    } catch (Exception e) {
    }
  }

  public static Object[] transformPermutative(Object[] testCase) {
    Object[] newTestCase = new Object[testCase.length];
    for (int i=0; i<testCase.length; i++) {
      Class<?> type = testCase[i].getClass();
      if (type == int[].class) {
        int[] arr = new int[((int[]) testCase[i]).length];
        List<Integer> rePositioning = getRandomPositioning(arr.length);
        for (int j=0; j<arr.length; j++) {
          arr[rePositioning.get(j)] = ((int[]) testCase[i])[j];
        }
        newTestCase[i] = arr;
      } else if (type == Integer[].class) {
        Integer[] arr = new Integer[((Integer[]) testCase[i]).length];
        List<Integer> rePositioning = getRandomPositioning(arr.length);
        for (int j=0; j<arr.length; j++) {
          arr[rePositioning.get(j)] = ((Integer[]) testCase[i])[j];
        }
        newTestCase[i] = arr;
      } else if (type == double[].class) {
        double[] arr = new double[((double[]) testCase[i]).length];
        List<Integer> rePositioning = getRandomPositioning(arr.length);
        for (int j=0; j<arr.length; j++) {
          arr[rePositioning.get(j)] = ((double[]) testCase[i])[j];
        }
        newTestCase[i] = arr;
      } else if (type == Double[].class) {
        Double[] arr = new Double[((Double[]) testCase[i]).length];
        List<Integer> rePositioning = getRandomPositioning(arr.length);
        for (int j=0; j<arr.length; j++) {
          arr[rePositioning.get(j)] = ((Double[]) testCase[i])[j];
        }
        newTestCase[i] = arr;
      } else {
        newTestCase[i] = testCase[i];
      }
    }
    return newTestCase;

  }

  public static Object[] transformAdditive(Object[] testCase) {
    Object[] newTestCase = new Object[testCase.length];
    Integer constant = 1; // Math.abs(generateTestCase.genInt());
    for (int i=0; i<testCase.length; i++) {
      Class<?> type = testCase[i].getClass();
      if (type == int[].class) {
        int[] arr = new int[((int[]) testCase[i]).length];
        for (int j=0; j<arr.length; j++) {
          arr[j] = ((int[]) testCase[i])[j] + constant;
        }
        newTestCase[i] = arr;
      } else if (type == Integer[].class) {
        Integer[] arr = new Integer[((Integer[]) testCase[i]).length];
        for (int j=0; j<arr.length; j++) {
          arr[j] = ((Integer[]) testCase[i])[j] + constant;
        }
        newTestCase[i] = arr;
      } else if (type == double[].class) {
        double[] arr = new double[((double[]) testCase[i]).length];
        for (int j=0; j<arr.length; j++) {
          arr[j] = ((double[]) testCase[i])[j] + (double) constant;
        }
        newTestCase[i] = arr;
      } else if (type == Double[].class) {
        Double[] arr = new Double[((Double[]) testCase[i]).length];
        for (int j=0; j<arr.length; j++) {
          arr[j] = ((Double[]) testCase[i])[j] + Double.valueOf(constant);
        }
        newTestCase[i] = arr;
      } else {
        newTestCase[i] = testCase[i];
      }
    }
    return newTestCase;
  }



  public static Object[] transformInclusive(Object[] testCase) {
    Object[] newTestCase = new Object[testCase.length];
    for (int i=0; i<testCase.length; i++) {
      Class<?> type = testCase[i].getClass();
      if (type == int[].class) {
        int[] arr = new int[((int[]) testCase[i]).length + 1];
        for (int j=0; j<((int[]) testCase[i]).length; j++) {
          arr[j] = ((int[]) testCase[i])[j];
        }
        arr[arr.length-1] = 1;
        newTestCase[i] = arr;
      } else if (type == Integer[].class) {
        Integer[] arr = new Integer[((Integer[]) testCase[i]).length + 1];
        for (int j=0; j<((Integer[]) testCase[i]).length; j++) {
          arr[j] = ((Integer[]) testCase[i])[j];
        }
        arr[arr.length-1] = 1;
        newTestCase[i] = arr;
      } else if (type == double[].class) {
        double[] arr = new double[((double[]) testCase[i]).length + 1];
        for (int j=0; j<((double[]) testCase[i]).length; j++) {
          arr[j] = ((double[]) testCase[i])[j];
        }
        arr[arr.length-1] = 1;
        newTestCase[i] = arr;
      } else if (type == Double[].class) {
        Double[] arr = new Double[((Double[]) testCase[i]).length + 1];
        for (int j=0; j<((Double[]) testCase[i]).length; j++) {
          arr[j] = ((Double[]) testCase[i])[j];
        }
        arr[arr.length-1] = 1.0;
        newTestCase[i] = arr;
      } else {
        newTestCase[i] = testCase[i];
      }
    }
    return newTestCase;

  }

  public static boolean evaluateConstant(Object preResult, Object postResult, Class<?> returnType) throws Exception{
    if (returnType == int[].class) {
      if (((int[]) preResult).length == ((int[]) postResult).length) {
        for (int i=0; i<((int[]) preResult).length; i++) {
          if (!InfNanEqualityCheck(((int[])preResult)[i], ((int[])postResult)[i], int.class)) {
            return false;
          }
        }
        return true;
      }
    } else if (returnType == Integer[].class) {
      if (((Integer[]) preResult).length == ((Integer[]) postResult).length) {
        for (int i=0; i<((Integer[]) preResult).length; i++) {
          if (!InfNanEqualityCheck(((Integer[])preResult)[i], ((Integer[])postResult)[i], Integer.class)) {
            return false;
          }
        }
        return true;
      }
    } else if (returnType == double[].class) {
      if (((double[]) preResult).length == ((double[]) postResult).length) {
        for (int i=0; i<((double[]) preResult).length; i++) {
          if (!InfNanEqualityCheck(((double[])preResult)[i], ((double[])postResult)[i], double.class)) {
            return false;
          }
        }
        return true;
      }
    } else if (returnType == Double[].class) {
      if (((Double[]) preResult).length == ((Double[]) postResult).length) {
        for (int i=0; i<((Double[]) preResult).length; i++) {
          if (!InfNanEqualityCheck(((Double[])preResult)[i], ((Double[])postResult)[i], Double.class)) {
            return false;
          }
        }
        return true;
      }
    } 
    return InfNanEqualityCheck(preResult, postResult, returnType);
  }


  public static boolean evaluateEqualOrIncreased(Object preResult, Object postResult, Class<?> returnType) throws Exception {
    if (returnType == int[].class) {
      int preSum = 0;
      int postSum = 0;
      for (int preVal : (int[]) preResult) {
        preSum += preVal;
      }
      for (int postVal : (int[]) postResult) {
        postSum += postVal;
      }
      if (InfNanEqualityCheck(preSum, postSum, int.class)) {
        return true;
      }
      return preSum < postSum;
    } else if (returnType == Integer[].class) {
      Integer preSum = 0;
      Integer postSum = 0;
      for (Integer preVal : (Integer[]) preResult) {
        preSum += preVal;
      }
      for (Integer postVal : (Integer[]) postResult) {
        postSum += postVal;
      }
      if (InfNanEqualityCheck(preSum, postSum, Integer.class)) {
        return true;
      }
      return preSum < postSum;
    } else if (returnType == double[].class) {
      double preSum = 0.0;
      double postSum = 0.0;
      for (double preVal : (double[]) preResult) {
        preSum += preVal;
      }
      for (double postVal : (double[]) postResult) {
        postSum += postVal;
      }
      if (InfNanEqualityCheck(preSum, postSum, double.class)) {
        return true;
      }
      return preSum < postSum;
    } else if (returnType == Double[].class) {
      Double preSum = 0.0;
      Double postSum = 0.0;
      for (Double preVal : (Double[]) preResult) {
        preSum += preVal;
      }
      for (Double postVal : (Double[]) postResult) {
        postSum += postVal;
      }
      if (InfNanEqualityCheck(preSum, postSum, Double.class)) {
        return true;
      }
      return preSum < postSum;
    }
    if (InfNanEqualityCheck(preResult, postResult, returnType)) {
      return true;
    } else if (returnType == int.class) {
      return (int) preResult < (int) postResult;
    } else if (returnType == Integer.class) {
      return (Integer) preResult < (Integer) postResult;
    } else if (returnType == double.class) {
      return (double) preResult < (double) postResult;
    } else if (returnType == Double.class) {
      return (Double) preResult < (Double) postResult;
    }
    throw new Exception("Incompatible returnType caused verification to fail");
  }

  public static List<Integer> getRandomPositioning(int size) {
    List<Integer> arr = IntStream.range(0, size).boxed().collect(Collectors.toList());
    Collections.shuffle(arr);
    return arr;
  }

  public static boolean InfNanEqualityCheck(Object res1, Object res2, Class<?> type) throws Exception {
    if (type == int.class) {
      if (Double.isNaN((int) res1)) {
        return Double.isNaN((int) res2);
      } else if (Double.isInfinite((int) res1)) {
        return Double.isInfinite((int) res2);
      } else {
        return (int) res1 == (int) res2;
      }
    } else if (type == Integer.class) {
      if (Double.isNaN((Integer) res1)) {
        return Double.isNaN((Integer) res2);
      } else if (Double.isInfinite((Integer) res1)) {
        return Double.isInfinite((Integer) res2);
      } else {
        return ((Integer) res1).equals((Integer) res2);
      }
    } else if (type == double.class) {
      if (Double.isNaN((double) res1)) {
        return Double.isNaN((double) res2);
      } else if (Double.isInfinite((double) res1)) {
        return Double.isInfinite((double) res2);
      } else {
        return Math.abs((double) res1 - (double) res2) <= errorLimitFloatingPoint;
      }
    } else if (type == Double.class) {
      if (Double.isNaN((Double) res1)) {
        return Double.isNaN((Double) res2);
      } else if (Double.isInfinite((Double) res1)) {
        return Double.isInfinite((Double) res2);
      } else {
        return Math.abs((Double) res1 - (Double) res2) <= errorLimitFloatingPoint;
      }
    }
    throw new Exception("Failed to perform InfNanEqualityCheck due to incompatible type");
  }
}
