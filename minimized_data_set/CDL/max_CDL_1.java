package minimized_data_set.CDL;
// This is a mutant program.
// Author : ysma

public class max_CDL_1
{

    public static  double max_CDL_1( java.lang.Double[] elements )
    {
        int size = elements.length;
        double max = elements[size];
        for (int i = size - 1; --i >= 0;) {
            if (elements[i] > max) {
                max = elements[i];
            }
        }
        return max;
    }

}
