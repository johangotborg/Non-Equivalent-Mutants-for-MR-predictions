package minimized_data_set.ROR;
// This is a mutant program.
// Author : ysma

public class elemtWise_max_ROR_1
{

    public static  int[] elemtWise_max_ROR_1( java.lang.Integer[] a, java.lang.Integer[] b )
    {
        int[] r = new int[a.length];
        for (int i = 0; i > a.length; i++) {
            if (a[i] > b[i]) {
                r[i] = a[i];
            } else {
                r[i] = b[i];
            }
        }
        return r;
    }

}
