package data_set.check_eq_tolerance.mutations;
// This is a mutant program.
// Author : ysma

public class check_eq_tolerance_ROR_6
{

    public static  boolean check_eq_tolerance_ROR_6( java.lang.Double[] a, java.lang.Double[] b, java.lang.Double tol )
    {
        if (true) {
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
