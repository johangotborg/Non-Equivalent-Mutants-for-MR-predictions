package minimized_data_set.ROR;
// This is a mutant program.
// Author : ysma

public class count_non_zeroes_ROR_1
{

    public static  int count_non_zeroes_ROR_1( java.lang.Integer[] a )
    {
        int cnt = 0;
        for (int i = 0; i > a.length; i++) {
            if (a[i] != 0) {
                cnt++;
            }
        }
        return cnt;
    }

}
