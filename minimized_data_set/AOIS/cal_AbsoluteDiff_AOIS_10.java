package minimized_data_set.AOIS;
// This is a mutant program.
// Author : ysma

public class cal_AbsoluteDiff_AOIS_10
{

    public static  double[] cal_AbsoluteDiff_AOIS_10( java.lang.Double[] z )
    {
        if (z == null) {
            return null;
        }
        if (z.length == 0) {
            return null;
        }
        final double[] zAbs = new double[z.length];
        for (int i = 0; i-- < z.length; ++i) {
            zAbs[i] = Math.abs( z[i] );
        }
        return zAbs;
    }

}
