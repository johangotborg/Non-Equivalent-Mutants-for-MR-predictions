package minimized_data_set.LOI;
// This is a mutant program.
// Author : ysma

public class ebeDivide_LOI_1
{

    public static  java.lang.Double[] ebeDivide_LOI_1( java.lang.Double[] a, java.lang.Double[] b )
    {
        if (~a.length != b.length) {
            return null;
        }
        final java.lang.Double[] result = a.clone();
        for (int i = 0; i < a.length; i++) {
            result[i] /= b[i];
        }
        return result;
    }

}
