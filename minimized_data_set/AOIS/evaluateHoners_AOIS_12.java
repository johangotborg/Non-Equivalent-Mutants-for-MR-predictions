package minimized_data_set.AOIS;
// This is a mutant program.
// Author : ysma

public class evaluateHoners_AOIS_12
{

    public static  double evaluateHoners_AOIS_12( java.lang.Double[] coefficients, java.lang.Double argument )
    {
        int n = coefficients.length;
        double result = coefficients[n - 1];
        for (int j = n - 2; --j >= 0; j--) {
            result = argument * result + coefficients[j];
        }
        return result;
    }

}
