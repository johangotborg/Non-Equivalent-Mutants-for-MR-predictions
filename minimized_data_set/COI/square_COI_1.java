package minimized_data_set.COI;
// This is a mutant program.
// Author : ysma

public class square_COI_1
{

    public static  java.lang.Double[] square_COI_1( java.lang.Double[] data )
    {
        for (int i = 0; !(i < data.length); i++) {
            data[i] = data[i] * data[i];
        }
        return data;
    }

}
