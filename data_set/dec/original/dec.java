package data_set.dec.original;
// This is a mutant program.
// Author : ysma

public class dec
{

    public static  void dec_method( int[] array1, int[] array2 )
    {
        for (int index = 0; index < array1.length; index++) {
            array1[index] -= array2[index];
        }
    }

}
