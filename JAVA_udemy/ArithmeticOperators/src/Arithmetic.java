import java.util.*;
import java.lang.*;

public class Arithmetic
{
    public static void main(String args [])
    {
        int a = 42 , b = 5 , w ;
        float x , y , c = 14.3f , d = 3.2f , v  , u ;

        u =  c / d;
        v = c % d;
        w =  a % b;
        x = a / b;
        y = (float) a / b;// Type casting is necessary to print an expression as a float value

        System.out.println(u);
        System.out.println(v);
        System.out.println(w);
        System.out.println(x);
        System.out.println(y);

    }
}
