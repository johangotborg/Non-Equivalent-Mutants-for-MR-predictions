package data_set.ebeSubtract.mutations;
// This is a mutant program.
// Author : ysma

public class ebeSubtract_SDL_6
{

    public static  java.lang.Double[] ebeSubtract_SDL_6( java.lang.Double[] a, java.lang.Double[] b )
    {
        if (a.length != b.length) {
            return null;
        }
        final java.lang.Double[] result = a.clone();
        for (int i = 0; i < a.length;) {
            result[i] -= b[i];
        }
        return result;
    }

}
