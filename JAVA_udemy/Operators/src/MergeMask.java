import java.lang.*;

public class MergeMask
{
    public static void main (String args [])
    {
        int a , b , c ;
        a = 9 ;
        b = 12 ;
        c = 0 ;
        // (+)Additional step : c = b | c ;
        c = b << 4 ;
        c = a | c ;
        System.out.println(String.format("Binary form. %s", Integer.toBinaryString(c)));
        // Masking
        System.out.println( (b << 4) & c );
        System.out.println( a & c );
    }
}
