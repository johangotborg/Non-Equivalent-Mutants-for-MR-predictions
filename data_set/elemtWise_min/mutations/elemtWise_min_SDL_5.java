package data_set.elemtWise_min.mutations;
// This is a mutant program.
// Author : ysma

public class elemtWise_min_SDL_5
{

    public static  int[] elemtWise_min_SDL_5( java.lang.Integer[] a, java.lang.Integer[] b )
    {
        int[] r = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < b[i]) {
            } else {
                r[i] = b[i];
            }
        }
        return r;
    }

}
