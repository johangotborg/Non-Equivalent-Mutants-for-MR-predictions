package minimized_data_set.ODL;
// This is a mutant program.
// Author : ysma

public class durbinWatson_ODL_10
{

    public static  double durbinWatson_ODL_10( java.lang.Double[] elements )
    {
        int size = elements.length;
        double run = 0;
        for (int i = 1; i < size; ++i) {
            double x = elements[i] - elements[i - 1];
            run = x * x;
        }
        return run;
    }

}
