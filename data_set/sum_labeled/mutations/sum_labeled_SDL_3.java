package data_set.sum_labeled.mutations;
// This is a mutant program.
// Author : ysma

public class sum_labeled_SDL_3
{

    public static  double sum_labeled_SDL_3( int[] a, int i, int j )
    {
        if (i < 0 || i >= a.length || j < 0 || j >= a.length) {
            return 0;
        } else {
            return a[i] + a[j] / 2.0;
        }
    }

}