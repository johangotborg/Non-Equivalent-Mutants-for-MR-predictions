package minimized_data_set.ODL;
// This is a mutant program.
// Author : ysma

public class geometric_mean_ODL_4
{

    public static  double geometric_mean_ODL_4( java.lang.Integer[] a )
    {
        long product = 1;
        for (int i = 0; i < a.length; i++) {
            product = a[i];
        }
        return Math.pow( product, (double) 1 / a.length );
    }

}
