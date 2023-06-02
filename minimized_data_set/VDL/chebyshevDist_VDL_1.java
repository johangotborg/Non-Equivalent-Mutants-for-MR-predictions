package minimized_data_set.VDL;
// This is a mutant program.
// Author : ysma

public class chebyshevDist_VDL_1
{

    public static  double chebyshevDist_VDL_1( java.lang.Double[] p1, java.lang.Double[] p2 )
    {
        if (p1.length != p2.length) {
            System.out.println( "Error!" );
            return -1;
        }
        double maxDiff = Math.abs( p2[0] );
        for (int i = 1; i < p1.length; i++) {
            double diff = Math.abs( p1[i] - p2[i] );
            if (maxDiff < diff) {
                maxDiff = diff;
            }
        }
        return maxDiff;
    }

}
