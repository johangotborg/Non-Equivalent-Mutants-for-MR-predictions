package data_set.set_min_val.mutations;
// This is a mutant program.
// Author : ysma

public class set_min_val_ROR_5
{

    public static  java.lang.Integer[] set_min_val_ROR_5( java.lang.Integer[] a, java.lang.Integer k )
    {
        int i;
        for (i = 0; i != a.length; i++) {
            if (a[i] < k) {
                a[i] = k;
            }
        }
        return a;
    }

}
