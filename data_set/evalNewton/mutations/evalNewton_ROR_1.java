package data_set.evalNewton.mutations;
// This is a mutant program.
// Author : ysma

public class evalNewton_ROR_1
{

    public static  double evalNewton_ROR_1( java.lang.Double[] a, java.lang.Double[] c, java.lang.Double z )
    {
        final int n = c.length - 1;
        double value = a[n];
        for (int i = n - 1; i > 0; i--) {
            value = a[i] + (z - c[i]) * value;
        }
        return value;
    }

}
