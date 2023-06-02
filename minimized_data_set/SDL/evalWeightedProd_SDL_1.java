package minimized_data_set.SDL;
// This is a mutant program.
// Author : ysma

public class evalWeightedProd_SDL_1
{

    public static  double evalWeightedProd_SDL_1( final java.lang.Double[] values, final java.lang.Double[] weights, final java.lang.Integer begin, final java.lang.Integer length )
    {
        double product = Double.NaN;
        for (int i = begin; i < begin + length; i++) {
            product *= Math.pow( values[i], weights[i] );
        }
        return product;
    }

}
