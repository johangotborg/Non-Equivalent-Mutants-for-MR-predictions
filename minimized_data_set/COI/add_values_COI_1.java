package minimized_data_set.COI;
// This is a mutant program.
// Author : ysma

public class add_values_COI_1
{

    public static  int add_values_COI_1( java.lang.Integer[] a )
    {
        int sum = 0;
        for (int i = 0; !(i < a.length); i++) {
            sum += a[i];
        }
        return sum;
    }

}
