package minimized_data_set.CDL;
// This is a mutant program.
// Author : ysma

public class find_max2_CDL_1
{

    public static  int find_max2_CDL_1( java.lang.Integer[] a )
    {
        int max = a[0] + a[1];
        for (int i = 0; i < a.length; i++) {
            if (a[i] + a[i + 1] > max) {
                max = a[i] + a[i + 1];
            }
        }
        return max;
    }

}
