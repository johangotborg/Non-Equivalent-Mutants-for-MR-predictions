package data_set.chiSquare.mutations;
// This is a mutant program.
// Author : ysma

public class chiSquare_SDL_8
{

    public static  double chiSquare_SDL_8( java.lang.Double[] expected, java.lang.Double[] observed )
    {
        double sumExpected = 0d;
        double sumObserved = 0d;
        for (int i = 0; i < observed.length; i++) {
            sumExpected += expected[i];
            sumObserved += observed[i];
        }
        double ratio = 1.0d;
        boolean rescale = false;
        if (Math.abs( sumExpected - sumObserved ) > 10E-6) {
            rescale = true;
        }
        double sumSq = 0.0d;
        for (int i = 0; i < observed.length; i++) {
            if (rescale) {
                final double dev = observed[i] - ratio * expected[i];
                sumSq += dev * dev / (ratio * expected[i]);
            } else {
                final double dev = observed[i] - expected[i];
                sumSq += dev * dev / expected[i];
            }
        }
        return sumSq;
    }

}
