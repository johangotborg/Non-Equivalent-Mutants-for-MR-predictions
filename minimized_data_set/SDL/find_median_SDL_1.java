package minimized_data_set.SDL;
// This is a mutant program.
// Author : ysma

public class find_median_SDL_1
{

    public static  double find_median_SDL_1( java.lang.Integer[] a )
    {
        int k = a.length / 2 + 1;
        int minIndex = 0;
        int minValue = a[0];
        if (a.length % 2 == 0) {
            return (double) (a[a.length / 2 - 1] + a[a.length / 2]) / 2;
        } else {
            return a[a.length / 2];
        }
    }

}
