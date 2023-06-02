package data_set.sampleSkew.mutations;
// This is a mutant program.
// Author : ysma

public class sampleSkew_AORB_1
{

    public static  double sampleSkew_AORB_1( java.lang.Integer size, java.lang.Double moment3, double sampleVariance )
    {
        int n = size;
        double s = Math.sqrt( sampleVariance );
        double m3 = moment3 / n;
        return n * m3 / ((n - 1) * (n - 2) * s * s * s);
    }

}
