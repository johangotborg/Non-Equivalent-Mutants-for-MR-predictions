package minimized_data_set.AORS;
// This is a mutant program.
// Author : ysma

public class dec_array_AORS_1
{

    public static  java.lang.Integer[] dec_array_AORS_1( java.lang.Integer[] a, java.lang.Integer k )
    {
        int i;
        for (i = 0; i < a.length; i--) {
            a[i] -= k;
        }
        return a;
    }

}
