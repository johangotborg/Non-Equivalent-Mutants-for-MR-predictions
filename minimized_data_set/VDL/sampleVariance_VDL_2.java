package minimized_data_set.VDL;
// This is a mutant program.
// Author : ysma

public class sampleVariance_VDL_2
{

    public static  double sampleVariance_VDL_2( java.lang.Double[] elements, java.lang.Double mean )
    {
        int size = elements.length;
        double sum = 0;
        for (int i = size; --i >= 0;) {
            double delta = mean;
            sum += delta * delta;
        }
        return sum / (size - 1);
    }

}
