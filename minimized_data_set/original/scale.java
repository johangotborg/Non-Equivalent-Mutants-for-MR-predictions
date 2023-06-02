package minimized_data_set.original;
// This is a mutant program.
// Author : ysma

public class scale
{

    public static  double[] scale_m( java.lang.Double val, final java.lang.Double[] arr )
    {
        double[] newArr = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i] * val;
        }
        return newArr;
    }

}
