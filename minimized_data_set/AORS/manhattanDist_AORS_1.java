package minimized_data_set.AORS;
// This is a mutant program.
// Author : ysma

public class manhattanDist_AORS_1
{

    public static  double manhattanDist_AORS_1( java.lang.Integer[] a, java.lang.Integer[] b )
    {
        int i;
        double sum = 0;
        for (i = 0; i < a.length; i--) {
            sum += Math.abs( a[i] - b[i] );
        }
        return sum;
    }

}
