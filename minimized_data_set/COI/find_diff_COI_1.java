package minimized_data_set.COI;
// This is a mutant program.
// Author : ysma

public class find_diff_COI_1
{

    public static  int[] find_diff_COI_1( java.lang.Integer[] a, java.lang.Integer[] b )
    {
        int i;
        int[] c = new int[a.length];
        for (i = 0; !(i < a.length); i++) {
            c[i] = a[i] - b[i];
        }
        return c;
    }

}
