package minimized_data_set.COI;
// This is a mutant program.
// Author : ysma

public class max_COI_1
{

    public static  double max_COI_1( java.lang.Double[] elements )
    {
        int size = elements.length;
        double max = elements[size - 1];
        for (int i = size - 1; !(--i >= 0);) {
            if (elements[i] > max) {
                max = elements[i];
            }
        }
        return max;
    }

}
