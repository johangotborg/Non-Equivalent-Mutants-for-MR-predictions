package minimized_data_set.ODL;
// This is a mutant program.
// Author : ysma

public class ebeAdd_ODL_6
{

    public static  java.lang.Double[] ebeAdd_ODL_6( java.lang.Double[] a, java.lang.Double[] b )
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
