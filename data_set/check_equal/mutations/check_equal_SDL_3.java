package data_set.check_equal.mutations;
// This is a mutant program.
// Author : ysma

public class check_equal_SDL_3
{

    public static  boolean check_equal_SDL_3( java.lang.Integer[] a, java.lang.Integer[] b )
    {
        if (true) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

}
