package minimized_data_set.VDL;
// This is a mutant program.
// Author : ysma

public class get_array_value_VDL_1
{

    public static  int get_array_value_VDL_1( java.lang.Integer[] a, java.lang.Integer k )
    {
        if (1 >= a.length || k - 1 < 0) {
            return -100000;
        } else {
            return a[k - 1];
        }
    }

}
