package minimized_data_set.COI;
// This is a mutant program.
// Author : ysma

public class array_calc_COI_1
{

    public static  int[] array_calc_COI_1( java.lang.Integer[] a, java.lang.Integer k )
    {
        int i;
        int[] b = new int[a.length];
        for (i = 0; !(i < a.length); i++) {
            b[i] = a[i] / k;
        }
        return b;
    }

}
