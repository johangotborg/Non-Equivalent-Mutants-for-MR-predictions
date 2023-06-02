package minimized_data_set.VDL;
// This is a mutant program.
// Author : ysma

public class euc_Dist_VDL_3
{

    public static  double euc_Dist_VDL_3( double[] array1, double[] array2 )
    {
        double Sum = 0.0;
        for (int i = 0; i < array1.length; i++) {
            Sum = Sum + Math.pow( array2[i], 2.0 );
        }
        return Math.sqrt( Sum );
    }

}
