import java.lang.*;
import java.util.Scanner;
// Challenge 1.3
public class Grades
{
    public static void main (String args[])
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Marks ?/100 :");
        float Eng , Math , Sci , TOT , AVG;
        System.out.println("English: ");
        Eng = s.nextFloat();
        System.out.println("Math: ");
        Math = s.nextFloat();
        System.out.println("Sci: ");
        Sci = s.nextFloat();

        TOT = Eng + Sci + Math ;
        System.out.println("TOTAL = " +TOT);
        AVG = (Eng + Sci + Math)/3 ;
        System.out.println("AVERAGE = " +AVG);

        if (AVG >= 85)
        {
            System.out.println("GRADE: A");
        }
        else if (AVG <= 85 && AVG >= 70)
        {
            System.out.println("GRADE: B");
        }
        else if (AVG <= 70 && AVG >= 55)
        {
            System.out.println("GRADE: C");
        }
        else if (AVG <= 55 && AVG >= 40)
        {
            System.out.println("GRADE: D");
        }
        else
        {
            System.out.println("FAIL");
        }
    }
}
