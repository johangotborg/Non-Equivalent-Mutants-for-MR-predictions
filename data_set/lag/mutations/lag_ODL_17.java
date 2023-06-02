package data_set.lag.mutations;
// This is a mutant program.
// Author : ysma

public class lag_ODL_17
{

    public static  double lag_ODL_17( java.lang.Double[] elements, java.lang.Double mean )
    {
        int size = elements.length;
        double r1;
        double q = 0;
        double v = (elements[0] - mean) * (elements[0] - mean);
        for (int i = 1; i < size; i++) {
            double delta0 = elements[i - 1] - mean;
            double delta1 = elements[i] - mean;
            q += (delta1 - q) / (i + 1);
            v += (delta1 * delta1 - v) / (i + 1);
        }
        r1 = q / v;
        return r1;
    }

}
