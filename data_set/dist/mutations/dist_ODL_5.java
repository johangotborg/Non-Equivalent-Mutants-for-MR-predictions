package data_set.dist.mutations;
// This is a mutant program.
// Author : ysma

public class dist_ODL_5
{

    public static  double dist_ODL_5( java.lang.Double[] p1, java.lang.Double[] p2 )
    {
        double sum = 0;
        for (int i = 0; i < p1.length; i++) {
            sum += Math.abs( p2[i] );
        }
        return sum;
    }

}
