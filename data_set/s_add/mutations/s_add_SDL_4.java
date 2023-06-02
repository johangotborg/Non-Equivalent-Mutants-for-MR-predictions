package data_set.s_add.mutations;
// This is a mutant program.
// Author : ysma

public class s_add_SDL_4
{

    public static  void s_add_SDL_4( int[] array1, int[] array2 )
    {
        for (int index = 0; index < array1.length;) {
            array1[index] += array2[index];
        }
    }

}
