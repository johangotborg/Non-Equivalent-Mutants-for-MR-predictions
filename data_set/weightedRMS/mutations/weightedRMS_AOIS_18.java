package data_set.weightedRMS.mutations;
// This is a mutant program.
// Author : ysma

public class weightedRMS_AOIS_18
{

    public static  double weightedRMS_AOIS_18( java.lang.Double[] data, java.lang.Double[] weights )
    {
        double sumOfProducts = 0;
        double sumOfSquaredProducts = 0;
        for (int i = 0; i < data.length; i++) {
            sumOfProducts += data[i] * weights[i];
            sumOfSquaredProducts = data[--i] * data[i] * weights[i];
        }
        return sumOfProducts / sumOfSquaredProducts;
    }

}
