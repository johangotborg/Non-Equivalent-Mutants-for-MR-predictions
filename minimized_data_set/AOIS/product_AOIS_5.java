package minimized_data_set.AOIS;
// This is a mutant program.
// Author : ysma

public class product_AOIS_5
{

    public static  double product_AOIS_5( java.lang.Double[] elements )
    {
        int size = elements.length;
        double product = 1;
        for (int i = size; --i >= 0;) {
            product *= elements[++i];
        }
        return product;
    }

}
