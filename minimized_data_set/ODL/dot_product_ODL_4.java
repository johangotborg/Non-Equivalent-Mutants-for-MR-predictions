package minimized_data_set.ODL;
// This is a mutant program.
// Author : ysma

public class dot_product_ODL_4
{

    public static  int dot_product_ODL_4( java.lang.Integer[] a, java.lang.Integer[] b )
    {
        int sum = 0;
        int i;
        for (i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

}
