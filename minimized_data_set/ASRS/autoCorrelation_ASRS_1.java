package minimized_data_set.ASRS;
// This is a mutant program.
// Author : ysma

public class autoCorrelation_ASRS_1
{

    public static  double autoCorrelation_ASRS_1( java.lang.Double[] data, java.lang.Integer lag, java.lang.Double mean, java.lang.Double variance )
    {
        int N = data.length;
        double run = 0;
        for (int i = lag; i < N; ++i) {
            run /= (data[i] - mean) * (data[i - lag] - mean);
        }
        return run / (N - lag) / variance;
    }

}
