package minimized_data_set.original;
// This is a mutant program.
// Author : ysma

public class average
{

    public static  double average_m( java.lang.Integer[] a )
    {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum / a.length;
    }

}
