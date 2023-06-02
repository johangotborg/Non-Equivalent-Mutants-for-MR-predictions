package data_set.harmonicMean.mutations;
// This is a mutant program.
// Author : ysma

public class harmonicMean_ODL_5
{

    public static  double harmonicMean_ODL_5( java.lang.Double[] data )
    {
        double sumOfInversions = 0;
        for (int i = 0; i < data.length; i++) {
            sumOfInversions += data[i];
        }
        return data.length / sumOfInversions;
    }

}
