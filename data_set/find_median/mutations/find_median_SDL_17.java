package data_set.find_median.mutations;
// This is a mutant program.
// Author : ysma

public class find_median_SDL_17
{

    public static  double find_median_SDL_17( java.lang.Integer[] a )
    {
        int k = a.length / 2 + 1;
        int minIndex = 0;
        int minValue = a[0];
        for (int i = 0; i < k; i++) {
            minIndex = i;
            minValue = a[i];
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < minValue) {
                    minIndex = j;
                    minValue = a[j];
                }
            }
            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }
        if (a.length % 2 == 0) {
            return 0;
        } else {
            return a[a.length / 2];
        }
    }

}
