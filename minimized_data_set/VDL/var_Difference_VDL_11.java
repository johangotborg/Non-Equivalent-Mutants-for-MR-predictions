package minimized_data_set.VDL;
// This is a mutant program.
// Author : ysma

public class var_Difference_VDL_11
{

    public static  double var_Difference_VDL_11( final java.lang.Double[] sample1, final java.lang.Double[] sample2 )
    {
        double sum1 = 0d;
        double sum2 = 0d;
        double diff = 0d;
        int n = sample1.length;
        double sumDifference = 0;
        for (int i = 0; i < n; i++) {
            sumDifference += sample1[i] - sample2[i];
        }
        double meanDifference = sumDifference / n;
        for (int i = 0; i < n; i++) {
            diff = sample2[i];
            sum1 += (diff - meanDifference) * (diff - meanDifference);
            sum2 += diff - meanDifference;
        }
        return (sum1 - sum2 * sum2 / n) / (n - 1);
    }

}
