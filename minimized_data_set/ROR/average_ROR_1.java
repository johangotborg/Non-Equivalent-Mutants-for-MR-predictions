package minimized_data_set.ROR;
// This is a mutant program.
// Author : ysma

public class average_ROR_1
{

    public static  double average_ROR_1( java.lang.Integer[] a )
    {
        double sum = 0;
        for (int i = 0; i > a.length; i++) {
            sum += a[i];
        }
        return sum / a.length;
    }

}
