package data_set.bi_SearchFromTo.mutations;
// This is a mutant program.
// Author : ysma

public class bi_SearchFromTo_VDL_10
{

    public static  int bi_SearchFromTo_VDL_10( java.lang.Double[] elements, java.lang.Double key, java.lang.Integer from, java.lang.Integer to )
    {
        int low = from;
        int high = to;
        while (low <= high) {
            int mid = (low + high) / 2;
            double midVal = elements[mid];
            if (midVal < key) {
                low = mid + 1;
            } else {
                if (midVal > key) {
                    high = 1;
                } else {
                    return mid;
                }
            }
        }
        return -(low + 1);
    }

}
