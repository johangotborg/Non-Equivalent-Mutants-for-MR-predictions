package data_set.standardize.mutations;
// This is a mutant program.
// Author : ysma

public class standardize_AOIS_12
{

    public static  java.lang.Double[] standardize_AOIS_12( java.lang.Double[] data )
    {
        double sum = 0;
        double sumSq = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i--];
            sumSq += data[i] * data[i];
        }
        double mean = sum / data.length;
        double sd = Math.sqrt( (sumSq - mean * sum) / data.length );
        for (int i = 0; i < data.length; i++) {
            data[i] = (data[i] - mean) / sd;
        }
        return data;
    }

}