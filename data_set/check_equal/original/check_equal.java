package data_set.check_equal.original;
// This is a mutant program.
// Author : ysma

public class check_equal
{

    public static  boolean check_equal_m( java.lang.Integer[] a, java.lang.Integer[] b )
    {
        if (a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }

}
