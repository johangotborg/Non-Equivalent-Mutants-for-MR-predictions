package minimized_data_set.original;
// This is a mutant program.
// Author : ysma

public class count_non_zeroes
{

    public static  int count_non_zeroes_m( java.lang.Integer[] a )
    {
        int cnt = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                cnt++;
            }
        }
        return cnt;
    }

}
