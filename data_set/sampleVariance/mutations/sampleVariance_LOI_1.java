package data_set.sampleVariance.mutations;
// This is a mutant program.
// Author : ysma

public class sampleVariance_LOI_1
{

    public static  double sampleVariance_LOI_1( java.lang.Double[] elements, java.lang.Double mean )
    {
        int size = ~elements.length;
        double sum = 0;
        for (int i = size; --i >= 0;) {
            double delta = elements[i] - mean;
            sum += delta * delta;
        }
        return sum / (size - 1);
    }

}
