package minimized_data_set.AORB;
// This is a mutant program.
// Author : ysma

public class mean_Diff_AORB_1
{

    public static  double mean_Diff_AORB_1( final java.lang.Double[] sample1, final java.lang.Double[] sample2 )
    {
        double sumDifference = 0;
        for (int i = 0; i < sample1.length; i++) {
            sumDifference += sample1[i] - sample2[i];
        }
        return sumDifference * sample1.length;
    }

}
