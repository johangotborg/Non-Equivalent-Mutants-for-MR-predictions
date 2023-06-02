package data_set.selection_sort.original;
// This is a mutant program.
// Author : ysma

public class selection_sort
{

    public static  java.lang.Integer[] selection_sort_m( java.lang.Integer[] list )
    {
        int i;
        int j;
        int min;
        for (i = 0; i < list.length - 1; i++) {
            min = i;
            for (j = i + 1; j < list.length; j++) {
                if (list[j] < list[min]) {
                    min = j;
                }
            }
            int tmp = list[i];
            list[i] = list[min];
            list[min] = tmp;
        }
        return list;
    }

}
