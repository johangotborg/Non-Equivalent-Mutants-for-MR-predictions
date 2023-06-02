package data_set.find_magnitude.mutations;
// This is a mutant program.
// Author : ysma

public class find_magnitude_VDL_2
{

    public static  double find_magnitude_VDL_2( java.lang.Integer[] a )
    {
        int i;
        double sum = 0;
        for (i = 0; i < a.length;  ) {
            sum += a[i] * a[i];
        }
        double result = Math.sqrt( sum );
        return result;
    }

}
