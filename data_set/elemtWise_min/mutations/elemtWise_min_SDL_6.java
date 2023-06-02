package data_set.elemtWise_min.mutations;
// This is a mutant program.
// Author : ysma

public class elemtWise_min_SDL_6
{

    public static  int[] elemtWise_min_SDL_6( java.lang.Integer[] a, java.lang.Integer[] b )
    {
        int[] r = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (true) {
                r[i] = a[i];
            } else {
                r[i] = b[i];
            }
        }
        return r;
    }

}
