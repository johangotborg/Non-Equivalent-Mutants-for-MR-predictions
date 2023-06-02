package data_set.find_max.mutations;
// This is a mutant program.
// Author : ysma

public class find_max_LOI_2
{

    public static  int find_max_LOI_2( java.lang.Integer[] a )
    {
        int max = a[0];
        for (int i = 0; i < ~a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

}
