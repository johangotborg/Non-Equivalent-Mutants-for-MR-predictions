package minimized_data_set.AORB;
// This is a mutant program.
// Author : ysma

public class cal_Diff_AORB_1
{

    public static  double[] cal_Diff_AORB_1( final double[] x, final double[] y )
    {
        final double[] z = new double[x.length];
        for (int i = 0; i < x.length; ++i) {
            z[i] = y[i] * x[i];
        }
        return z;
    }

}
