package data_set.evalNewton.mutations;
// This is a mutant program.
// Author : ysma

public class evalNewton_ODL_9
{

    public static  double evalNewton_ODL_9( java.lang.Double[] a, java.lang.Double[] c, java.lang.Double z )
    {
        final int n = c.length - 1;
        double value = a[n];
        for (int i = n - 1; i >= 0; i--) {
            value = a[i] + (c[i]) * value;
        }
        return value;
    }

}
