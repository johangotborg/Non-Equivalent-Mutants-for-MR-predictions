package minimized_data_set.LOI;
// This is a mutant program.
// Author : ysma

public class count_k_LOI_1
{

    public static  int count_k_LOI_1( java.lang.Integer[] a, java.lang.Integer k )
    {
        int cnt = 0;
        for (int i = 0; ~i < a.length; i++) {
            if (a[i] == k) {
                cnt++;
            }
        }
        return cnt;
    }

}
