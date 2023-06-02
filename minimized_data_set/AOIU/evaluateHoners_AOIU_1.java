package minimized_data_set.AOIU;
// This is a mutant program.
// Author : ysma

public class evaluateHoners_AOIU_1
{

    public static  double evaluateHoners_AOIU_1( java.lang.Double[] coefficients, java.lang.Double argument )
    {
        int n = -coefficients.length;
        double result = coefficients[n - 1];
        for (int j = n - 2; j >= 0; j--) {
            result = argument * result + coefficients[j];
        }
        return result;
    }

}
