package minimized_data_set.COI;
// This is a mutant program.
// Author : ysma

public class power_COI_1
{

    public static  java.lang.Double[] power_COI_1( java.lang.Double[] data, java.lang.Integer k )
    {
        for (int i = 0; !(i < data.length); i++) {
            data[i] = Math.pow( data[i], k );
        }
        return data;
    }

}
