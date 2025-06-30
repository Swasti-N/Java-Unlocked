import java.lang.*;
import java.util.Scanner;

public class UpDown_Casting
{
    public static void main(String args[])
    {
        System.out.println(" Upcasting ");
        float f ;
        double d ;
        short sh ;
        long l ;
        int i ;
        byte b = 5 ;
        // Widening or Upcasting.
        // byte.
        sh = b ;
        i = b ;
        f = b ;
        d = b ;
        l = b ;
        System.out.println(" sh = "+sh+" i = "+i+" f = "+f+" d = "+d+" l = "+l);
        System.out.println("--x--");

        // short.
        sh = 10 ;

        i = sh ;
        f = sh ;
        d = sh ;
        l = sh ;
        System.out.println("i = "+i+" f = "+f+" d = "+d+" l = "+l);
        System.out.println("--x--");

        // integer
        i = 15 ;

        f = i ;
        d = i ;
        l = i ;
        System.out.println(" f = "+f+" d = "+d+" l = "+l);
        System.out.println("--x--");

        // long int
        l = 20 ;

        d = l ;
        f = l ;
        System.out.println(" d = "+d+" l = "+l);
        System.out.println("--x--");

        // float
        f = 25.5f ; //Either define the float value by placing f at the end or type cast the float variable.

        d = f ;
        System.out.println(" d = "+d);
        System.out.println("--x--");

        System.out.println(" Down-casting ");

        // Narrowing or Down-casting.(here type casting is necessary in order to down-cast)
        // float --> double
        d = 40.55;
        f = (float) d ;
        System.out.println("f = "+f);
        System.out.println("float --> double.--x--");

        // float , double --> long int.
        f = 35.35f ;
        l = (long) f ;
        System.out.println("l = "+l);
        d = 40.55 ;
        l = (long) d ;
        System.out.println("l = "+l);
        System.out.println("float , double --> long int.--x--");

        //float , double , long --> int.
        f = 35.35f ;
        i = (int) f ;
        System.out.println("i = "+i);
        d = 40.55 ;
        i = (int) d ;
        System.out.println("i = "+i);
        l = 10000 ;
        i = (int) l ;
        System.out.println("i = "+i);
        System.out.println("float , double , long --> int.--x--");

        // int , float , double , long --> short.
        f = 35.35f ;
        sh = (short) f ;
        System.out.println("sh = "+sh);
        d = 40.55 ;
        sh = (short) d ;
        System.out.println("sh = "+sh);
        l = 10000 ;
        sh = (short) l ;
        System.out.println("sh = "+sh);
        i = 25 ;
        sh = (short) i ;
        System.out.println("sh = "+sh);
        System.out.println("int , float , double , long --> short.--x--");

        //int , float ,long , short , double --> byte.
        f = 35.35f ;
        b = (byte) f ;
        System.out.println("b = "+b);
        d = 40.55 ;
        b = (byte) d ;
        System.out.println("b = "+b);
        l = 10000 ; // Narrowing leads to loss of data.
        b = (byte) l ;
        System.out.println("b = "+b);
        i = 25 ;
        b = (byte) i ;
        System.out.println("b = "+b);
        sh = 15 ;
        b = (byte) sh ;
        System.out.println("b = "+b);
        System.out.println("int , float ,long , short , double --> byte.--x--");
    }
}
