package processing;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.HashMap;
import java.util.Map;

import java.lang.reflect.Method;

public class MetamorphicTestModel {


  String writeString = System.getProperty("user.dir") + "\\info\\";
  String writeStringEquivalence = System.getProperty("user.dir") + "\\info\\equivalence\\";
  String writeStringAll = System.getProperty("user.dir") + "\\info\\AllExecutables";

  String readString = System.getProperty("user.dir") + "\\data_set\\";
  String readStringMinimized = System.getProperty("user.dir") + "\\minimized_data_set\\";
  ClassLoader classLoader = ClassLoader.getSystemClassLoader();

  String majorPath = System.getProperty("user.dir") + "\\muJava_output\\";

  HashMap<Class<?>, ArrayList<Class<?>>> classMap;
  HashMap<Executable, Executable[]> execMap;
  ArrayList<Class<?>> classList;
  Executable[] execList;

  GenerateTestCase testGenerator = new GenerateTestCase();
  Processing processor = new Processing();

  boolean[] isExecutableMutant;
  boolean[] isExecutableOriginal;

  int operatorIndex = 0;
  String[] operators = new String[] {
    "original",
    "AODU",
    "AOIS",
    "AOIU",
    "AORB",
    "AORS",
    "ASRS",
    "CDL",
    "COI",
    "COR",
    "LOI",
    "ODL",
    "ROR",
    "SDL",
    "VDL"
  };

  ArrayList<String> minimized = new ArrayList<>();
  Integer mutantPosition;



  public static void main(String[] args) {
    new MetamorphicTestModel().runMetamorphic();
  }


  public void runMetamorphic() {
    String operator = operators[6];
    File path = new File(readStringMinimized + operator);
    try {
      classList = processor.LoadClasses(path);
    } catch (ClassNotFoundException e) {
      System.err.println("ClassNotFoundException");
      System.exit(1);
    }
    
    execList = processor.MapToExecutable(classList);

    try {
      for (Executable ex : execList) {
        if (operator.equals("original")) {
          Object[][] testCases = testGenerator.getTestCases(ex);
          CheckExecutable.checkMetamorphicRelations(ex, testCases);
        } else {
          String[] nameArr = ex.method.getName().split("_");
          String[] newArr = new String[nameArr.length-2];
          System.arraycopy(nameArr,0,newArr,0, newArr.length);
          String methodName = String.join("_", newArr) + "_m";
          Object[][] testCases = testGenerator.getTestCases(methodName, ex);
          CheckExecutable.checkMetamorphicRelations(ex, testCases);
        }
        /** Appends to existing files */
        // processor.writeMetamorphicLabels(ex, System.getProperty("user.dir") + String.format("\\minimized_data_set\\%s\\labels\\%s", operator, operator));
      }
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    System.exit(0);
  }

  
}
