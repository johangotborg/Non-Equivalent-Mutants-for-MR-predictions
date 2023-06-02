package minimized_data_set.ODL;
// This is a mutant program.
// Author : ysma

public class harmonicMean_ODL_4
{

    public static  double harmonicMean_ODL_4( java.lang.Double[] data )
    {
        double sumOfInversions = 0;
        for (int i = 0; i < data.length; i++) {
            sumOfInversions += 1;
        }
        return data.length / sumOfInversions;
    }

}
