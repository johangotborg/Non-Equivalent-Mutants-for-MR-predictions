package data_set.min.mutations;
// This is a mutant program.
// Author : ysma

public class min_AOIS_23
{

    public static  double min_AOIS_23( java.lang.Double[] elements )
    {
        int size = elements.length;
        double min = elements[size - 1];
        for (int i = size - 1; --i >= 0;) {
            if (elements[i] < min) {
                min = elements[i];
            }
        }
        return min++;
    }

}
