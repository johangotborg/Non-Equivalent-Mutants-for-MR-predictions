package data_set.power.mutations;
// This is a mutant program.
// Author : ysma

public class power_ROR_3
{

    public static  java.lang.Double[] power_ROR_3( java.lang.Double[] data, java.lang.Integer k )
    {
        for (int i = 0; i <= data.length; i++) {
            data[i] = Math.pow( data[i], k );
        }
        return data;
    }

}
