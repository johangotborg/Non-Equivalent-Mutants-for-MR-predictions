package minimized_data_set.AOIU;
// This is a mutant program.
// Author : ysma

public class errorRate_AOIU_1
{

    public static  double errorRate_AOIU_1( java.lang.Double[] labels, java.lang.Double[] predictions )
    {
        double nberrors = 0;
        double datasize = 0;
        for (int index = 0; -index < labels.length; index++) {
            if (predictions[index] == -1) {
                continue;
            }
            if (predictions[index] != labels[index]) {
                nberrors++;
            }
            datasize++;
        }
        return nberrors / datasize;
    }

}