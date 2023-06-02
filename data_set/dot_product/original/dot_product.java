package data_set.dot_product.original;
// This is a mutant program.
// Author : ysma

public class dot_product
{

    public static  int dot_product_m( java.lang.Integer[] a, java.lang.Integer[] b )
    {
        int sum = 0;
        int i;
        for (i = 0; i < a.length; i++) {
            sum += a[i] * b[i];
        }
        return sum;
    }

}
