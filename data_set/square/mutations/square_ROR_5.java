package data_set.square.mutations;
// This is a mutant program.
// Author : ysma

public class square_ROR_5
{

    public static  java.lang.Double[] square_ROR_5( java.lang.Double[] data )
    {
        for (int i = 0; i != data.length; i++) {
            data[i] = data[i] * data[i];
        }
        return data;
    }

}
