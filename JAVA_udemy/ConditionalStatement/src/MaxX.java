import java.lang.*;
import java.util.Scanner;

public class MaxX
{
    public static void main (String args[])
    {
        Scanner s = new Scanner(System.in);
        float a , b , c;
        a = s.nextFloat();
        b = s.nextFloat();
        c = s.nextFloat();

        if (a > b && a > c)
        {
            System.out.println(" a is the Greatest value. " +a );
        }
        else if ( b >= c )
        {
            System.out.println(" b is the Greatest value. " +b );
        }
        else
        {
            System.out.println(" c is the Greatest value. " +c );
        }
    }
}
