package minimized_data_set.original;
// This is a mutant program.
// Author : ysma

public class dist
{

    public static  double dist_m( java.lang.Double[] p1, java.lang.Double[] p2 )
    {
        double sum = 0;
        for (int i = 0; i < p1.length; i++) {
            sum += Math.abs( p1[i] - p2[i] );
        }
        return sum;
    }

}
