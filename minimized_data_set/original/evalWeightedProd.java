package minimized_data_set.original;
// This is a mutant program.
// Author : ysma

public class evalWeightedProd
{

    public static  double evalWeightedProd_m( final java.lang.Double[] values, final java.lang.Double[] weights, final java.lang.Integer begin, final java.lang.Integer length )
    {
        double product = Double.NaN;
        product = 1.0;
        for (int i = begin; i < begin + length; i++) {
            product *= Math.pow( values[i], weights[i] );
        }
        return product;
    }

}
