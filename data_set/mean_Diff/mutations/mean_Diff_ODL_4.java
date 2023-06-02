package data_set.mean_Diff.mutations;
// This is a mutant program.
// Author : ysma

public class mean_Diff_ODL_4
{

    public static  double mean_Diff_ODL_4( final java.lang.Double[] sample1, final java.lang.Double[] sample2 )
    {
        double sumDifference = 0;
        for (int i = 0; i < sample1.length; i++) {
            sumDifference += sample1[i];
        }
        return sumDifference / sample1.length;
    }

}
