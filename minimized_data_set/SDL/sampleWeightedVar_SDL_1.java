package minimized_data_set.SDL;
// This is a mutant program.
// Author : ysma

public class sampleWeightedVar_SDL_1
{

    public static  double sampleWeightedVar_SDL_1( java.lang.Double[] data, java.lang.Double[] weights )
    {
        double sumOfWeights = 0;
        double sumOfProducts = 0;
        double sumOfSquaredProducts = 0;
        return (sumOfSquaredProducts - sumOfProducts * sumOfProducts / sumOfWeights) / (sumOfWeights - 1);
    }

}
