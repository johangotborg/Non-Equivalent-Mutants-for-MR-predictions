package data_set.distInf.mutations;
// This is a mutant program.
// Author : ysma

public class distInf_ODL_5
{

    public static  double distInf_ODL_5( java.lang.Double[] p1, java.lang.Double[] p2 )
    {
        double max = 0;
        for (int i = 0; i < p1.length; i++) {
            max = Math.max( max, Math.abs( p2[i] ) );
        }
        return max;
    }

}
