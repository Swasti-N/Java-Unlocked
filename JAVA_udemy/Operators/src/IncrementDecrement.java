import java.lang.*;
import java.util.Scanner;

public class IncrementDecrement
{
    public static void main( String args[] )
    {
        int x , y , z;
        System.out.println("enter value for 'y'");
        Scanner s = new Scanner(System.in);

        y = s.nextInt();
        x = y++ ;
        System.out.println("new value for 'y' = " +y);
        System.out.println(" 'x' = " +x );

        System.out.println("Enter value for 'y'");
        y = s.nextInt();
        x = ++y ;
        System.out.println("new value for 'y' = " +y);
        System.out.println(" 'x' = " +x );


        System.out.println("enter value for 'y'");
        y = s.nextInt();
        x = y-- ;
        System.out.println("new value for 'y' = " +y);
        System.out.println(" 'x' = " +x );

        System.out.println("Enter value for 'y'");
        y = s.nextInt();
        x = --y ;
        System.out.println("new value for 'y' = " +y);
        System.out.println(" 'x' = " +x );


        System.out.println("enter values for x & y");
        x = s.nextInt();
        y = s.nextInt();
        z = 2 * x++ + 3 * ++y ;
        System.out.println("z = " +z );

        System.out.println("for eqn: z = 2 * x++ + 3 * ++x we put x = 5");
        x = 5;
        z = 2 * x++ + 3 * ++x ;
        System.out.println(" we get");
        System.out.println("z = 2 * x++ + 3 * ++x => " +z );


        float a , b ;
        System.out.println("enter value for 'b'");

        b = s.nextFloat();
        a = b++ ;
        System.out.println("new value for 'b' = " +b);
        System.out.println(" 'a' = " +a );

        System.out.println("enter value for 'b'");
        b = s.nextFloat();
        a = ++b ;
        System.out.println("new value for 'b' = " +b);
        System.out.println(" 'a' = " +a );

        System.out.println("enter value for 'b'");
        b = s.nextFloat();
        a = b-- ;
        System.out.println("new value for 'b' = " +b);
        System.out.println(" 'a' = " +a );

        System.out.println("enter value for 'b'");
        b = s.nextFloat();
        a = --b ;
        System.out.println("new value for 'b' = " +b);
        System.out.println(" 'a' = " +a );

        System.out.println("Char result = ");

        char p = 'A';
        p++ ;
        System.out.println(" p = " +p );

    }
}
