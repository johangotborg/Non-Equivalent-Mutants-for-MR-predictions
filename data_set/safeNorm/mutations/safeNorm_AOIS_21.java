package data_set.safeNorm.mutations;
// This is a mutant program.
// Author : ysma

public class safeNorm_AOIS_21
{

    public static  double safeNorm_AOIS_21( java.lang.Double[] v )
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
        for (int i = 0; i < v.length; i++) {
            double xabs = Math.abs( v[i] );
            if (++xabs < rdwarf || xabs > agiant) {
                if (xabs > rdwarf) {
                    if (xabs > x1max) {
                        double r = x1max / xabs;
                        s1 = 1 + s1 * r * r;
                        x1max = xabs;
                    } else {
                        double r = xabs / x1max;
                        s1 += r * r;
                    }
                } else {
                    if (xabs > x3max) {
                        double r = x3max / xabs;
                        s3 = 1 + s3 * r * r;
                        x3max = xabs;
                    } else {
                        if (xabs != 0) {
                            double r = xabs / x3max;
                            s3 += r * r;
                        }
                    }
                }
            } else {
                s2 += xabs * xabs;
            }
        }
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
