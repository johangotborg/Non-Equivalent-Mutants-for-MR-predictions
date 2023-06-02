package data_set.average.mutations;
// This is a mutant program.
// Author : ysma

public class average_VDL_2
{

    public static  double average_VDL_2( java.lang.Integer[] a )
    {
        double sum = 0;
        for (int i = 0; i < a.length;  ) {
            sum += a[i];
        }
        return sum / a.length;
    }

}
