package data_set.hamming_dist.mutations;
// This is a mutant program.
// Author : ysma

public class hamming_dist_SDL_4
{

    public static  int hamming_dist_SDL_4( java.lang.Integer[] a, java.lang.Integer[] b )
    {
        int cnt = 0;
        for (int i = 0; i < a.length;) {
            if (a[i] != b[i]) {
                cnt++;
            }
        }
        return cnt;
    }

}
