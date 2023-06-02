package data_set.geometric_mean.mutations;
// This is a mutant program.
// Author : ysma

public class geometric_mean_LOI_1
{

    public static  double geometric_mean_LOI_1( java.lang.Integer[] a )
    {
        long product = 1;
        for (int i = 0; ~i < a.length; i++) {
            product *= a[i];
        }
        return Math.pow( product, (double) 1 / a.length );
    }

}
