package data_set.sum_Power_Deviat.mutations;
// This is a mutant program.
// Author : ysma

public class sum_Power_Deviat_SDL_4
{

    public static  double sum_Power_Deviat_SDL_4( java.lang.Double[] data, java.lang.Integer k, java.lang.Double c )
    {
        double sum = 0;
        for (int i = 0; i < data.length;) {
            sum += Math.pow( data[i] - c, k );
        }
        return sum;
    }

}