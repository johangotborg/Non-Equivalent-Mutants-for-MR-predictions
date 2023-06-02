package minimized_data_set.VDL;
// This is a mutant program.
// Author : ysma

public class scale_VDL_3
{

    public static  double[] scale_VDL_3( java.lang.Double val, final java.lang.Double[] arr )
    {
        double[] newArr = new double[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = val;
        }
        return newArr;
    }

}
