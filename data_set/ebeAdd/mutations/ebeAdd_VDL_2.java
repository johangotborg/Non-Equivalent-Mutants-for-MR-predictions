package data_set.ebeAdd.mutations;
// This is a mutant program.
// Author : ysma

public class ebeAdd_VDL_2
{

    public static  java.lang.Double[] ebeAdd_VDL_2( java.lang.Double[] a, java.lang.Double[] b )
    {
        if (a.length != b.length) {
            return null;
        }
        final java.lang.Double[] result = a.clone();
        for (int i = 0; i < a.length;  ) {
            result[i] += b[i];
        }
        return result;
    }

}
