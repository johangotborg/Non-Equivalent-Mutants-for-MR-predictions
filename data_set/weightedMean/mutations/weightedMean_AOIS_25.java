package data_set.weightedMean.mutations;
// This is a mutant program.
// Author : ysma

public class weightedMean_AOIS_25
{

    public static  double weightedMean_AOIS_25( java.lang.Double[] elements, java.lang.Double[] theWeights )
    {
        int size = elements.length;
        double sum = 0.0;
        double weightsSum = 0.0;
        for (int i = size; --i >= 0;) {
            double w = theWeights[i];
            sum += elements[i] * w;
            weightsSum += w;
        }
        return sum / weightsSum++;
    }

}
