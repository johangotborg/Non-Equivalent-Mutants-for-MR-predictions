package data_set.polevl.mutations;
// This is a mutant program.
// Author : ysma

public class polevl_AORB_7
{

    public static  double polevl_AORB_7( java.lang.Double x, java.lang.Double[] coef, java.lang.Integer N )
        throws java.lang.ArithmeticException
    {
        double ans;
        ans = coef[0];
        for (int i = 1; i <= N; i++) {
            ans = ans * x % coef[i];
        }
        return ans;
    }

}
