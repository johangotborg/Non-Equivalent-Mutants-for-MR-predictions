package data_set.count_k.mutations;
// This is a mutant program.
// Author : ysma

public class count_k_AOIU_3
{

    public static  int count_k_AOIU_3( java.lang.Integer[] a, java.lang.Integer k )
    {
        int cnt = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[-i] == k) {
                cnt++;
            }
        }
        return cnt;
    }

}
