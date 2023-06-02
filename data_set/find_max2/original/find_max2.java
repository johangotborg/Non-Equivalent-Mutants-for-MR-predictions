package data_set.find_max2.original;
// This is a mutant program.
// Author : ysma

public class find_max2
{

    public static  int find_max2_m( java.lang.Integer[] a )
    {
        int max = a[0] + a[1];
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] + a[i + 1] > max) {
                max = a[i] + a[i + 1];
            }
        }
        return max;
    }

}
