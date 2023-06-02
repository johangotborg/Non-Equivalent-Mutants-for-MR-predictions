package data_set.count_non_zeroes.mutations;
// This is a mutant program.
// Author : ysma

public class count_non_zeroes_AOIU_4
{

    public static  int count_non_zeroes_AOIU_4( java.lang.Integer[] a )
    {
        int cnt = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                cnt++;
            }
        }
        return -cnt;
    }

}
