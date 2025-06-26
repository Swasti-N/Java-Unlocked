import java.lang.*;
import java.util.Scanner;

public class Cuboid
{
    public static void main ( String args [])
    {
        Scanner s = new Scanner(System.in);
        float length , breadth , height ;
        double area , volume ;
        System.out.println("Enter values for length , breadth and height.");
        length = s.nextFloat();
        breadth = s.nextFloat();
        height = s.nextFloat();
        area = 2 * (( length * breadth ) + (breadth * height) + (height * length ));
        System.out.println("Total area = " +area);
        volume = length * breadth * height ;
        System.out.println("Total volume = " +volume);

    }
}