package minimized_data_set.AOIS;
// This is a mutant program.
// Author : ysma

public class max_AOIS_12
{

    public static  double max_AOIS_12( java.lang.Double[] elements )
    {
        int size = elements.length;
        double max = elements[size - 1];
        for (int i = size - 1; --i >= 0;) {
            if (elements[--i] > max) {
                max = elements[i];
            }
        }
        return max;
    }

}
