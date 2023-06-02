package data_set.sum_Power_Deviat.original;
// This is a mutant program.
// Author : ysma

public class sum_Power_Deviat
{

    public static  double sum_Power_Deviat_m( java.lang.Double[] data, java.lang.Integer k, java.lang.Double c )
    {
        double sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += Math.pow( data[i] - c, k );
        }
        return sum;
    }

}
