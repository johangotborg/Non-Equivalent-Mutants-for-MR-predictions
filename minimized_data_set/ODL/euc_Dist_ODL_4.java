package minimized_data_set.ODL;
// This is a mutant program.
// Author : ysma

public class euc_Dist_ODL_4
{

    public static  double euc_Dist_ODL_4( double[] array1, double[] array2 )
    {
        double Sum = 0.0;
        for (int i = 0; i < array1.length; i++) {
            Sum = Sum + Math.pow( array1[i], 2.0 );
        }
        return Math.sqrt( Sum );
    }

}
