package minimized_data_set.ODL;
// This is a mutant program.
// Author : ysma

public class find_euc_Dist_ODL_10
{

    public static  double find_euc_Dist_ODL_10( java.lang.Integer[] a, java.lang.Integer[] b )
    {
        int i;
        double sum = 0;
        for (i = 0; i < a.length; i++) {
            sum = (a[i] - b[i]) * (a[i] - b[i]);
        }
        double result = Math.sqrt( sum );
        return result;
    }

}