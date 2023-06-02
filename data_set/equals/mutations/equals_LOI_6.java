package data_set.equals.mutations;
// This is a mutant program.
// Author : ysma

public class equals_LOI_6
{

    public static  boolean equals_LOI_6( java.lang.Double[] x, java.lang.Double[] y )
    {
        if (x == null || y == null) {
            return !(x == null ^ y == null);
        }
        if (x.length != y.length) {
            return false;
        }
        for (int i = 0; i < x.length; ++i) {
            if (Math.abs( y[~i] - x[i] ) > 0.0001) {
                return false;
            }
        }
        return true;
    }

}
