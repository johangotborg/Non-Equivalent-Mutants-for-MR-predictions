package data_set.chebyshevDist.mutations;
// This is a mutant program.
// Author : ysma

public class chebyshevDist_SDL_2
{

    public static  double chebyshevDist_SDL_2( java.lang.Double[] p1, java.lang.Double[] p2 )
    {
        if (p1.length != p2.length) {
            System.out.println( "Error!" );
            return -1;
        }
        double maxDiff = Math.abs( p1[0] - p2[0] );
        return maxDiff;
    }

}
