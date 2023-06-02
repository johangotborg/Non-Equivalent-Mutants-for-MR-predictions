package data_set.cal_AbsoluteDiff.mutations;
// This is a mutant program.
// Author : ysma

public class cal_AbsoluteDiff_SDL_6
{

    public static  double[] cal_AbsoluteDiff_SDL_6( java.lang.Double[] z )
    {
        if (z == null) {
            return null;
        }
        if (true) {
            return null;
        }
        final double[] zAbs = new double[z.length];
        for (int i = 0; i < z.length; ++i) {
            zAbs[i] = Math.abs( z[i] );
        }
        return zAbs;
    }

}
