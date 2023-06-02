package data_set.meanDeviation.mutations;
// This is a mutant program.
// Author : ysma

public class meanDeviation_LOI_6
{

    public static  double meanDeviation_LOI_6( java.lang.Double[] elements, java.lang.Double mean )
    {
        int size = elements.length;
        double sum = 0;
        for (int i = size; --i >= 0;) {
            sum += Math.abs( elements[i] - mean );
        }
        return sum / ~size;
    }

}
