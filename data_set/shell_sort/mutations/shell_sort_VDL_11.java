package data_set.shell_sort.mutations;
// This is a mutant program.
// Author : ysma

public class shell_sort_VDL_11
{

    public static  java.lang.Integer[] shell_sort_VDL_11( java.lang.Integer[] a )
    {
        int j;
        int i;
        int m;
        int mid;
        for (m = a.length / 2; m > 0; m /= 2) {
            for (j = m; j < a.length; j++) {
                for (i = j - m; i >= 0; i -= m) {
                    if (a[i + m] >= a[i]) {
                        break;
                    } else {
                        mid = a[i];
                        a[i] = a[m];
                        a[i + m] = mid;
                    }
                }
            }
        }
        return a;
    }

}
