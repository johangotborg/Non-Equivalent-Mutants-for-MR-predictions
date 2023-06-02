package data_set.product.original;
// This is a mutant program.
// Author : ysma

public class product
{

    public static  double product_m( java.lang.Double[] elements )
    {
        int size = elements.length;
        double product = 1;
        for (int i = size; --i >= 0;) {
            product *= elements[i];
        }
        return product;
    }

}
