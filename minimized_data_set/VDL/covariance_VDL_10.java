package minimized_data_set.VDL;
// This is a mutant program.
// Author : ysma

public class covariance_VDL_10
{

    public static  double covariance_VDL_10( java.lang.Double[] elements1, java.lang.Double[] elements2 )
    {
        int size = elements1.length;
        double sumx = elements1[0];
        double sumy = elements2[0];
        double Sxy = 0;
        for (int i = 1; i < size; ++i) {
            double x = elements1[i];
            double y = elements2[i];
            sumx += x;
            Sxy += (x - sumx / (i + 1)) * (y - sumy / i);
            sumy += y;
        }
        return Sxy / (1);
    }

}
