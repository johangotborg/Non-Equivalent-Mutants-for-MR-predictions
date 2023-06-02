package minimized_data_set.VDL;
// This is a mutant program.
// Author : ysma

public class max_VDL_1
{

    public static  double max_VDL_1( java.lang.Double[] elements )
    {
        int size = elements.length;
        double max = elements[1];
        for (int i = size - 1; --i >= 0;) {
            if (elements[i] > max) {
                max = elements[i];
            }
        }
        return max;
    }

}
