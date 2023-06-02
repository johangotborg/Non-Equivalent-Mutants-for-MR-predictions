package minimized_data_set.original;
// This is a mutant program.
// Author : ysma

public class clip
{

    public static  int[] clip_m( java.lang.Integer[] a, java.lang.Integer lowerLim, java.lang.Integer upperLim )
    {
        int[] r = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < lowerLim) {
                r[i] = lowerLim;
            } else {
                if (a[i] > upperLim) {
                    r[i] = upperLim;
                } else {
                    r[i] = a[i];
                }
            }
        }
        return r;
    }

}
