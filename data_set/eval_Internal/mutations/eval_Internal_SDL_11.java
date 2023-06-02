package data_set.eval_Internal.mutations;
// This is a mutant program.
// Author : ysma

public class eval_Internal_SDL_11
{

    public static  double eval_Internal_SDL_11( java.lang.Double[] x, java.lang.Double[] y, java.lang.Double z )
    {
        int nearest = 0;
        final int n = x.length;
        final double[] c = new double[n];
        final double[] d = new double[n];
        double min_dist = Double.POSITIVE_INFINITY;
        for (int i = 0; i < n; i++) {
            c[i] = y[i];
            d[i] = y[i];
            final double dist = Math.abs( z - x[i] );
            if (dist < min_dist) {
                nearest = i;
                min_dist = dist;
            }
        }
        double value = y[nearest];
        for (int i = 1; i < n; i++) {
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
