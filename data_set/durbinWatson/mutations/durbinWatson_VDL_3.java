package data_set.durbinWatson.mutations;
// This is a mutant program.
// Author : ysma

public class durbinWatson_VDL_3
{

    public static  double durbinWatson_VDL_3( java.lang.Double[] elements )
    {
        int size = elements.length;
        double run = 0;
        for (int i = 1; i < size;  ) {
            double x = elements[i] - elements[i - 1];
            run += x * x;
        }
        return run;
    }

}
