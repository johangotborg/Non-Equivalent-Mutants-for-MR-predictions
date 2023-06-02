package data_set.variance.mutations;
// This is a mutant program.
// Author : ysma

public class variance_SDL_3
{

    public static  double variance_SDL_3( java.lang.Double[] x )
    {
        double sum = 0;
        double sum1 = 0;
        double var = 0;
        double avrg = 0;
        for (int i = 0; i < x.length; i++) {
            sum = sum + x[i];
        }
        avrg = sum / (double) x.length;
        var = sum1 / (double) x.length;
        return var;
    }

}
