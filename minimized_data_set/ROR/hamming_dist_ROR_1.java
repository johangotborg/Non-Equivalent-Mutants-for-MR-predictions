package minimized_data_set.ROR;
// This is a mutant program.
// Author : ysma

public class hamming_dist_ROR_1
{

    public static  int hamming_dist_ROR_1( java.lang.Integer[] a, java.lang.Integer[] b )
    {
        int cnt = 0;
        for (int i = 0; i > a.length; i++) {
            if (a[i] != b[i]) {
                cnt++;
            }
        }
        return cnt;
    }

}
