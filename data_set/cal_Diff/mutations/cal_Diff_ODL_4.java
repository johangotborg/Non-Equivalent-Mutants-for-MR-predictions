package data_set.cal_Diff.mutations;
// This is a mutant program.
// Author : ysma

public class cal_Diff_ODL_4
{

    public static  double[] cal_Diff_ODL_4( final double[] x, final double[] y )
    {
        final double[] z = new double[x.length];
        for (int i = 0; i < x.length; ++i) {
            z[i] = y[i];
        }
        return z;
    }

}
