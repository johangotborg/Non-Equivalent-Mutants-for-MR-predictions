package data_set.evaluateHoners.mutations;
// This is a mutant program.
// Author : ysma

public class evaluateHoners_ODL_2
{

    public static  double evaluateHoners_ODL_2( java.lang.Double[] coefficients, java.lang.Double argument )
    {
        int n = coefficients.length;
        double result = coefficients[1];
        for (int j = n - 2; j >= 0; j--) {
            result = argument * result + coefficients[j];
        }
        return result;
    }

}
