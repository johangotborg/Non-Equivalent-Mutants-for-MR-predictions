package data_set.ebeMultiply.mutations;
// This is a mutant program.
// Author : ysma

public class ebeMultiply_ODL_6
{

    public static  java.lang.Double[] ebeMultiply_ODL_6( java.lang.Double[] a, java.lang.Double[] b )
    {
        if (a.length != b.length) {
            return null;
        }
        final java.lang.Double[] result = a.clone();
        for (int i = 0; i < a.length; i++) {
            result[i] = b[i];
        }
        return result;
    }

}
