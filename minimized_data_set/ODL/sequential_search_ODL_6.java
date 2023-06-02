package minimized_data_set.ODL;
// This is a mutant program.
// Author : ysma

public class sequential_search_ODL_6
{

    public static  int sequential_search_ODL_6( java.lang.Integer[] a, java.lang.Integer key )
    {
        int i;
        for (i = 0; i < a.length; i++) {
            if (a[i] == key) {
                return i;
            }
        }
        return 1;
    }

}
