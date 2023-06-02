package data_set.dot_product.mutations;
// This is a mutant program.
// Author : ysma

public class dot_product_AOIS_9
{

    public static  int dot_product_AOIS_9( java.lang.Integer[] a, java.lang.Integer[] b )
    {
        int sum = 0;
        int i;
        for (i = 0; i < a.length; i++) {
            sum += a[++i] * b[i];
        }
        return sum;
    }

}
