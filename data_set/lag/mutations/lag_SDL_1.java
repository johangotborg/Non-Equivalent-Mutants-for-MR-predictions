package data_set.lag.mutations;
// This is a mutant program.
// Author : ysma

public class lag_SDL_1
{

    public static  double lag_SDL_1( java.lang.Double[] elements, java.lang.Double mean )
    {
        int size = elements.length;
        double r1;
        double q = 0;
        double v = (elements[0] - mean) * (elements[0] - mean);
        r1 = q / v;
        return r1;
    }

}
