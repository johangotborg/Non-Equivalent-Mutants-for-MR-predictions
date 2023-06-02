package minimized_data_set.VDL;
// This is a mutant program.
// Author : ysma

public class reverse_VDL_2
{

    public static  int[] reverse_VDL_2( java.lang.Integer[] a )
    {
        int[] r = new int[a.length];
        int cnt = 0;
        for (int i = a.length - 1; i >= 0;  ) {
            r[cnt] = a[i];
            cnt++;
        }
        return r;
    }

}
