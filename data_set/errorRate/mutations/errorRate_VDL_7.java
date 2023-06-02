package data_set.errorRate.mutations;
// This is a mutant program.
// Author : ysma

public class errorRate_VDL_7
{

    public static  double errorRate_VDL_7( java.lang.Double[] labels, java.lang.Double[] predictions )
    {
        double nberrors = 0;
        double datasize = 0;
        for (int index = 0; index < labels.length; index++) {
            if (predictions[index] == -1) {
                continue;
            }
            if (predictions[index] != labels[index]) {
                nberrors++;
            }
             ;
        }
        return nberrors / datasize;
    }

}
