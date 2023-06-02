package data_set.get_array_value.mutations;
// This is a mutant program.
// Author : ysma

public class get_array_value_ROR_14
{

    public static  int get_array_value_ROR_14( java.lang.Integer[] a, java.lang.Integer k )
    {
        if (k - 1 >= a.length || false) {
            return -100000;
        } else {
            return a[k - 1];
        }
    }

}
