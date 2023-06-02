package data_set.harmonicMean.mutations;
// This is a mutant program.
// Author : ysma

public class harmonicMean_VDL_2
{

    public static  double harmonicMean_VDL_2( java.lang.Double[] data )
    {
        double sumOfInversions = 0;
        for (int i = 0; i < data.length;  ) {
            sumOfInversions += 1 / data[i];
        }
        return data.length / sumOfInversions;
    }

}
