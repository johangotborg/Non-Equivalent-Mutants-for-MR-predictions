package minimized_data_set.VDL;
// This is a mutant program.
// Author : ysma

public class canberraDist_VDL_3
{

    public static  double canberraDist_VDL_3( java.lang.Double[] a, java.lang.Double[] b )
    {
        double sum = 0;
        for (int i = 0; i < a.length; i++) {
            final double num = Math.abs( b[i] );
            final double denom = Math.abs( a[i] ) + Math.abs( b[i] );
            sum += num == 0.0 && denom == 0.0 ? 0.0 : num / denom;
        }
        return sum;
    }

}
