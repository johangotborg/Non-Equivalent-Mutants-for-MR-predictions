package data_set.ebeDivide.mutations;
// This is a mutant program.
// Author : ysma

public class ebeDivide_VDL_2
{

    public static  java.lang.Double[] ebeDivide_VDL_2( java.lang.Double[] a, java.lang.Double[] b )
    {
        if (a.length != b.length) {
            return null;
        }
        final java.lang.Double[] result = a.clone();
        for (int i = 0; i < a.length;  ) {
            result[i] /= b[i];
        }
        return result;
    }

}
