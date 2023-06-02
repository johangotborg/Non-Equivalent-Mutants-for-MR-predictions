package minimized_data_set.CDL;
// This is a mutant program.
// Author : ysma

public class harmonicMean_CDL_1
{

    public static  double harmonicMean_CDL_1( java.lang.Double[] data )
    {
        double sumOfInversions = 0;
        for (int i = 0; i < data.length; i++) {
            sumOfInversions += data[i];
        }
        return data.length / sumOfInversions;
    }

}
