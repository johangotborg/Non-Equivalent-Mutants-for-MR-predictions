package minimized_data_set.VDL;
// This is a mutant program.
// Author : ysma

public class find_max2_VDL_10
{

    public static  int find_max2_VDL_10( java.lang.Integer[] a )
    {
        int max = a[0] + a[1];
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] + a[i + 1] > max) {
                max = a[i + 1];
            }
        }
        return max;
    }

}
