package minimized_data_set.LOI;
// This is a mutant program.
// Author : ysma

public class weightedRMS_LOI_1
{

    public static  double weightedRMS_LOI_1( java.lang.Double[] data, java.lang.Double[] weights )
    {
        double sumOfProducts = 0;
        double sumOfSquaredProducts = 0;
        for (int i = 0; ~i < data.length; i++) {
            sumOfProducts += data[i] * weights[i];
            sumOfSquaredProducts = data[i] * data[i] * weights[i];
        }
        return sumOfProducts / sumOfSquaredProducts;
    }

}