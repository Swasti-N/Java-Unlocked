import java.lang.*;
import java.util.Scanner;

public class Challenge2
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a binary no.");
        int Binary = s.nextInt() ;
        String str = Integer.toString (Binary) ;//ValueOf can also be used instead of format .
        System.out.println("Binary no. ?? = " + str.matches("[1 | 0]*"));

        System.out.println("Enter a Hex Decimal no.");
        String Hex = s.next();
        System.out.println("Hex Decimal no. ?? = " + Hex.matches("[0-9A-F]+"));

        System.out.println("Enter Date");
        String Date = s.next();
        System.out.println("DATE ?? : " + Date.matches("(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/([0-9]{4})"));

    }
}
