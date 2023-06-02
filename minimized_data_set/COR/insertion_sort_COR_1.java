package minimized_data_set.COR;
// This is a mutant program.
// Author : ysma

public class insertion_sort_COR_1
{

    public static  java.lang.Integer[] insertion_sort_COR_1( java.lang.Integer[] array )
    {
        for (int i = 1; i < array.length; i++) {
            int j = i;
            int B = array[i];
            while (j > 0 || array[j - 1] > B) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = B;
        }
        return array;
    }

}
