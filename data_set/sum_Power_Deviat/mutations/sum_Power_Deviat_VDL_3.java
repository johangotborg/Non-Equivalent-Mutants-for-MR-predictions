package data_set.sum_Power_Deviat.mutations;
// This is a mutant program.
// Author : ysma

public class sum_Power_Deviat_VDL_3
{

    public static  double sum_Power_Deviat_VDL_3( java.lang.Double[] data, java.lang.Integer k, java.lang.Double c )
    {
        double sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += Math.pow( c, k );
        }
        return sum;
    }

}
