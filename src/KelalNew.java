import java.util.Scanner;

import static java.lang.Math.acos;
import static java.lang.StrictMath.cos;
import static java.lang.StrictMath.sin;

    public class KelalNew {
    public static void main( String[]args ) {

    Scanner input = new Scanner( System.in );

    double la1, lo1 = 0, la2, lo2 = 0;

    System.out.println( "Enter the latitude of the coordinate 1: " );
    la1 = input.nextDouble();
    System.out.println( "Enter the longitude of the coordinate 1: " );
    lo1 = input.nextDouble();
    System.out.println( "Enter the latitude of the coordinate 2:" );
    la2 = input.nextDouble();
    System.out.println( "Enter the longitude of the coordinate 2" );
    lo2 = input.nextDouble();


    double ROE = 6371.01;   //kilometers;

    //points converted to radian;

    // create another method to figure out points will be converted to radians before calculation
    double d = ROE * acos( sin( la1 ) * sin( la2 ) + cos( la1 ) * cos( la2 ) * cos( lo1 - lo2 ) );

    System.out.println( "distance: " + d );
}
    public static double distance(double la1, double la2, double lo1, double lo2) {
        // Math, is where it gonna figure out mathimatcaly
         la1 = Math.toRadians( la1 );
         la2 = Math.toRadians( la2 );
         lo1 = Math.toRadians( lo1 );
         lo2 = Math.toRadians( lo2 );

        double ROE = 6371.01;   //kilometers;

        double d = ROE * acos( sin( la1 ) * sin( la2 ) + cos( la1 ) * cos( la2 ) * cos( lo1 - lo2 ) );

       // System.out.println( "distance: " + d );

        return d;
    }


    }




