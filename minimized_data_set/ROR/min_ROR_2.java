package minimized_data_set.ROR;
// This is a mutant program.
// Author : ysma

public class min_ROR_2
{

    public static  double min_ROR_2( java.lang.Double[] elements )
    {
        int size = elements.length;
        double min = elements[size - 1];
        for (int i = size - 1; --i < 0;) {
            if (elements[i] < min) {
                min = elements[i];
            }
        }
        return min;
    }

}
