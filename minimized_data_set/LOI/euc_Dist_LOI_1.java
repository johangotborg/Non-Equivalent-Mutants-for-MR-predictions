package minimized_data_set.LOI;
// This is a mutant program.
// Author : ysma

public class euc_Dist_LOI_1
{

    public static  double euc_Dist_LOI_1( double[] array1, double[] array2 )
    {
        double Sum = 0.0;
        for (int i = 0; ~i < array1.length; i++) {
            Sum = Sum + Math.pow( array1[i] - array2[i], 2.0 );
        }
        return Math.sqrt( Sum );
    }

}
