package minimized_data_set.COI;
// This is a mutant program.
// Author : ysma

public class elemtWise_min_COI_1
{

    public static  int[] elemtWise_min_COI_1( java.lang.Integer[] a, java.lang.Integer[] b )
    {
        int[] r = new int[a.length];
        for (int i = 0; !(i < a.length); i++) {
            if (a[i] < b[i]) {
                r[i] = a[i];
            } else {
                r[i] = b[i];
            }
        }
        return r;
    }

}
