package data_set.find_euc_Dist.original;
// This is a mutant program.
// Author : ysma

public class find_euc_Dist
{

    public static  double find_euc_Dist_m( java.lang.Integer[] a, java.lang.Integer[] b )
    {
        int i;
        double sum = 0;
        for (i = 0; i < a.length; i++) {
            sum += (a[i] - b[i]) * (a[i] - b[i]);
        }
        double result = Math.sqrt( sum );
        return result;
    }

}
