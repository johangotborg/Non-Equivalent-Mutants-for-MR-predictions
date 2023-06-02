package data_set.sum_labeled.mutations;
// This is a mutant program.
// Author : ysma

public class sum_labeled_ODL_10
{

    public static  double sum_labeled_ODL_10( int[] a, int i, int j )
    {
        if (j < 0 || j >= a.length) {
            return -100000;
        } else {
            return a[i] + a[j] / 2.0;
        }
    }

}
