package minimized_data_set.ODL;
// This is a mutant program.
// Author : ysma

public class bubble_ODL_1
{

    public static  java.lang.Integer[] bubble_ODL_1( java.lang.Integer[] a )
    {
        int i;
        int j;
        int t;
        for (i = a.length; i >= 0; i--) {
            for (j = 0; j <= i; j++) {
                if (a[j] > a[j + 1]) {
                    t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }
        return a;
    }

}
