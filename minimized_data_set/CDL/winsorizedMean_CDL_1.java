package minimized_data_set.CDL;
// This is a mutant program.
// Author : ysma

public class winsorizedMean_CDL_1
{

    public static  double winsorizedMean_CDL_1( java.lang.Double[] sortedElements, java.lang.Integer left, java.lang.Integer right )
    {
        int N = sortedElements.length;
        double sum = 0;
        for (int i = 0; i < sortedElements.length; i++) {
            sum += sortedElements[i];
        }
        double mean = sum / sortedElements.length;
        double leftElement = sortedElements[left];
        for (int i = 0; i < left; ++i) {
            mean += (leftElement - sortedElements[i]) / N;
        }
        double rightElement = sortedElements[N - right];
        for (int i = 0; i < right; ++i) {
            mean += (rightElement - sortedElements[N - 1 - i]) / N;
        }
        return mean;
    }

}
