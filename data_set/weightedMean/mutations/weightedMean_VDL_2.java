package data_set.weightedMean.mutations;
// This is a mutant program.
// Author : ysma

public class weightedMean_VDL_2
{

    public static  double weightedMean_VDL_2( java.lang.Double[] elements, java.lang.Double[] theWeights )
    {
        int size = elements.length;
        double sum = 0.0;
        double weightsSum = 0.0;
        for (int i = size; --i >= 0;) {
            double w = theWeights[i];
            sum += w;
            weightsSum += w;
        }
        return sum / weightsSum;
    }

}
