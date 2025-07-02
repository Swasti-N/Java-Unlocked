import java.lang.*;

public class Print
{
    public static void main (String args [])
    {
        int x = 10 , w = -20;
        float y = 25.55f , z = 0.0013f ;
        String str = "User";
        System.out.println("Enter values for x & y");
        System.out.print("x + y = "+x+y );
        System.out.println(" Answer");
        System.out.print("x + y = "+(x+y));
        System.out.println(" Answer");
        System.out.print(x+y+" = Correct Answer.");
        System.out.printf(" Thank you\n ");
        System.out.printf("given = %d , %f that's it\n", x , y);
        System.out.printf("integer decimal = %d , octal = %o , hexadecimal = %x\n",x,x,x);
        System.out.printf("float = %e ,  %e\n",y,z);
        System.out.printf("Thank you %s \n",str);// %s is used for the string.
        System.out.printf(" %1$d , %2$f , %1$d , %3$s\n",x , y , str);
        System.out.printf("%50d\n",x);// gives width
        System.out.printf("%050d\n",x);// flag
        System.out.printf("%(50d\n",w);// negative numbers are shown in brackets.
        System.out.printf("%+50d\n",w);// displays whether the number is +ive or -ive.
        System.out.printf("%+50d\n",x);
        System.out.printf("%+50.2f\n",y);// displays float value and two decimal places after the decimal point.
        System.out.printf("%+50f\n",y);// precise value.
        System.out.printf("%-50s spacing to the right.\n",str);// adding a + or 0 flag to it will present an error.
        System.out.printf("spacing to the left. %50s\n",str);
    }
}