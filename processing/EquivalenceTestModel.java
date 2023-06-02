package processing;

import java.util.ArrayList;
import java.util.HashMap;

public class EquivalenceTestModel {

  HashMap<Class<?>, ArrayList<Class<?>>> classMap;
  HashMap<Executable, Executable[]> execMap;

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
    // new EquivalenceTestModel().runEquivalence();();
    new EquivalenceTestModel().runEquivalenceAll();
  }
  

  public void runEquivalence() {
    try {
      classMap = processor.LoadClasses();

    } catch (ClassNotFoundException e) {
      System.err.println("ClassNotFoundException");
      System.exit(1);
    }
    execMap = processor.MapToExecutable(classMap);
    execMap = processor.FilterExecutables(execMap);
    try {
       for (Executable og : execMap.keySet()) {
        processor.writeMinimizedDataSet(og);
       }
       for (String operator : operators) {
        for (Executable original : execMap.keySet()) {
          mutantPosition = 0;
          Object[][] testCases = testGenerator.getTestCases(original);
          while (true) {
            Executable mutant = processor.getNaiveMutant(execMap.get(original), operator);
            if (mutant == null) {
              break;
            }
            CheckExecutable.isNonEquivalent(original, mutant, testCases);
            if (mutant.isNonEquivalent) {
              processor.writeMinimizedDataSet(mutant);
              break;  
            }
          }
        }
      }
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    System.exit(0);
  }

  public void runEquivalenceAll() {
    try {
      classMap = processor.LoadClasses();

    } catch (ClassNotFoundException e) {
      System.err.println("ClassNotFoundException");
      System.exit(1);
    }
    execMap = processor.MapToExecutable(classMap);
    execMap = processor.FilterExecutables(execMap);
    try {
      for (Executable original : execMap.keySet()) {
        if (original.method.getName().equals("safeNorm_m")) {
          System.out.println(original.method.getName());
          int numberNonEquivalent = 0;
          int numberMutants = execMap.get(original).length;

          Object[][] testCases = testGenerator.getTestCases(original);
          for (Executable mutant : execMap.get(original)) {
            CheckExecutable.isNonEquivalent(original, mutant, testCases);
            if (mutant.isNonEquivalent) {
              numberNonEquivalent++;
            } else {
              System.out.println(mutant.method.getName());
            }
          }
          System.out.println(String.format("Method: %s%n Number of mutants: %d%n Number of non-equivalent mutants: %d", original.method.getName(), numberMutants, numberNonEquivalent));
        }
      }
    } catch (Exception e) {
        System.out.println(e.getMessage());
    }
    System.exit(0);
  }



}
