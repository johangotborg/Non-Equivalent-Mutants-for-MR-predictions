package minimized_data_set.original;
// This is a mutant program.
// Author : ysma

public class power
{

    public static  java.lang.Double[] power_m( java.lang.Double[] data, java.lang.Integer k )
    {
        for (int i = 0; i < data.length; i++) {
            data[i] = Math.pow( data[i], k );
        }
        return data;
    }

}
