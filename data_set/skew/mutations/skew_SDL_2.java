package data_set.skew.mutations;
// This is a mutant program.
// Author : ysma

public class skew_SDL_2
{

    public static  double skew_SDL_2( java.lang.Double[] data )
    {
        double sum = 0;
        double sumPD = 0;
        double sumSq = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
            sumSq += data[i] * data[i];
        }
        double mean = sum / data.length;
        double standardDeviation = Math.sqrt( (sumSq - mean * sum) / data.length );
        double moment3 = sumPD / data.length;
        return moment3 / (standardDeviation * standardDeviation * standardDeviation);
    }

}
