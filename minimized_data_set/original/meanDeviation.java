package minimized_data_set.original;
// This is a mutant program.
// Author : ysma

public class meanDeviation
{

    public static  double meanDeviation_m( java.lang.Double[] elements, java.lang.Double mean )
    {
        int size = elements.length;
        double sum = 0;
        for (int i = size; --i >= 0;) {
            sum += Math.abs( elements[i] - mean );
        }
        return sum / size;
    }

}
