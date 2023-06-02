package data_set.safeNorm.mutations;
// This is a mutant program.
// Author : ysma

public class safeNorm_SDL_1
{

    public static  double safeNorm_SDL_1( java.lang.Double[] v )
    {
        double rdwarf = 3.834e-20;
        double rgiant = 1.304e+19;
        double s1 = 0;
        double s2 = 0;
        double s3 = 0;
        double x1max = 0;
        double x3max = 0;
        double floatn = v.length;
        double agiant = rgiant / floatn;
        double norm;
        if (s1 != 0) {
            norm = x1max * Math.sqrt( s1 + s2 / x1max / x1max );
        } else {
            if (s2 == 0) {
                norm = x3max * Math.sqrt( s3 );
            } else {
                if (s2 >= x3max) {
                    norm = Math.sqrt( s2 * (1 + x3max / s2 * (x3max * s3)) );
                } else {
                    norm = Math.sqrt( x3max * (s2 / x3max + x3max * s3) );
                }
            }
        }
        return norm;
    }

}
