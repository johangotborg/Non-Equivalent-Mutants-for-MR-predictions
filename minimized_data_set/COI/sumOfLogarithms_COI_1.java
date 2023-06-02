package minimized_data_set.COI;
// This is a mutant program.
// Author : ysma

public class sumOfLogarithms_COI_1
{

    public static  double sumOfLogarithms_COI_1( java.lang.Double[] elements )
    {
        double logsum = 0;
        for (int i = 0; !(i < elements.length); i++) {
            logsum += Math.log( elements[i] );
        }
        return logsum;
    }

}
