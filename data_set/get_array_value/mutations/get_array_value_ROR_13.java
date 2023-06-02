package data_set.get_array_value.mutations;
// This is a mutant program.
// Author : ysma

public class get_array_value_ROR_13
{

    public static  int get_array_value_ROR_13( java.lang.Integer[] a, java.lang.Integer k )
    {
        if (k - 1 >= a.length || true) {
            return -100000;
        } else {
            return a[k - 1];
        }
    }

}
