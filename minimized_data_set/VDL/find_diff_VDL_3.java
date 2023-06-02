package minimized_data_set.VDL;
// This is a mutant program.
// Author : ysma

public class find_diff_VDL_3
{

    public static  int[] find_diff_VDL_3( java.lang.Integer[] a, java.lang.Integer[] b )
    {
        int i;
        int[] c = new int[a.length];
        for (i = 0; i < a.length; i++) {
            c[i] = b[i];
        }
        return c;
    }

}
