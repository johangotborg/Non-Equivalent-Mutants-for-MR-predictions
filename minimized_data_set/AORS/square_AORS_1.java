package minimized_data_set.AORS;
// This is a mutant program.
// Author : ysma

public class square_AORS_1
{

    public static  java.lang.Double[] square_AORS_1( java.lang.Double[] data )
    {
        for (int i = 0; i < data.length; i--) {
            data[i] = data[i] * data[i];
        }
        return data;
    }

}
