package data_set.scale.mutations;
// This is a mutant program.
// Author : ysma

public class scale_ROR_5
{

    public static  double[] scale_ROR_5( java.lang.Double val, final java.lang.Double[] arr )
    {
        double[] newArr = new double[arr.length];
        for (int i = 0; i != arr.length; i++) {
            newArr[i] = arr[i] * val;
        }
        return newArr;
    }

}