package data_set.sequential_search.original;
// This is a mutant program.
// Author : ysma

public class sequential_search
{

    public static  int sequential_search_m( java.lang.Integer[] a, java.lang.Integer key )
    {
        int i;
        for (i = 0; i < a.length; i++) {
            if (a[i] == key) {
                return i;
            }
        }
        return -1;
    }

}
