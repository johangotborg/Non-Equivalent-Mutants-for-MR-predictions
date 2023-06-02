package data_set.sum_labeled.mutations;
// This is a mutant program.
// Author : ysma

public class sum_labeled_ROR_28
{

    public static  double sum_labeled_ROR_28( int[] a, int i, int j )
    {
        if (i < 0 || i >= a.length || j < 0 || false) {
            return -100000;
        } else {
            return a[i] + a[j] / 2.0;
        }
    }

}
