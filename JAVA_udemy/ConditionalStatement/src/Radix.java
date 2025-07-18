import java.lang.*;
import java.util.Scanner;

// Challenge 2.1
public class Radix
{
    public static void main (String args[])
    {
        Scanner s = new Scanner(System.in);
        String num = s.next() ;
        if (num.matches("[01]+"))
        {
            System.out.println("No. is Binary. Radix:2");
        }
        else if (num.matches("[0-7]+"))
        {
            System.out.println("No. is Octal. Radix:8");
        }
        else if (num.matches("[0-9]+"))
        {
            System.out.println("No. is Decimal. Radix:10");
        }
        else if (num.matches("[0-9A-Z]+"))
        {
            System.out.println("No. is Hex. Radix:16");
        }
        else
        {
            System.out.println("Invalid input");
        }

    }
}
