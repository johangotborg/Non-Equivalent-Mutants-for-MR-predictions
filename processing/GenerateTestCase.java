package processing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;

import java.util.HashMap;

public class GenerateTestCase {
    

  String readString = System.getProperty("user.dir") + "\\processing\\tests\\testCases.csv";
  BufferedReader reader;

  HashMap<String, String[]> rawTests = new HashMap<>();


  public GenerateTestCase() {
    try{
      reader = new BufferedReader(new FileReader(new File(readString)));
      String line;
      while ((line = reader.readLine()) != null) {
        String[] values = line.split("#");
        String[] tests = new String[values.length-1];
        System.arraycopy(values, 1, tests, 0, values.length-1);
        rawTests.put(String.format("%s_m",values[0]), tests);
      }
    } catch (IOException ioe) {
      System.out.println("Failed to load tests-file");
    }

  }


  public Object[][] getTestCases(Executable ex) {
    String[] rawTestCases = rawTests.get(ex.method.getName());
    if (rawTestCases == null) {
      return null;
    }
    Object[][] testCases = new Object[rawTestCases.length][ex.paramTypes.length];
    for (int i=0; i<testCases.length; i++) {
      Object[] testCase = new Object[ex.paramTypes.length];
      String[] rawTestCase = rawTestCases[i].split(";");
      for (int j=0; j<testCase.length; j++) {
        try {
          testCase[j] = convertRawTest(rawTestCase[j], ex.paramTypes[j]);
        } catch (Exception e) {
          System.out.println(e.getMessage());
          System.exit(1);
        }
      }
      testCases[i] = testCase;
    }
    return testCases;
  }

  public Object[][] getTestCases(String methodName, Executable ex) {
    String[] rawTestCases = rawTests.get(methodName);
    if (rawTestCases == null) {
      return null;
    }
    Object[][] testCases = new Object[rawTestCases.length][ex.paramTypes.length];
    for (int i=0; i<testCases.length; i++) {
      Object[] testCase = new Object[ex.paramTypes.length];
      String[] rawTestCase = rawTestCases[i].split(";");
      for (int j=0; j<testCase.length; j++) {
        try {
          testCase[j] = convertRawTest(rawTestCase[j], ex.paramTypes[j]);
        } catch (Exception e) {
          System.out.println(e.getMessage());
          System.exit(1);
        }
      }
      testCases[i] = testCase;
    }
    return testCases;
  }


  public Object convertRawTest(String rawParam, Class<?> paramType) throws Exception {
    if (paramType == int.class) {
      return (int) Integer.parseInt(rawParam);
    } 
    else if (paramType == Integer.class) {
      return Integer.parseInt(rawParam);
    } else if (paramType == double.class) {
      return (double) Double.parseDouble(rawParam);
    } else if (paramType == Double.class) {
      return Double.parseDouble(rawParam);
    } else if (paramType == int[].class) {
      String[] rawParamArray = rawParam.substring(1, rawParam.length()-1).split(",");
      int[] paramInt = new int[rawParamArray.length];
      int i=0;
      for (String value : rawParamArray) {
        paramInt[i++] = (int) Integer.parseInt(value);
      }
      return paramInt;
    } else if (paramType == Integer[].class) {
      String[] rawParamArray = rawParam.substring(1, rawParam.length()-1).split(",");
      Integer[] paramInt = new Integer[rawParamArray.length];
      int i=0;
      for (String value : rawParamArray) {
        paramInt[i++] = Integer.parseInt(value);
      }
      return paramInt;
    } else if (paramType == double[].class) {
      String[] rawParamArray = rawParam.substring(1, rawParam.length()-1).split(",");
      double[] paramInt = new double[rawParamArray.length];
      int i=0;
      for (String value : rawParamArray) {
        paramInt[i++] = (double) Double.parseDouble(value);
      }
      return paramInt;
    } else if (paramType == Double[].class) {
      String[] rawParamArray = rawParam.substring(1, rawParam.length()-1).split(",");
      Double[] paramInt = new Double[rawParamArray.length];
      int i=0;
      for (String value : rawParamArray) {
        paramInt[i++] = Double.parseDouble(value);
      }
      return paramInt;
    }
    throw new Exception(String.format("Incompatible parameter type %s", paramType.toString()));
  }
}
