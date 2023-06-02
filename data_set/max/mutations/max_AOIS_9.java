package data_set.max.mutations;
// This is a mutant program.
// Author : ysma

public class max_AOIS_9
{

    public static  double max_AOIS_9( java.lang.Double[] elements )
    {
        int size = elements.length;
        double max = elements[size - 1];
        for (int i = size++ - 1; --i >= 0;) {
            if (elements[i] > max) {
                max = elements[i];
            }
        }
        return max;
    }

}
