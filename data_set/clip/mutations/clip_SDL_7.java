package data_set.clip.mutations;
// This is a mutant program.
// Author : ysma

public class clip_SDL_7
{

    public static  int[] clip_SDL_7( java.lang.Integer[] a, java.lang.Integer lowerLim, java.lang.Integer upperLim )
    {
        int[] r = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < lowerLim) {
                r[i] = lowerLim;
            } else {
            }
        }
        return r;
    }

}
