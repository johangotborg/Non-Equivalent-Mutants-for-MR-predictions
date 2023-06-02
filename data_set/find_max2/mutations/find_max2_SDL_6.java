package data_set.find_max2.mutations;
// This is a mutant program.
// Author : ysma

public class find_max2_SDL_6
{

    public static  int find_max2_SDL_6( java.lang.Integer[] a )
    {
        int max = a[0] + a[1];
        for (int i = 0; i < a.length - 1; i++) {
            if (true) {
                max = a[i] + a[i + 1];
            }
        }
        return max;
    }

}
