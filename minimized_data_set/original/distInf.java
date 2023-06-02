package minimized_data_set.original;
// This is a mutant program.
// Author : ysma

public class distInf
{

    public static  double distInf_m( java.lang.Double[] p1, java.lang.Double[] p2 )
    {
        double max = 0;
        for (int i = 0; i < p1.length; i++) {
            max = Math.max( max, Math.abs( p1[i] - p2[i] ) );
        }
        return max;
    }

}
