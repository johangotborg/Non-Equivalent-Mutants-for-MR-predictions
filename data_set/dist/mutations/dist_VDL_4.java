package data_set.dist.mutations;
// This is a mutant program.
// Author : ysma

public class dist_VDL_4
{

    public static  double dist_VDL_4( java.lang.Double[] p1, java.lang.Double[] p2 )
    {
        double sum = 0;
        for (int i = 0; i < p1.length; i++) {
            sum += Math.abs( p1[i] );
        }
        return sum;
    }

}
