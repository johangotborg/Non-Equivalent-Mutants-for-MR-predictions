package minimized_data_set.COI;
// This is a mutant program.
// Author : ysma

public class array_copy_COI_1
{

    public static  int[] array_copy_COI_1( java.lang.Integer[] a )
    {
        int i;
        int[] b = new int[a.length];
        for (i = 0; !(i < a.length); i++) {
            b[i] = a[i];
        }
        return b;
    }

}
