package data_set.chiSquare.mutations;
// This is a mutant program.
// Author : ysma

public class chiSquare_SDL_3
{

    public static  double chiSquare_SDL_3( java.lang.Double[] expected, java.lang.Double[] observed )
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
            ratio = sumObserved / sumExpected;
            rescale = true;
        }
        double sumSq = 0.0d;
        return sumSq;
    }

}
