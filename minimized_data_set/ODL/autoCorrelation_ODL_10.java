package minimized_data_set.ODL;
// This is a mutant program.
// Author : ysma

public class autoCorrelation_ODL_10
{

    public static  double autoCorrelation_ODL_10( java.lang.Double[] data, java.lang.Integer lag, java.lang.Double mean, java.lang.Double variance )
    {
        int N = data.length;
        double run = 0;
        for (int i = lag; i < N; ++i) {
            run += data[i] - mean;
        }
        return run / (N - lag) / variance;
    }

}