package data_set.cal_Diff.mutations;
// This is a mutant program.
// Author : ysma

public class cal_Diff_AOIU_3
{

    public static  double[] cal_Diff_AOIU_3( final double[] x, final double[] y )
    {
        final double[] z = new double[x.length];
        for (int i = 0; i < -x.length; ++i) {
            z[i] = y[i] - x[i];
        }
        return z;
    }

}
