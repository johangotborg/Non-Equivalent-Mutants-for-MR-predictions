package data_set.canberraDist.mutations;
// This is a mutant program.
// Author : ysma

public class canberraDist_ODL_13
{

    public static  double canberraDist_ODL_13( java.lang.Double[] a, java.lang.Double[] b )
    {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            final double num = Math.abs( a[i] - b[i] );
            final double denom = Math.abs( a[i] ) + Math.abs( b[i] );
            sum += denom == 0.0 ? 0.0 : num / denom;
        }
        return sum;
    }

}
