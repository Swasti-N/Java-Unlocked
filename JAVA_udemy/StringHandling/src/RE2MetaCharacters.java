import java.lang.*;

public class RE2MetaCharacters
{
    public static void main(String args[])
    {
        //These MetaCharacters are applicable only for single characters no double character.
        String str  = "1";
        String str1 = "a";
        String str2 = "$";
        String str3 = " ";
        // (\\w) works for both alphabets and digits
        System.out.print("1. ");
        System.out.println(str.matches("\\w"));//1
        System.out.print("2. ");
        System.out.println(str1.matches("\\w"));//a
        System.out.println("--x--x--");
        //(\\d) works only for digits
        System.out.print("1. ");
        System.out.println(str.matches("\\d"));//1
        System.out.print("2. ");
        System.out.println(str1.matches("\\d"));//a
        System.out.println("--x--x--");
        //(\\D) not a digit
        System.out.print("1. ");
        System.out.println(str.matches("\\D"));//1
        System.out.print("2. ");
        System.out.println(str1.matches("\\D"));//a
        System.out.print("3. ");
        System.out.println(str2.matches("\\D"));//$
        System.out.println("--x--x--");
        //(\\W)
        System.out.print("1. ");
        System.out.println(str.matches("\\W"));//1
        System.out.print("2. ");
        System.out.println(str1.matches("\\W"));//a
        System.out.print("3. ");
        System.out.println(str2.matches("\\W"));//$
        System.out.println("--x--x--");
        //(\\s) Space
        //Rest all cases from 1-3 print false output.
        System.out.println(str3.matches("\\s"));//_
        System.out.println("--x--x--");
        //(\\S) Not a Space
        // True for all the cases that are not a space .i.e from 1-3.
        System.out.print("1. ");
        System.out.println(str.matches("\\S"));//1
        System.out.print("2. ");
        System.out.println(str1.matches("\\S"));//a
        System.out.print("3. ");
        System.out.println(str2.matches("\\S"));//$
        System.out.print("4. ");
        System.out.println(str3.matches("\\S"));//_
        System.out.println("--x--x--");
    }
}