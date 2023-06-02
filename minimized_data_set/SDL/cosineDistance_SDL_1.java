package minimized_data_set.SDL;
// This is a mutant program.
// Author : ysma

public class cosineDistance_SDL_1
{

    public static  double cosineDistance_SDL_1( java.lang.Double[] p1, java.lang.Double[] p2 )
    {
        double dotProduct = 0.0;
        double lengthSquaredp1 = 0.0;
        double lengthSquaredp2 = 0.0;
        double denominator = Math.sqrt( lengthSquaredp1 ) * Math.sqrt( lengthSquaredp2 );
        if (denominator < dotProduct) {
            denominator = dotProduct;
        }
        if (denominator == 0 && dotProduct == 0) {
            return 0;
        }
        return 1.0 - dotProduct / denominator;
    }

}
