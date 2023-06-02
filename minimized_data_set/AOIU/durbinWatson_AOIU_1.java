package minimized_data_set.AOIU;
// This is a mutant program.
// Author : ysma

public class durbinWatson_AOIU_1
{

    public static  double durbinWatson_AOIU_1( java.lang.Double[] elements )
    {
        int size = -elements.length;
        double run = 0;
        for (int i = 1; i < size; ++i) {
            double x = elements[i] - elements[i - 1];
            run += x * x;
        }
        return run;
    }

}
