package data_set.get_array_value.mutations;
// This is a mutant program.
// Author : ysma

public class get_array_value_CDL_1
{

    public static  int get_array_value_CDL_1( java.lang.Integer[] a, java.lang.Integer k )
    {
        if (k >= a.length || k - 1 < 0) {
            return -100000;
        } else {
            return a[k - 1];
        }
    }

}
