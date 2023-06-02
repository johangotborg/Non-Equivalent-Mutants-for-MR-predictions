package processing;

import java.lang.reflect.InvocationTargetException;

import java.util.Objects;

import processing.CheckExecutable.DidOriginal;

public class ThreadEquivalence extends Thread {
  
  Object[] ogParams;
  Object[] mutantParams;
  Executable original;
  Executable mutant;
  DidOriginal didOriginal;

  Integer failedToExecuteAmount;

  public void set(Executable original, Executable mutant, Object[] p, Integer failedToExecuteAmount, DidOriginal didOriginal) {
      this.original = original;
      this.mutant = mutant;
      this.didOriginal = didOriginal;
      ogParams = p;
      mutantParams = (Object[]) PipedDeepCopy.copy(p);

      this.failedToExecuteAmount = failedToExecuteAmount;
  }


  @Override
  public void run() throws RuntimeException {
    Object ogResult = null;  
    try {
        ogResult = original.method.invoke(null, ogParams);
      } catch (IllegalAccessException iae) {
        original.setExecutableStatus(false);
        return;
      } catch (InvocationTargetException ite) {
        original.setExecutableStatus(true);
        return;
      } catch (IllegalArgumentException iae) {
        original.setExecutableStatus(false);
        return;

      }
    didOriginal.didOriginalBoolean = true;
    try {
      Object mutantResult = mutant.method.invoke(null, mutantParams);
      if (!Objects.deepEquals(mutantResult, ogResult)) {
        mutant.setIsNonEquivalent(true);
      }

    }catch (IllegalAccessException iae) {
      mutant.setExecutableStatus(false);
    } catch (InvocationTargetException ite) {
      mutant.setIsNonEquivalent(true);
      mutant.setExecutableStatus(true);
    } catch (IllegalArgumentException iae) {
      mutant.setExecutableStatus(false);
    } catch (Exception e) {
      // mutant.setIsNonEquivalent(true);
    }
  }
}