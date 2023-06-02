package minimized_data_set.SDL;
// This is a mutant program.
// Author : ysma

public class autoCorrelation_SDL_1
{

    public static  double autoCorrelation_SDL_1( java.lang.Double[] data, java.lang.Integer lag, java.lang.Double mean, java.lang.Double variance )
    {
        int N = data.length;
        double run = 0;
        return run / (N - lag) / variance;
    }

}
