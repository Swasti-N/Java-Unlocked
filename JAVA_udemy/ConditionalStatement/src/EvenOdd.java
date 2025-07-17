import java.lang.*;
import java.util.Scanner;
//Challenge 1.1
public class EvenOdd
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        int n ;
        System.out.println("Enter a Number");
        n = s.nextInt();

        if ( n%2 == 0)
        {
            System.out.println("No. is Even");
        }
        else
        {
            System.out.println("No. is Odd");
        }

    }
}