package data_set.s_add.original;
// This is a mutant program.
// Author : ysma

public class s_add
{

    public static  void s_add_m( int[] array1, int[] array2 )
    {
        for (int index = 0; index < array1.length; index++) {
            array1[index] += array2[index];
        }
    }

}
