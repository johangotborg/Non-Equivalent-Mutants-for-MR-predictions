package data_set.average.mutations;
// This is a mutant program.
// Author : ysma

public class average_AOIS_11
{

    public static  double average_AOIS_11( java.lang.Integer[] a )
    {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i++];
        }
        return sum / a.length;
    }

}
