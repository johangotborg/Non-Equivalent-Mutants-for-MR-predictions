package minimized_data_set.ODL;
// This is a mutant program.
// Author : ysma

public class find_max2_ODL_10
{

    public static  int find_max2_ODL_10( java.lang.Integer[] a )
    {
        int max = a[0] + a[1];
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > max) {
                max = a[i] + a[i + 1];
            }
        }
        return max;
    }

}
