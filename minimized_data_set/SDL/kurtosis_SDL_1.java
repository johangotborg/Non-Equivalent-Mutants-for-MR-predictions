package minimized_data_set.SDL;
// This is a mutant program.
// Author : ysma

public class kurtosis_SDL_1
{

    public static  double kurtosis_SDL_1( java.lang.Double[] data )
    {
        double sum = 0;
        double sumPD = 0;
        double sumSq = 0;
        double mean = sum / data.length;
        double standardDeviation = Math.sqrt( (sumSq - mean * sum) / data.length );
        for (int i = 0; i < data.length; i++) {
            sumPD += Math.pow( data[i] - mean, 4 );
        }
        double moment4 = sumPD / data.length;
        return -3 + moment4 / (standardDeviation * standardDeviation * standardDeviation * standardDeviation);
    }

}
