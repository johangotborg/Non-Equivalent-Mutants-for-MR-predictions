package data_set.winsorizedMean.mutations;
// This is a mutant program.
// Author : ysma

public class winsorizedMean_SDL_2
{

    public static  double winsorizedMean_SDL_2( java.lang.Double[] sortedElements, java.lang.Integer left, java.lang.Integer right )
    {
        int N = sortedElements.length;
        double sum = 0;
        for (int i = 0; i < sortedElements.length; i++) {
            sum += sortedElements[i];
        }
        double mean = sum / sortedElements.length;
        double leftElement = sortedElements[left];
        double rightElement = sortedElements[N - 1 - right];
        for (int i = 0; i < right; ++i) {
            mean += (rightElement - sortedElements[N - 1 - i]) / N;
        }
        return mean;
    }

}
