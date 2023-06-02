package minimized_data_set.CDL;
// This is a mutant program.
// Author : ysma

public class durbinWatson_CDL_1
{

    public static  double durbinWatson_CDL_1( java.lang.Double[] elements )
    {
        int size = elements.length;
        double run = 0;
        for (int i = 1; i < size; ++i) {
            double x = elements[i] - elements[i];
            run += x * x;
        }
        return run;
    }

}
