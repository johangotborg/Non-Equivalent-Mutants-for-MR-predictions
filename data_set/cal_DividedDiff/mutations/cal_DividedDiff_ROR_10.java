package data_set.cal_DividedDiff.mutations;
// This is a mutant program.
// Author : ysma

public class cal_DividedDiff_ROR_10
{

    public static  double[] cal_DividedDiff_ROR_10( final double[] x, final double[] y )
    {
        final double[] divdiff = y.clone();
        final int n = x.length;
        final double[] a = new double[n];
        a[0] = divdiff[0];
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= n - i; j++) {
                final double denominator = x[j + i] - x[j];
                divdiff[j] = (divdiff[j + 1] - divdiff[j]) / denominator;
            }
            a[i] = divdiff[0];
        }
        return a;
    }

}
