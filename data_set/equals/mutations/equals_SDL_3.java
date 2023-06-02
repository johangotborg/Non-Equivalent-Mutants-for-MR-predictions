package data_set.equals.mutations;
// This is a mutant program.
// Author : ysma

public class equals_SDL_3
{

    public static  boolean equals_SDL_3( java.lang.Double[] x, java.lang.Double[] y )
    {
        if (x == null || y == null) {
            return !(x == null ^ y == null);
        }
        if (x.length != y.length) {
            return false;
        }
        return true;
    }

}
