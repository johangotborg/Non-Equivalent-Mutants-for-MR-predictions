package data_set.check_eq_tolerance.mutations;
// This is a mutant program.
// Author : ysma

public class check_eq_tolerance_ROR_7
{

    public static  boolean check_eq_tolerance_ROR_7( java.lang.Double[] a, java.lang.Double[] b, java.lang.Double tol )
    {
        if (false) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (Math.abs( a[i] - b[i] ) >= tol) {
                return false;
            }
        }
        return true;
    }

}
