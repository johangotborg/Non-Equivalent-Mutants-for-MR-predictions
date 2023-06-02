package data_set.sumOfLogarithms.mutations;
// This is a mutant program.
// Author : ysma

public class sumOfLogarithms_ASRS_3
{

    public static  double sumOfLogarithms_ASRS_3( java.lang.Double[] elements )
    {
        double logsum = 0;
        for (int i = 0; i < elements.length; i++) {
            logsum -= Math.log( elements[i] );
        }
        return logsum;
    }

}
