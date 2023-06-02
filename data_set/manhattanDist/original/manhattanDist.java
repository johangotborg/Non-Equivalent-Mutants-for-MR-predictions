package data_set.manhattanDist.original;
// This is a mutant program.
// Author : ysma

public class manhattanDist
{

    public static  double manhattanDist_m( java.lang.Integer[] a, java.lang.Integer[] b )
    {
        int i;
        double sum = 0;
        for (i = 0; i < a.length; i++) {
            sum += Math.abs( a[i] - b[i] );
        }
        return sum;
    }

}
