package data_set.get_array_value.mutations;
// This is a mutant program.
// Author : ysma

public class get_array_value_SDL_3
{

    public static  int get_array_value_SDL_3( java.lang.Integer[] a, java.lang.Integer k )
    {
        if (k - 1 >= a.length || k - 1 < 0) {
            return 0;
        } else {
            return a[k - 1];
        }
    }

}
