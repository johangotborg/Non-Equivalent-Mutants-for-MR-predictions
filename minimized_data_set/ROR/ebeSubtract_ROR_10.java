package minimized_data_set.ROR;
// This is a mutant program.
// Author : ysma

public class ebeSubtract_ROR_10
{

    public static  java.lang.Double[] ebeSubtract_ROR_10( java.lang.Double[] a, java.lang.Double[] b )
    {
        if (a.length != b.length) {
            return null;
        }
        final java.lang.Double[] result = a.clone();
        for (int i = 0; i <= a.length; i++) {
            result[i] -= b[i];
        }
        return result;
    }

}
