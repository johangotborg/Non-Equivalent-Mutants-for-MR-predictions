package minimized_data_set.AORS;
// This is a mutant program.
// Author : ysma

public class find_max2_AORS_1
{

    public static  int find_max2_AORS_1( java.lang.Integer[] a )
    {
        int max = a[0] + a[1];
        for (int i = 0; i < a.length - 1; i--) {
            if (a[i] + a[i + 1] > max) {
                max = a[i] + a[i + 1];
            }
        }
        return max;
    }

}
