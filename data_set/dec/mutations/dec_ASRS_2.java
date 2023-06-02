package data_set.dec.mutations;
// This is a mutant program.
// Author : ysma

public class dec_ASRS_2
{

    public static  void dec_ASRS_2ethod( int[] array1, int[] array2 )
    {
        for (int index = 0; index < array1.length; index++) {
            array1[index] /= array2[index];
        }
    }

}
