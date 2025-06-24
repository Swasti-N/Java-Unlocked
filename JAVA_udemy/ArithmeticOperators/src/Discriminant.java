import java.util.Scanner;
import java.lang.*;

public class Discriminant
{
    public static void main(String args[])
    {
        float a , b , c ;
       double r1 , r2 ;
       Scanner s = new Scanner(System.in);
       System.out.println("Enter values for a , b and c.");
       a = s.nextFloat();
       b = s.nextFloat();
       c = s.nextFloat();
       r1 = (- b + Math.sqrt( b * b - 4 * a * c )) / 2 * a ;
       r2 = (- b - Math.sqrt( b * b - 4 * a * c )) / 2 * a ;
       System.out.println( " root1 = " + r1 ) ;
       System.out.println( " root2 = " + r2 ) ;

    }
}
