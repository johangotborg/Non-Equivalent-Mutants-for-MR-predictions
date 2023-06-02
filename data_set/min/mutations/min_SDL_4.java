package data_set.min.mutations;
// This is a mutant program.
// Author : ysma

public class min_SDL_4
{

    public static  double min_SDL_4( java.lang.Double[] elements )
    {
        int size = elements.length;
        double min = elements[size - 1];
        for (int i = size - 1; --i >= 0;) {
            if (elements[i] < min) {
            }
        }
        return min;
    }

}
