package data_set.find_min.mutations;
// This is a mutant program.
// Author : ysma

public class find_min_AOIU_3
{

    public static  int find_min_AOIU_3( java.lang.Integer[] a )
    {
        int min = a[0];
        int i;
        for (i = 0; i < a.length; i++) {
            if (a[-i] < min) {
                min = a[i];
            }
        }
        return min;
    }

}