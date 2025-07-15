import java.lang.*;
import java.util.Scanner;

public class Relational
{
    public static void main (String args[])
    {
        int a ,b ;
        boolean c ;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter values for a & b");
        a = s.nextInt();
        b = s.nextInt();
        c = a > b ;
        System.out.println("1. a > b = " +c);
        c = a < b ;
        System.out.println("2. a < b = " +c);
        c = a == b ;
        System.out.println("3. a == b = " +c);
        c = a != b ;
        System.out.println("4. a != b = " +c);
        c = a <= b ;
        System.out.println("5. a <= b = " +c);
        c = a >= b ;
        System.out.println("6. a >= b = " +c);
    }
}
