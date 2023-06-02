package minimized_data_set.ODL;
// This is a mutant program.
// Author : ysma

public class manhattanDist_ODL_4
{

    public static  double manhattanDist_ODL_4( java.lang.Integer[] a, java.lang.Integer[] b )
    {
        int i;
        double sum = 0;
        for (i = 0; i < a.length; i++) {
            sum += Math.abs( a[i] );
        }
        return sum;
    }

}
