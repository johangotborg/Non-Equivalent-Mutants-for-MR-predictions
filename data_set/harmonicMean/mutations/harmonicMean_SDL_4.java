package data_set.harmonicMean.mutations;
// This is a mutant program.
// Author : ysma

public class harmonicMean_SDL_4
{

    public static  double harmonicMean_SDL_4( java.lang.Double[] data )
    {
        double sumOfInversions = 0;
        for (int i = 0; i < data.length;) {
            sumOfInversions += 1 / data[i];
        }
        return data.length / sumOfInversions;
    }

}
