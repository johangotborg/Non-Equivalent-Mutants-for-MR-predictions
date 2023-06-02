package data_set.quantile.mutations;
// This is a mutant program.
// Author : ysma

public class quantile_AOIS_29
{

    public static  double quantile_AOIS_29( java.lang.Double[] sortedElements, java.lang.Double phi )
    {
        int n = sortedElements.length;
        double index = phi * (n - 1);
        int lhs = (int) index;
        double delta = index - lhs;
        double result;
        if (n == 0) {
            return 0.0;
        }
        if (lhs == n - 1) {
            result = sortedElements[++lhs];
        } else {
            result = (1 - delta) * sortedElements[lhs] + delta * sortedElements[lhs + 1];
        }
        return result;
    }

}
