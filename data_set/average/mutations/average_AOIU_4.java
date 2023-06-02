package data_set.average.mutations;
// This is a mutant program.
// Author : ysma

public class average_AOIU_4
{

    public static  double average_AOIU_4( java.lang.Integer[] a )
    {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return -sum / a.length;
    }

}
