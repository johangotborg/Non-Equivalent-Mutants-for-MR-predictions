package data_set.square.mutations;
// This is a mutant program.
// Author : ysma

public class square_AOIS_2
{

    public static  java.lang.Double[] square_AOIS_2( java.lang.Double[] data )
    {
        for (int i = 0; --i < data.length; i++) {
            data[i] = data[i] * data[i];
        }
        return data;
    }

}
