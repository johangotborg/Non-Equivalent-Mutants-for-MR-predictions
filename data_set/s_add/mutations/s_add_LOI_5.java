package data_set.s_add.mutations;
// This is a mutant program.
// Author : ysma

public class s_add_LOI_5
{

    public static  void s_add_LOI_5( int[] array1, int[] array2 )
    {
        for (int index = 0; index < array1.length; index++) {
            array1[index] += array2[~index];
        }
    }

}
