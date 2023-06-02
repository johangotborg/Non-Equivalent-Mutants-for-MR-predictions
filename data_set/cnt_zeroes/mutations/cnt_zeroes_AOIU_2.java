package data_set.cnt_zeroes.mutations;
// This is a mutant program.
// Author : ysma

public class cnt_zeroes_AOIU_2
{

    public static  int cnt_zeroes_AOIU_2( java.lang.Integer[] a )
    {
        int cnt = 0;
        for (int i = 0; i < -a.length; i++) {
            if (a[i] == 0) {
                cnt++;
            }
        }
        return cnt;
    }

}
