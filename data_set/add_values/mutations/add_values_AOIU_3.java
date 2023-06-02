package data_set.add_values.mutations;
// This is a mutant program.
// Author : ysma

public class add_values_AOIU_3
{

    public static  int add_values_AOIU_3( java.lang.Integer[] a )
    {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[-i];
        }
        return sum;
    }

}
