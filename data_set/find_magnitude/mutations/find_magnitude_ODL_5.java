package data_set.find_magnitude.mutations;
// This is a mutant program.
// Author : ysma

public class find_magnitude_ODL_5
{

    public static  double find_magnitude_ODL_5( java.lang.Integer[] a )
    {
        int i;
        double sum = 0;
        for (i = 0; i < a.length; i++) {
            sum += a[i];
        }
        double result = Math.sqrt( sum );
        return result;
    }

}
