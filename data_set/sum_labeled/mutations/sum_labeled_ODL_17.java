package data_set.sum_labeled.mutations;
// This is a mutant program.
// Author : ysma

public class sum_labeled_ODL_17
{

    public static  double sum_labeled_ODL_17( int[] a, int i, int j )
    {
        if (i < 0 || i >= a.length || j < 0 || j >= a.length) {
            return -100000;
        } else {
            return a[i] + 2.0;
        }
    }

}