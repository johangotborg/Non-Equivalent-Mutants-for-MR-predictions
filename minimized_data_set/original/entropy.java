package minimized_data_set.original;
// This is a mutant program.
// Author : ysma

public class entropy
{

    public static  double entropy_m( final java.lang.Double[] k )
    {
        double h = 0d;
        double sum_k = 0d;
        for (int i = 0; i < k.length; i++) {
            sum_k += (double) k[i];
        }
        for (int i = 0; i < k.length; i++) {
            if (k[i] != 0) {
                final double p_i = (double) k[i] / sum_k;
                h += p_i * Math.log( p_i );
            }
        }
        return -h;
    }

}
