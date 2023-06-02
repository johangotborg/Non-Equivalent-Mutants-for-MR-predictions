package data_set.check_equal.mutations;
// This is a mutant program.
// Author : ysma

public class check_equal_ROR_4
{

    public static  boolean check_equal_ROR_4( java.lang.Integer[] a, java.lang.Integer[] b )
    {
        if (a.length <= b.length) {
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
