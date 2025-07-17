import java.lang.*;
import java.util.Scanner;
// Challenge 1.2
public class Age
{
    public static void main (String args[])
    {
    System.out.println("Enter your age");
    int age ;
    Scanner s = new Scanner(System.in);
    age = s.nextInt();

    if (age > 0 && age <= 12)
    {
        System.out.println("You are a Kid");
    }
    else if (age >= 13 && age <=19)
    {
        System.out.println("You are a Teen");
    }
    else if (age >= 20 && age <= 40)
    {
        System.out.println("You are a Adult and Young");
    }
    else if (age <= 0)
    {
        System.out.println("Invalid age");
    }
    else
    {
        System.out.println("You are OLD");
    }
    }
}
