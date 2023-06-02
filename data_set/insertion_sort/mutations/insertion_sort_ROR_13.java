package data_set.insertion_sort.mutations;
// This is a mutant program.
// Author : ysma

public class insertion_sort_ROR_13
{

    public static  java.lang.Integer[] insertion_sort_ROR_13( java.lang.Integer[] array )
    {
        for (int i = 1; i < array.length; i++) {
            int j = i;
            int B = array[i];
            while (true && array[j - 1] > B) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = B;
        }
        return array;
    }

}
