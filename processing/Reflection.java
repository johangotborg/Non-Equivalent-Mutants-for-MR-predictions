package processing;
import java.lang.reflect.Method;

public final class Reflection {
    

    public static Method getMethod(Class<?> cl) {
        return cl.getDeclaredMethods()[0];
    }

    public static Class<?>[] getParameterTypes(Method method) {
        return method.getParameterTypes();
    }

    public static Class<?> getReturnTypes(Method method) {
        return method.getReturnType();
    }

}