package data_set.partition.mutations;
// This is a mutant program.
// Author : ysma

public class partition_SDL_8
{

    public static  int partition_SDL_8( final java.lang.Double[] work, final java.lang.Integer begin, final java.lang.Integer end, final java.lang.Integer pivot )
    {
        final double value = work[pivot];
        work[pivot] = work[begin];
        int i = begin + 1;
        int j = end - 1;
        while (i < j) {
            while (i < j && work[j] > value) {
                --j;
            }
            while (i < j && work[i] < value) {
                ++i;
            }
        }
        if (i >= end || work[i] > value) {
            --i;
        }
        work[begin] = work[i];
        work[i] = value;
        return i;
    }

}
