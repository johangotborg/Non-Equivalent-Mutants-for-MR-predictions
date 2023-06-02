package minimized_data_set.original;
// This is a mutant program.
// Author : ysma

public class evalNewton
{

    public static  double evalNewton_m( java.lang.Double[] a, java.lang.Double[] c, java.lang.Double z )
    {
        final int n = c.length - 1;
        double value = a[n];
        for (int i = n - 1; i >= 0; i--) {
            value = a[i] + (z - c[i]) * value;
        }
        return value;
    }

}
