import java.lang.*;
import java.util.Scanner;

public class BitWise2
{
    public static void main( String args[] )
    {
        int y , z;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter value for x");
        y = 10 ;
        z = y << 2 ; // here the input value is shifed to left by two bits.
        System.out.println("(Left Shift by 2 Bits)z = " +z);

        System.out.println("--x-x--");

        y = 0b1010 ; // 0b1000 = 10
        z = y >> 2 ;
        System.out.println("(Right Shift by 2 Bits)z = " +z);

        System.out.println("--x-x--");

        y = 0b1010 ; // 0b1000 = 10
        z = y >>> 2 ;
        System.out.println("(Unsigned Right Shift by 2 Bits)z = " +z);

        System.out.println("--x-x--");

        y = -0b1010 ;
        z = y << 1 ; // here the input value is shifed to left by two bits.
        System.out.println("(Left Shift by 1 Bits)z = " +z);

        System.out.println("--x-x--");

        y = -0b1010 ; // -0b1000 = -10
        z = y >> 1 ;
        System.out.println("(Right Shift by 1 Bits)z = " +z);
        System.out.println(String.format("Binary form of y                . %s", Integer.toBinaryString(y)));// Binary form of y. the shift can be noticed clearly in y and z.
        System.out.println(String.format("Binary form of z for Right Shift. %32s", Integer.toBinaryString(z)));// Binary form of z.

        System.out.println("--x-x--");

        y = -0b1010 ; // 0b1010 = -10-
        z = y >>> 1 ;
        System.out.println("(Unsigned Right Shift by 1 Bits)z = " +z);
        System.out.println(String.format("Binary form of y                         . %s", Integer.toBinaryString(y)));// Binary form of y. the shift can be noticed clearly in y and z.
        System.out.println(String.format("Binary form of z for Unsigned Right Shift. %32s", Integer.toBinaryString(z)));// Binary form of z.

        System.out.println("--x-x--");

        y = 0b1010 ; //0b1010 = 10
        z = ~ y ;
        System.out.println(String.format("Binary form of        . %s", Integer.toBinaryString(y)));// Binary form of y. the no.'s are reversed
        System.out.println(String.format("Binary form of z (NOT). %32s", Integer.toBinaryString(z)));// Binary form of z.
        System.out.println("z = "+z);

        System.out.println("--x-x--");

        y = -0b1010 ; // -0b1010 = -10
        z = ~ y ;
        System.out.println(String.format("Binary form           . %s", Integer.toBinaryString(y)));// Binary form of y. the no.'s are reversed
        System.out.println(String.format("Binary form of z (NOT). %32s", Integer.toBinaryString(z)));// Binary form of z.
        System.out.println("z = "+z);

        System.out.println("--x-x--");
    }
}