package data_set.tanimotoDist.mutations;
// This is a mutant program.
// Author : ysma

public class tanimotoDist_SDL_1
{

    public static  double tanimotoDist_SDL_1( java.lang.Double[] p1, java.lang.Double[] p2 )
    {
        double ab = 0;
        double aSq = 0;
        double bSq = 0;
        double denominator = aSq + bSq - ab;
        if (denominator < ab) {
            denominator = ab;
        }
        if (denominator > 0) {
            return 1.0 - ab / denominator;
        } else {
            return 0.0;
        }
    }

}
