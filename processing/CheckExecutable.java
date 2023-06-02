package processing;


public class CheckExecutable {
    
  static int infiniteLoopTimeoutEquivalence = 10000;
  static int infiniteLoopTimeoutMetamorphic = 5000;
  static int testEquivalenceMaxAmount = 100;
  static int testMetamorphicMaxAmount = 1000;




  public static void isNonEquivalent(Executable original, Executable mutant, Object[][] testCases) throws Exception {
    DidOriginal didOg = new DidOriginal();
    Integer failedToExecuteAmount = 0;
    for (Object[] testCase : testCases) {
      if (!mutant.isExecutable) {
        break;
      }
      threadEquivalence thread = new threadEquivalence();
      didOg.didOriginalBoolean = false;
      thread.set(original, mutant, testCase, failedToExecuteAmount, didOg);
      thread.start();
      thread.join(infiniteLoopTimeoutEquivalence);
      if (thread.isAlive()) {
        if (didOg.didOriginalBoolean) {
          mutant.setIsNonEquivalent(true);
        }
        thread.interrupt();
        break;
      }
      if (failedToExecuteAmount == testCases.length) {
        mutant.setAllMetamorphic(false);
      }
      if (mutant.isNonEquivalent) {
        break;
      }

    }
  }

  public static void checkMetamorphicRelations(Executable ex, Object[][] testCases) throws Exception {
    
    System.out.println(ex.method.getName());
    for (Object[] testCase : testCases) {
      if (!ex.isExecutable) {
        break;
      } 
      ThreadMetamorphic thread = new ThreadMetamorphic();
      thread.set(ex, testCase);
      thread.start();
      thread.join(infiniteLoopTimeoutMetamorphic);
      if (thread.isAlive()) {
        thread.interrupt();
        break;
      }
      if (!ex.isPermutative && !ex.isAdditive && !ex.isInclusive) {
        break;
      }
    }
  }

  static class DidOriginal {
    static Boolean didOriginalBoolean = false;
  }

}
