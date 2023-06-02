package data_set.sum.mutations;
// This is a mutant program.
// Author : ysma

public class sum_ASRS_3
{

    public static  int sum_ASRS_3( java.lang.Integer[] values )
    {
        int sum = 0;
        for (int value: values) {
            sum -= value;
        }
        return sum;
    }

}
