package data_set.durbinWatson.mutations;
// This is a mutant program.
// Author : ysma

public class durbinWatson_SDL_4
{

    public static  double durbinWatson_SDL_4( java.lang.Double[] elements )
    {
        int size = elements.length;
        double run = 0;
        for (int i = 1; i < size;) {
            double x = elements[i] - elements[i - 1];
            run += x * x;
        }
        return run;
    }

}
