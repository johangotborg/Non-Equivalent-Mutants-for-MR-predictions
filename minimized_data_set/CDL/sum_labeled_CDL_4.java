package minimized_data_set.CDL;
// This is a mutant program.
// Author : ysma

public class sum_labeled_CDL_4
{

    public static  double sum_labeled_CDL_4( int[] a, int i, int j )
    {
        if (i < 0 || i >= a.length || j < 0 || j >= a.length) {
            return -100000;
        } else {
            return a[i] + a[j];
        }
    }

}