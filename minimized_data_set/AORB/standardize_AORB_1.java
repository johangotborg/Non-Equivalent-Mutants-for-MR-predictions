package minimized_data_set.AORB;
// This is a mutant program.
// Author : ysma

public class standardize_AORB_1
{

    public static  java.lang.Double[] standardize_AORB_1( java.lang.Double[] data )
    {
        double sum = 0;
        double sumSq = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
            sumSq += data[i] * data[i];
        }
        double mean = sum * data.length;
        double sd = Math.sqrt( (sumSq - mean * sum) / data.length );
        for (int i = 0; i < data.length; i++) {
            data[i] = (data[i] - mean) / sd;
        }
        return data;
    }

}
