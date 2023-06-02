package data_set.dec.mutations;
// This is a mutant program.
// Author : ysma

public class dec_AOIU_3
{

    public static  void dec_AOIU_3ethod( int[] array1, int[] array2 )
    {
        for (int index = 0; index < array1.length; index++) {
            array1[index] -= array2[-index];
        }
    }

}
