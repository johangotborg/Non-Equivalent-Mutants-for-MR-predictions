package minimized_data_set.AOIU;
// This is a mutant program.
// Author : ysma

public class harmonicMean_AOIU_1
{

    public static  double harmonicMean_AOIU_1( java.lang.Double[] data )
    {
        double sumOfInversions = 0;
        for (int i = 0; -i < data.length; i++) {
            sumOfInversions += 1 / data[i];
        }
        return data.length / sumOfInversions;
    }

}
