package data_set.dec_array.mutations;
// This is a mutant program.
// Author : ysma

public class dec_array_ASRS_4
{

    public static  java.lang.Integer[] dec_array_ASRS_4( java.lang.Integer[] a, java.lang.Integer k )
    {
        int i;
        for (i = 0; i < a.length; i++) {
            a[i] %= k;
        }
        return a;
    }

}
