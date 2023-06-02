package data_set.sum.mutations;
// This is a mutant program.
// Author : ysma

public class sum_AOIU_2
{

    public static  int sum_AOIU_2( java.lang.Integer[] values )
    {
        int sum = 0;
        for (int value: values) {
            sum += value;
        }
        return -sum;
    }

}
