package minimized_data_set.VDL;
// This is a mutant program.
// Author : ysma

public class dist_VDL_3
{

    public static  double dist_VDL_3( java.lang.Double[] p1, java.lang.Double[] p2 )
    {
        double sum = 0;
        for (int i = 0; i < p1.length; i++) {
            sum += Math.abs( p2[i] );
        }
        return sum;
    }

}
