package data_set.find_max2.mutations;
// This is a mutant program.
// Author : ysma

public class find_max2_SDL_5
{

    public static  int find_max2_SDL_5( java.lang.Integer[] a )
    {
        int max = a[0] + a[1];
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] + a[i + 1] > max) {
            }
        }
        return max;
    }

}
