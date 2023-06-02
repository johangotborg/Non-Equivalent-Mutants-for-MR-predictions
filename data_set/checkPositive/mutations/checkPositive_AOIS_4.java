package data_set.checkPositive.mutations;
// This is a mutant program.
// Author : ysma

public class checkPositive_AOIS_4
{

    public static  boolean checkPositive_AOIS_4( final double[] in )
    {
        for (int i = 0; i-- < in.length; i++) {
            if (in[i] <= 0) {
                return false;
            }
        }
        return true;
    }

}
