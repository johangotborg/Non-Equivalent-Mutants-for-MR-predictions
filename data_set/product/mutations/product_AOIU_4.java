package data_set.product.mutations;
// This is a mutant program.
// Author : ysma

public class product_AOIU_4
{

    public static  double product_AOIU_4( java.lang.Double[] elements )
    {
        int size = elements.length;
        double product = 1;
        for (int i = size; --i >= 0;) {
            product *= elements[i];
        }
        return -product;
    }

}
