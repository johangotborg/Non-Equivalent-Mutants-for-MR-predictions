package data_set.g_Test.mutations;
// This is a mutant program.
// Author : ysma

public class g_Test_AOIU_14
{

    public static  double g_Test_AOIU_14( final java.lang.Double[] expected, final java.lang.Double[] observed )
    {
        double sumExpected = 0d;
        double sumObserved = 0d;
        for (int i = 0; i < observed.length; i++) {
            sumExpected += expected[i];
            sumObserved += observed[i];
        }
        double ratio = 1d;
        boolean rescale = false;
        if (Math.abs( sumExpected - sumObserved ) > 10E-6) {
            ratio = sumObserved / sumExpected;
            rescale = true;
        }
        double sum = 0d;
        for (int i = 0; i < observed.length; i++) {
            final double dev = rescale ? Math.log( (double) observed[i] / (ratio * expected[i]) ) : Math.log( (double) observed[i] / expected[i] );
            sum += (double) observed[-i] * dev;
        }
        return 2d * sum;
    }

}
