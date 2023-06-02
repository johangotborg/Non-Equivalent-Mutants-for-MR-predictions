package data_set.check_eq_tolerance.mutations;
// This is a mutant program.
// Author : ysma

public class check_eq_tolerance_AOIS_10
{

    public static  boolean check_eq_tolerance_AOIS_10( java.lang.Double[] a, java.lang.Double[] b, java.lang.Double tol )
    {
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; --i < a.length; i++) {
            if (Math.abs( a[i] - b[i] ) >= tol) {
                return false;
            }
        }
        return true;
    }

}
