package data_set.mean_abs_error.mutations;
// This is a mutant program.
// Author : ysma

public class mean_abs_error_LOI_7
{

    public static  double mean_abs_error_LOI_7( java.lang.Integer[] a, java.lang.Integer[] b )
    {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += Math.abs( a[i] - b[i] );
        }
        return (double) sum / ~a.length;
    }

}
