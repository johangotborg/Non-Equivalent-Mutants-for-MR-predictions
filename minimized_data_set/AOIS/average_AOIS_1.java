package minimized_data_set.AOIS;
// This is a mutant program.
// Author : ysma

public class average_AOIS_1
{

    public static  double average_AOIS_1( java.lang.Integer[] a )
    {
        double sum = 0;
        for (int i = 0; ++i < a.length; i++) {
            sum += a[i];
        }
        return sum / a.length;
    }

}