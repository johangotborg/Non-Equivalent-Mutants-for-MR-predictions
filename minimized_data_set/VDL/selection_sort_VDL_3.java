package minimized_data_set.VDL;
// This is a mutant program.
// Author : ysma

public class selection_sort_VDL_3
{

    public static  java.lang.Integer[] selection_sort_VDL_3( java.lang.Integer[] list )
    {
        int i;
        int j;
        int min;
        for (i = 0; i < list.length - 1; i++) {
            min = i;
            for (j = 1; j < list.length; j++) {
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