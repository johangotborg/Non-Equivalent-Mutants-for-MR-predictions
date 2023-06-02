package minimized_data_set.original;
// This is a mutant program.
// Author : ysma

public class sum
{

    public static  int sum_m( java.lang.Integer[] values )
    {
        int sum = 0;
        for (int value: values) {
            sum += value;
        }
        return sum;
    }

}
