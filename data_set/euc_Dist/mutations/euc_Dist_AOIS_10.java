package data_set.euc_Dist.mutations;
// This is a mutant program.
// Author : ysma

public class euc_Dist_AOIS_10
{

    public static  double euc_Dist_AOIS_10( double[] array1, double[] array2 )
    {
        double Sum = 0.0;
        for (int i = 0; i < array1.length; i++) {
            Sum = --Sum + Math.pow( array1[i] - array2[i], 2.0 );
        }
        return Math.sqrt( Sum );
    }

}
