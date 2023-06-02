package data_set.get_array_value.mutations;
// This is a mutant program.
// Author : ysma

public class get_array_value_ODL_9
{

    public static  int get_array_value_ODL_9( java.lang.Integer[] a, java.lang.Integer k )
    {
        if (k - 1 >= a.length) {
            return -100000;
        } else {
            return a[k - 1];
        }
    }

}
