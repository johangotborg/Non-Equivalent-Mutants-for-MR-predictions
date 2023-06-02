package minimized_data_set.ODL;
// This is a mutant program.
// Author : ysma

public class evalWeightedProd_ODL_1
{

    public static  double evalWeightedProd_ODL_1( final java.lang.Double[] values, final java.lang.Double[] weights, final java.lang.Integer begin, final java.lang.Integer length )
    {
        double product = Double.NaN;
        product = 1.0;
        for (int i = begin; i < begin; i++) {
            product *= Math.pow( values[i], weights[i] );
        }
        return product;
    }

}
