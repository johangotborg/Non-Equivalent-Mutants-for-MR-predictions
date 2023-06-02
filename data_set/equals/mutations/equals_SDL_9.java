package data_set.equals.mutations;
// This is a mutant program.
// Author : ysma

public class equals_SDL_9
{

    public static  boolean equals_SDL_9( java.lang.Double[] x, java.lang.Double[] y )
    {
        if (x == null || y == null) {
            return !(x == null ^ y == null);
        }
        if (x.length != y.length) {
            return false;
        }
        for (int i = 0; i < x.length; ++i) {
        }
        return true;
    }

}
