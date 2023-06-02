package minimized_data_set.SDL;
// This is a mutant program.
// Author : ysma

public class var_Difference_SDL_1
{

    public static  double var_Difference_SDL_1( final java.lang.Double[] sample1, final java.lang.Double[] sample2 )
    {
        double sum1 = 0d;
        double sum2 = 0d;
        double diff = 0d;
        int n = sample1.length;
        double sumDifference = 0;
        double meanDifference = sumDifference / n;
        for (int i = 0; i < n; i++) {
            diff = sample1[i] - sample2[i];
            sum1 += (diff - meanDifference) * (diff - meanDifference);
            sum2 += diff - meanDifference;
        }
        return (sum1 - sum2 * sum2 / n) / (n - 1);
    }

}
