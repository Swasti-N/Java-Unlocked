import java.lang.*;
import java.util.Scanner;

public class AreaTriangle_2
{
    public static void main(String args[]) {
        float a, b, c;
        double p, area;
        System.out.println("Enter values for a ,b ,c  ");
        Scanner s = new Scanner(System.in);
        a = s.nextFloat();
        b = s.nextFloat();
        c = s.nextFloat();
        p = (a + b + c) / 2f ;
        System.out.println("p =" +p);
        area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println("Area of the Triangle =" +area);

    }
}
