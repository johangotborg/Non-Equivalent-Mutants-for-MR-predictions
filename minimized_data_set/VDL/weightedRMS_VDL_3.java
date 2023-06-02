package minimized_data_set.VDL;
// This is a mutant program.
// Author : ysma

public class weightedRMS_VDL_3
{

    public static  double weightedRMS_VDL_3( java.lang.Double[] data, java.lang.Double[] weights )
    {
        double sumOfProducts = 0;
        double sumOfSquaredProducts = 0;
        for (int i = 0; i < data.length; i++) {
            sumOfProducts += weights[i];
            sumOfSquaredProducts = data[i] * data[i] * weights[i];
        }
        return sumOfProducts / sumOfSquaredProducts;
    }

}
