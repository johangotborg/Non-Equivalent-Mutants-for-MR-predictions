package data_set.checkNonNegative.mutations;
// This is a mutant program.
// Author : ysma

public class checkNonNegative_COI_1
{

    public static  boolean checkNonNegative_COI_1( final double[] in )
    {
        for (int i = 0; !(i < in.length); i++) {
            if (in[i] < 0) {
                return false;
            }
        }
        return true;
    }

}
