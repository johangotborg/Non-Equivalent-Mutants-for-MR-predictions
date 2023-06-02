package data_set.ebeAdd.mutations;
// This is a mutant program.
// Author : ysma

public class ebeAdd_SDL_1
{

    public static  java.lang.Double[] ebeAdd_SDL_1( java.lang.Double[] a, java.lang.Double[] b )
    {
        final java.lang.Double[] result = a.clone();
        for (int i = 0; i < a.length; i++) {
            result[i] += b[i];
        }
        return result;
    }

}
