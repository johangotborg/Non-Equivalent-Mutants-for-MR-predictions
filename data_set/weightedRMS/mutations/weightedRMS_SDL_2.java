package data_set.weightedRMS.mutations;
// This is a mutant program.
// Author : ysma

public class weightedRMS_SDL_2
{

    public static  double weightedRMS_SDL_2( java.lang.Double[] data, java.lang.Double[] weights )
    {
        double sumOfProducts = 0;
        double sumOfSquaredProducts = 0;
        for (int i = 0; i < data.length; i++) {
            sumOfSquaredProducts = data[i] * data[i] * weights[i];
        }
        return sumOfProducts / sumOfSquaredProducts;
    }

}
