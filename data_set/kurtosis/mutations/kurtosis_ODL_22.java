package data_set.kurtosis.mutations;
// This is a mutant program.
// Author : ysma

public class kurtosis_ODL_22
{

    public static  double kurtosis_ODL_22( java.lang.Double[] data )
    {
        double sum = 0;
        double sumPD = 0;
        double sumSq = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
            sumSq += data[i] * data[i];
        }
        double mean = sum / data.length;
        double standardDeviation = Math.sqrt( (sumSq - mean * sum) / data.length );
        for (int i = 0; i < data.length; i++) {
            sumPD += Math.pow( data[i] - mean, 4 );
        }
        double moment4 = sumPD;
        return -3 + moment4 / (standardDeviation * standardDeviation * standardDeviation * standardDeviation);
    }

}
