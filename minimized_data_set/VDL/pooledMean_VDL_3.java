package minimized_data_set.VDL;
// This is a mutant program.
// Author : ysma

public class pooledMean_VDL_3
{

    public static  double pooledMean_VDL_3( java.lang.Double[] data1, java.lang.Double[] data2 )
    {
        double sum1 = 0;
        for (int i = 0; i < data1.length; i++) {
            sum1 += data1[i];
        }
        double mean1 = data1.length;
        double sum2 = 0;
        for (int i = 0; i < data2.length; i++) {
            sum2 += data2[i];
        }
        double mean2 = sum2 / data2.length;
        return (data1.length * mean1 + data2.length * mean2) / (data1.length + data2.length);
    }

}
