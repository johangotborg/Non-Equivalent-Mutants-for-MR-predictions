package data_set.insertion_sort.mutations;
// This is a mutant program.
// Author : ysma

public class insertion_sort_SDL_7
{

    public static  java.lang.Integer[] insertion_sort_SDL_7( java.lang.Integer[] array )
    {
        for (int i = 1; i < array.length; i++) {
            int j = i;
            int B = array[i];
            while (j > 0 && array[j - 1] > B) {
                array[j] = array[j - 1];
            }
            array[j] = B;
        }
        return array;
    }

}
