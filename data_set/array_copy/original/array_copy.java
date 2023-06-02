package data_set.array_copy.original;
// This is a mutant program.
// Author : ysma

public class array_copy
{

    public static  int[] array_copy_m( java.lang.Integer[] a )
    {
        int i;
        int[] b = new int[a.length];
        for (i = 0; i < a.length; i++) {
            b[i] = a[i];
        }
        return b;
    }

}
