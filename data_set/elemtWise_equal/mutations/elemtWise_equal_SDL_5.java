package data_set.elemtWise_equal.mutations;
// This is a mutant program.
// Author : ysma

public class elemtWise_equal_SDL_5
{

    public static  boolean[] elemtWise_equal_SDL_5( java.lang.Integer[] a, java.lang.Integer[] b )
    {
        boolean[] r = new boolean[a.length];
        for (int i = 0; i < a.length; i++) {
            if (a[i] == b[i]) {
            } else {
                r[i] = false;
            }
        }
        return r;
    }

}
