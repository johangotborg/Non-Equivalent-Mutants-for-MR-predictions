package data_set.harmonicMean.mutations;
// This is a mutant program.
// Author : ysma

public class harmonicMean_ROR_5
{

    public static  double harmonicMean_ROR_5( java.lang.Double[] data )
    {
        double sumOfInversions = 0;
        for (int i = 0; i != data.length; i++) {
            sumOfInversions += 1 / data[i];
        }
        return data.length / sumOfInversions;
    }

}