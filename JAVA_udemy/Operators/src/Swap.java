import java.lang.*;

public class Swap
{
    public static void main(String args[])
    {
        //Swapping two numbers without using a third variable using bitwise XOR.
        int a , b ;
        a = 10 ;
        b = 15 ;
        a = a ^ b ; // 1st XOR
        b = a ^ b ; // 2nd XOR
        System.out.println("b = "+b);
        a = a ^ b ; // 3rd XOR
        System.out.println("a = "+a);
    }
}
