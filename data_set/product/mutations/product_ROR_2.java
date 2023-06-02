package data_set.product.mutations;
// This is a mutant program.
// Author : ysma

public class product_ROR_2
{

    public static  double product_ROR_2( java.lang.Double[] elements )
    {
        int size = elements.length;
        double product = 1;
        for (int i = size; --i < 0;) {
            product *= elements[i];
        }
        return product;
    }

}
