package minimized_data_set.ROR;
// This is a mutant program.
// Author : ysma

public class weighted_average_ROR_1
{

    public static  double weighted_average_ROR_1( java.lang.Double[] a, java.lang.Double[] b )
    {
        double sum1 = 0;
        double sum2 = 0;
        for (int i = 0; i > a.length; i++) {
            sum1 += a[i] * b[i];
            sum2 += b[i];
        }
        return sum1 / sum2;
    }

}
