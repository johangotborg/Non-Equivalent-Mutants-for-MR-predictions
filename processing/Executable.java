package processing;
import java.lang.reflect.Method;


public class Executable {

  public final Class<?> Class;
  public final Method method;
  public final Class<?>[] paramTypes;
  public final Class<?> returnType;

  public boolean isExecutable = true;
  public boolean isNonEquivalent = false;

  public boolean isAdditive = true;
  public boolean isPermutative = true;
  public boolean isInclusive = true;

  public int numberSuccessfulMetamorphicTests = 0;
  public boolean undecisiveMetamorphicEvaluation = false;

  public Executable(Class<?> c, Method m, Class<?>[] p, Class<?> r) {
    this.Class = c;
    this.method = m;
    this.paramTypes = p;
    this.returnType = r;
  }

  public void setExecutableStatus(boolean tf) {
    this.isExecutable = tf;
  }

  public void setIsNonEquivalent(boolean tf) {
    this.isNonEquivalent = tf;
  }

  public void setIsPermutative(boolean tf) {
    this.isPermutative = tf;
  }

  public void setIsAdditive(boolean tf) {
    this.isAdditive = tf;
  }

  public void setIsInclusive(boolean tf) {
    this.isInclusive = tf;
  }

  public void setAllMetamorphic(boolean tf) {
    this.isPermutative = tf;
    this.isAdditive = tf;
    this.isInclusive = tf;
  }


}