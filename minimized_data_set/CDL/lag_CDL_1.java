package minimized_data_set.CDL;
// This is a mutant program.
// Author : ysma

public class lag_CDL_1
{

    public static  double lag_CDL_1( java.lang.Double[] elements, java.lang.Double mean )
    {
        int size = elements.length;
        double r1;
        double q = 0;
        double v = (elements[0] - mean) * (elements[0] - mean);
        for (int i = 1; i < size; i++) {
            double delta0 = elements[i] - mean;
            double delta1 = elements[i] - mean;
            q += (delta0 * delta1 - q) / (i + 1);
            v += (delta1 * delta1 - v) / (i + 1);
        }
        r1 = q / v;
        return r1;
    }

}
