package data_set.cnt_zeroes.mutations;
// This is a mutant program.
// Author : ysma

public class cnt_zeroes_SDL_7
{

    public static  int cnt_zeroes_SDL_7( java.lang.Integer[] a )
    {
        int cnt = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                cnt++;
            }
        }
        return 0;
    }

}
