package data_set.evalNewton.mutations;
// This is a mutant program.
// Author : ysma

public class evalNewton_VDL_4
{

    public static  double evalNewton_VDL_4( java.lang.Double[] a, java.lang.Double[] c, java.lang.Double z )
    {
        final int n = c.length - 1;
        double value = a[n];
        for (int i = n - 1; i >= 0; i--) {
            value = a[i] + (c[i]) * value;
        }
        return value;
    }

}
