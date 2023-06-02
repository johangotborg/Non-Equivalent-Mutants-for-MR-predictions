package minimized_data_set.VDL;
// This is a mutant program.
// Author : ysma

public class polevl_VDL_4
{

    public static  double polevl_VDL_4( java.lang.Double x, java.lang.Double[] coef, java.lang.Integer N )
        throws java.lang.ArithmeticException
    {
        double ans;
        ans = coef[0];
        for (int i = 1; i <= N; i++) {
            ans = x + coef[i];
        }
        return ans;
    }

}
