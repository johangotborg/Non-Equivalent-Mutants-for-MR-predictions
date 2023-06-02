package minimized_data_set.AORS;
// This is a mutant program.
// Author : ysma

public class ebeAdd_AORS_1
{

    public static  java.lang.Double[] ebeAdd_AORS_1( java.lang.Double[] a, java.lang.Double[] b )
    {
        if (a.length != b.length) {
            return null;
        }
        final java.lang.Double[] result = a.clone();
        for (int i = 0; i < a.length; i--) {
            result[i] += b[i];
        }
        return result;
    }

}
