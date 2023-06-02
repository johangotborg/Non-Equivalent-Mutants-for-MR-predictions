package minimized_data_set.original;
// This is a mutant program.
// Author : ysma

public class find_max
{

    public static  int find_max_m( java.lang.Integer[] a )
    {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

}
