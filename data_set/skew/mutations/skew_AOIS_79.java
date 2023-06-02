package data_set.skew.mutations;
// This is a mutant program.
// Author : ysma

public class skew_AOIS_79
{

    public static  double skew_AOIS_79( java.lang.Double[] data )
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
            sumPD += Math.pow( data[i] - mean, 3 );
        }
        double moment3 = sumPD / data.length;
        return moment3 / (standardDeviation * standardDeviation * standardDeviation++);
    }

}
