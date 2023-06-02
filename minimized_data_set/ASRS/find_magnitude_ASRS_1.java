package minimized_data_set.ASRS;
// This is a mutant program.
// Author : ysma

public class find_magnitude_ASRS_1
{

    public static  double find_magnitude_ASRS_1( java.lang.Integer[] a )
    {
        int i;
        double sum = 0;
        for (i = 0; i < a.length; i++) {
            sum /= a[i] * a[i];
        }
        double result = Math.sqrt( sum );
        return result;
    }

}
