package minimized_data_set.SDL;
// This is a mutant program.
// Author : ysma

public class eval_Internal_SDL_1
{

    public static  double eval_Internal_SDL_1( java.lang.Double[] x, java.lang.Double[] y, java.lang.Double z )
    {
        int nearest = 0;
        final int n = x.length;
        final double[] c = new double[n];
        final double[] d = new double[n];
        double min_dist = Double.POSITIVE_INFINITY;
        double value = y[nearest];
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                final double tc = x[j] - z;
                final double td = x[i + j] - z;
                final double divider = x[j] - x[i + j];
                final double w = (c[j + 1] - d[j]) / divider;
                c[j] = tc * w;
                d[j] = td * w;
            }
            if (nearest < 0.5 * (n - i + 1)) {
                value += c[nearest];
            } else {
                nearest--;
                value += d[nearest];
            }
        }
        return value;
    }

}
