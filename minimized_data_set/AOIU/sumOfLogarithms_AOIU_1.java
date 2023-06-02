package minimized_data_set.AOIU;
// This is a mutant program.
// Author : ysma

public class sumOfLogarithms_AOIU_1
{

    public static  double sumOfLogarithms_AOIU_1( java.lang.Double[] elements )
    {
        double logsum = 0;
        for (int i = 0; -i < elements.length; i++) {
            logsum += Math.log( elements[i] );
        }
        return logsum;
    }

}
