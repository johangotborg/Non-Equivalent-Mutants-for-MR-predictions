package minimized_data_set.LOI;
// This is a mutant program.
// Author : ysma

public class power_LOI_1
{

    public static  java.lang.Double[] power_LOI_1( java.lang.Double[] data, java.lang.Integer k )
    {
        for (int i = 0; ~i < data.length; i++) {
            data[i] = Math.pow( data[i], k );
        }
        return data;
    }

}
