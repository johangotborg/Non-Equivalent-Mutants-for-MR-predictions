package minimized_data_set.AOIU;
// This is a mutant program.
// Author : ysma

public class mean_abs_error_AOIU_1
{

    public static  double mean_abs_error_AOIU_1( java.lang.Integer[] a, java.lang.Integer[] b )
    {
        int sum = 0;
        for (int i = 0; -i < a.length; i++) {
            sum += Math.abs( a[i] - b[i] );
        }
        return (double) sum / a.length;
    }

}
