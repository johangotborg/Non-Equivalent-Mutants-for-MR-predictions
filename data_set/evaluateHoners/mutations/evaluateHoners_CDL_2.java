package data_set.evaluateHoners.mutations;
// This is a mutant program.
// Author : ysma

public class evaluateHoners_CDL_2
{

    public static  double evaluateHoners_CDL_2( java.lang.Double[] coefficients, java.lang.Double argument )
    {
        int n = coefficients.length;
        double result = coefficients[n - 1];
        for (int j = n; j >= 0; j--) {
            result = argument * result + coefficients[j];
        }
        return result;
    }

}
