package data_set.ebeAdd.mutations;
// This is a mutant program.
// Author : ysma

public class ebeAdd_LOI_4
{

    public static  java.lang.Double[] ebeAdd_LOI_4( java.lang.Double[] a, java.lang.Double[] b )
    {
        if (a.length != b.length) {
            return null;
        }
        final java.lang.Double[] result = a.clone();
        for (int i = 0; i < ~a.length; i++) {
            result[i] += b[i];
        }
        return result;
    }

}
