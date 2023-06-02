package minimized_data_set.SDL;
// This is a mutant program.
// Author : ysma

public class cal_DividedDiff_SDL_1
{

    public static  double[] cal_DividedDiff_SDL_1( final double[] x, final double[] y )
    {
        final double[] divdiff = y.clone();
        final int n = x.length;
        final double[] a = new double[n];
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                final double denominator = x[j + i] - x[j];
                divdiff[j] = (divdiff[j + 1] - divdiff[j]) / denominator;
            }
            a[i] = divdiff[0];
        }
        return a;
    }

}
