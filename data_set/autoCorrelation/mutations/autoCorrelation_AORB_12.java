package data_set.autoCorrelation.mutations;
// This is a mutant program.
// Author : ysma

public class autoCorrelation_AORB_12
{

    public static  double autoCorrelation_AORB_12( java.lang.Double[] data, java.lang.Integer lag, java.lang.Double mean, java.lang.Double variance )
    {
        int N = data.length;
        double run = 0;
        for (int i = lag; i < N; ++i) {
            run += (data[i] - mean) * (data[i - lag] - mean);
        }
        return run - (N - lag) / variance;
    }

}
