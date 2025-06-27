import java.lang.*;
import java.util.Scanner;

public class BitWise
{
    public static void main (String args [])
    {
        int x , y , z ;
        Scanner s = new Scanner(System.in);

        System.out.println("Enter values for x and y");
        x = s.nextInt();
        y = s.nextInt();
        z = x & y ;
        System.out.println("(AND) z = " +z );

        z = x | y ;
        System.out.println("(OR) z = " +z );

        z = x ^ y ;
        System.out.println("(XOR) z = " +z );

        z = ~ x ;
        System.out.println("(NOT) z = " +z );

        z = x >> 1 ; // n / 2 ^ k
        System.out.println("(Right Shift) z = " +z );

        z = x << 1 ; // n * 2 ^ k
        System.out.println("(Left Shift) z = " +z );

        z = x >>> 1 ;
        System.out.println("(Undersigned Right Shift) z = " +z );
    }
}