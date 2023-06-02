package minimized_data_set.ODL;
// This is a mutant program.
// Author : ysma

public class variance_ODL_11
{

    public static  double variance_ODL_11( java.lang.Double[] x )
    {
        double sum = 0;
        double sum1 = 0;
        double var = 0;
        double avrg = 0;
        for (int i = 0; i < x.length; i++) {
            sum = sum + x[i];
        }
        avrg = sum / (double) x.length;
        for (int i = 0; i < x.length; i++) {
            sum1 = sum1 + (x[i]) * (x[i] - avrg);
        }
        var = sum1 / (double) x.length;
        return var;
    }

}
