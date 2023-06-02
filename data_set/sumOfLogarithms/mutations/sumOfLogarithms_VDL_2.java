package data_set.sumOfLogarithms.mutations;
// This is a mutant program.
// Author : ysma

public class sumOfLogarithms_VDL_2
{

    public static  double sumOfLogarithms_VDL_2( java.lang.Double[] elements )
    {
        double logsum = 0;
        for (int i = 0; i < elements.length;  ) {
            logsum += Math.log( elements[i] );
        }
        return logsum;
    }

}
