package minimized_data_set.ODL;
// This is a mutant program.
// Author : ysma

public class sampleWeightedVar_ODL_10
{

    public static  double sampleWeightedVar_ODL_10( java.lang.Double[] data, java.lang.Double[] weights )
    {
        double sumOfWeights = 0;
        double sumOfProducts = 0;
        double sumOfSquaredProducts = 0;
        for (int i = 0; i < data.length; i++) {
            sumOfWeights += weights[i];
            sumOfProducts += data[i] * weights[i];
            sumOfSquaredProducts += data[i] * data[i];
        }
        return (sumOfSquaredProducts - sumOfProducts * sumOfProducts / sumOfWeights) / (sumOfWeights - 1);
    }

}
