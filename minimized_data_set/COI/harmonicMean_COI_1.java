package minimized_data_set.COI;
// This is a mutant program.
// Author : ysma

public class harmonicMean_COI_1
{

    public static  double harmonicMean_COI_1( java.lang.Double[] data )
    {
        double sumOfInversions = 0;
        for (int i = 0; !(i < data.length); i++) {
            sumOfInversions += 1 / data[i];
        }
        return data.length / sumOfInversions;
    }

}
