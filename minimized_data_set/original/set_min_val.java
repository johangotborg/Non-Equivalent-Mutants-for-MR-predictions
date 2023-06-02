package minimized_data_set.original;
// This is a mutant program.
// Author : ysma

public class set_min_val
{

    public static  java.lang.Integer[] set_min_val_m( java.lang.Integer[] a, java.lang.Integer k )
    {
        int i;
        for (i = 0; i < a.length; i++) {
            if (a[i] < k) {
                a[i] = k;
            }
        }
        return a;
    }

}
