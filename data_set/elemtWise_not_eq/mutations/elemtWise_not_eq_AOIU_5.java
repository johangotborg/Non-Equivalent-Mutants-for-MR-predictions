package data_set.elemtWise_not_eq.mutations;
// This is a mutant program.
// Author : ysma

public class elemtWise_not_eq_AOIU_5
{

    public static  boolean[] elemtWise_not_eq_AOIU_5( java.lang.Integer[] a, java.lang.Integer[] b )
    {
        boolean[] r = new boolean[a.length];
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[-i]) {
                r[i] = true;
            } else {
                r[i] = false;
            }
        }
        return r;
    }

}
