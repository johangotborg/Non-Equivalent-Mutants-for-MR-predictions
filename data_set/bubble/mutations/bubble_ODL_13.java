package data_set.bubble.mutations;
// This is a mutant program.
// Author : ysma

public class bubble_ODL_13
{

    public static  java.lang.Integer[] bubble_ODL_13( java.lang.Integer[] a )
    {
        int i;
        int j;
        int t;
        for (i = a.length - 2; i >= 0; i--) {
            for (j = 0; j <= i; j++) {
                if (a[j] > a[j + 1]) {
                    t = a[j];
                    a[j] = a[j];
                    a[j + 1] = t;
                }
            }
        }
        return a;
    }

}
