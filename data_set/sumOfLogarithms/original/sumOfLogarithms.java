package data_set.sumOfLogarithms.original;
// This is a mutant program.
// Author : ysma

public class sumOfLogarithms
{

    public static  double sumOfLogarithms_m( java.lang.Double[] elements )
    {
        double logsum = 0;
        for (int i = 0; i < elements.length; i++) {
            logsum += Math.log( elements[i] );
        }
        return logsum;
    }

}
