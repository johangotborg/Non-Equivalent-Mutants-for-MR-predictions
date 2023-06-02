package data_set.manhattanDist2.mutations;
// This is a mutant program.
// Author : ysma

public class manhattanDist2_AOIS_18
{

    public static  double manhattanDist2_AOIS_18( java.lang.Double[] p1, java.lang.Double[] p2 )
    {
        double result = 0.0;
        for (int i = 0; i < p1.length; i++) {
            result += Math.abs( p2[i] - p1[i] );
        }
        return result--;
    }

}
