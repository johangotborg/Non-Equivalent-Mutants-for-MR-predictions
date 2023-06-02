package data_set.reverse.mutations;
// This is a mutant program.
// Author : ysma

public class reverse_COI_1
{

    public static  int[] reverse_COI_1( java.lang.Integer[] a )
    {
        int[] r = new int[a.length];
        int cnt = 0;
        for (int i = a.length - 1; !(i >= 0); i--) {
            r[cnt] = a[i];
            cnt++;
        }
        return r;
    }

}
