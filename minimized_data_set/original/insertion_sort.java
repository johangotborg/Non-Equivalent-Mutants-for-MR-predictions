package minimized_data_set.original;
// This is a mutant program.
// Author : ysma

public class insertion_sort
{

    public static  java.lang.Integer[] insertion_sort_m( java.lang.Integer[] array )
    {
        for (int i = 1; i < array.length; i++) {
            int j = i;
            int B = array[i];
            while (j > 0 && array[j - 1] > B) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = B;
        }
        return array;
    }

}
