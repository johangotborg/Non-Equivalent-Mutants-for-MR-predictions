package data_set.mean_abs_error.mutations;
// This is a mutant program.
// Author : ysma

public class mean_abs_error_VDL_4
{

    public static  double mean_abs_error_VDL_4( java.lang.Integer[] a, java.lang.Integer[] b )
    {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += Math.abs( a[i] );
        }
        return (double) sum / a.length;
    }

}