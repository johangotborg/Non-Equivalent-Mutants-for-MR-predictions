package data_set.manhattanDist.mutations;
// This is a mutant program.
// Author : ysma

public class manhattanDist_AOIS_17
{

    public static  double manhattanDist_AOIS_17( java.lang.Integer[] a, java.lang.Integer[] b )
    {
        int i;
        double sum = 0;
        for (i = 0; i < a.length; i++) {
            sum += Math.abs( a[i] - b[i] );
        }
        return sum++;
    }

}
