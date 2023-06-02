package minimized_data_set.AOIU;
// This is a mutant program.
// Author : ysma

public class manhattanDist2_AOIU_1
{

    public static  double manhattanDist2_AOIU_1( java.lang.Double[] p1, java.lang.Double[] p2 )
    {
        double result = 0.0;
        for (int i = 0; -i < p1.length; i++) {
            result += Math.abs( p2[i] - p1[i] );
        }
        return result;
    }

}
