package data_set.dec.mutations;
// This is a mutant program.
// Author : ysma

public class dec_AOIS_10
{

    public static  void dec_AOIS_10ethod( int[] array1, int[] array2 )
    {
        for (int index = 0; index < array1.length; index++) {
            array1[index] -= array2[--index];
        }
    }

}
