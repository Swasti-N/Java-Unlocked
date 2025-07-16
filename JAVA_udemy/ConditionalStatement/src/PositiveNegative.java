import java.lang.*;
import java.util.Scanner;

public class PositiveNegative
{
    public static void main(String args[])
    {
        int x ;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter an integer value");
        x = s.nextInt();

        if (x >= 0)
        {
            System.out.println("No. is +ive");
        }
        else
        {
            System.out.println("No. is -ive");
        }
    }
}