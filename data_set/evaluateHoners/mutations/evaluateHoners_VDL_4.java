package data_set.evaluateHoners.mutations;
// This is a mutant program.
// Author : ysma

public class evaluateHoners_VDL_4
{

    public static  double evaluateHoners_VDL_4( java.lang.Double[] coefficients, java.lang.Double argument )
    {
        int n = coefficients.length;
        double result = coefficients[n - 1];
        for (int j = n - 2; j >= 0;  ) {
            result = argument * result + coefficients[j];
        }
        return result;
    }

}
