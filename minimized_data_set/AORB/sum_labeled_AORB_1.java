package minimized_data_set.AORB;
// This is a mutant program.
// Author : ysma

public class sum_labeled_AORB_1
{

    public static  double sum_labeled_AORB_1( int[] a, int i, int j )
    {
        if (i < 0 || i >= a.length || j < 0 || j >= a.length) {
            return -100000;
        } else {
            return a[i] + a[j] * 2.0;
        }
    }

}
