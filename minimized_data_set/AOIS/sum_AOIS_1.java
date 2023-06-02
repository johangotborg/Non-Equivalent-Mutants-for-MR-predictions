package minimized_data_set.AOIS;
// This is a mutant program.
// Author : ysma

public class sum_AOIS_1
{

    public static  int sum_AOIS_1( java.lang.Integer[] values )
    {
        int sum = 0;
        for (int value: values) {
            sum += ++value;
        }
        return sum;
    }

}
