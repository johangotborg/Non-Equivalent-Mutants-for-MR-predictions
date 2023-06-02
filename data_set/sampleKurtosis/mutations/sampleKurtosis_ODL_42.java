package data_set.sampleKurtosis.mutations;
// This is a mutant program.
// Author : ysma

public class sampleKurtosis_ODL_42
{

    public static  double sampleKurtosis_ODL_42( java.lang.Integer size, java.lang.Double moment4, java.lang.Double sampleVariance )
    {
        int n = size;
        double s2 = sampleVariance;
        double m4 = moment4 * n;
        return 3.0 * (n - 1) * (n - 1) / ((n - 2) * (n - 3));
    }

}
