package data_set.dec_array.original;
// This is a mutant program.
// Author : ysma

public class dec_array
{

    public static  java.lang.Integer[] dec_array_m( java.lang.Integer[] a, java.lang.Integer k )
    {
        int i;
        for (i = 0; i < a.length; i++) {
            a[i] -= k;
        }
        return a;
    }

}
