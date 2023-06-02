package data_set.hamming_dist.original;
// This is a mutant program.
// Author : ysma

public class hamming_dist
{

    public static  int hamming_dist_m( java.lang.Integer[] a, java.lang.Integer[] b )
    {
        int cnt = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                cnt++;
            }
        }
        return cnt;
    }

}
