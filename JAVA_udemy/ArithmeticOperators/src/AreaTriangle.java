import java.lang.*;
import java.util.Scanner;

public class AreaTriangle
{
    public static void main(String args[])
    {
        float base , height ;
        double area ;
        System.out.println("Enter Base and Height  ");
        Scanner s = new Scanner(System.in);
        base = s.nextFloat();
        height = s.nextFloat();
        area = 0.5 * base * height ; // base * height/2 or 1f / 2f * base * heigth
        System.out.println("area of triangle is "+area);
    }
}