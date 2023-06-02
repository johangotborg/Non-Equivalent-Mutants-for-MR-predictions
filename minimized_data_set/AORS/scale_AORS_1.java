package minimized_data_set.AORS;
// This is a mutant program.
// Author : ysma

public class scale_AORS_1
{

    public static  double[] scale_AORS_1( java.lang.Double val, final java.lang.Double[] arr )
    {
        double[] newArr = new double[arr.length];
        for (int i = 0; i < arr.length; i--) {
            newArr[i] = arr[i] * val;
        }
        return newArr;
    }

}
