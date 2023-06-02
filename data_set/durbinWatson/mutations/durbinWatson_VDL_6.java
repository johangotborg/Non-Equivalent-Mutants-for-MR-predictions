package data_set.durbinWatson.mutations;
// This is a mutant program.
// Author : ysma

public class durbinWatson_VDL_6
{

    public static  double durbinWatson_VDL_6( java.lang.Double[] elements )
    {
        int size = elements.length;
        double run = 0;
        for (int i = 1; i < size; ++i) {
            double x = elements[i];
            run += x * x;
        }
        return run;
    }

}
