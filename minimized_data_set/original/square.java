package minimized_data_set.original;
// This is a mutant program.
// Author : ysma

public class square
{

    public static  java.lang.Double[] square_m( java.lang.Double[] data )
    {
        for (int i = 0; i < data.length; i++) {
            data[i] = data[i] * data[i];
        }
        return data;
    }

}
