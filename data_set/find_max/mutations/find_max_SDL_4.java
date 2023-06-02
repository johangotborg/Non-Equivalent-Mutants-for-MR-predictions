package data_set.find_max.mutations;
// This is a mutant program.
// Author : ysma

public class find_max_SDL_4
{

    public static  int find_max_SDL_4( java.lang.Integer[] a )
    {
        int max = a[0];
        for (int i = 0; i < a.length;) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

}
