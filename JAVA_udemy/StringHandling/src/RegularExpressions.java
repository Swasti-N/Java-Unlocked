import java.lang.*;

public class RegularExpressions
{
    public static void main (String args[])
    {
        String str ="1";
        String str0 = "a";
        String str1 = "ab";
        String str2 = "abc";
        String str3 = "b";
        String str4 = "c";
        String str5 = "p";
        String str6 = "%";
        String str7 = "A";
        String str8 = "a8";
        String str9 = "7$";
        String str10 = "10z";
        // .
        System.out.print("1. ");
        System.out.println(str.matches("."));//1
        System.out.print("2. ");
        System.out.println(str0.matches("."));//a
        System.out.print("3. ");
        System.out.println(str1.matches("."));//ab
        System.out.print("4. ");
        System.out.println(str2.matches("."));//abc
        System.out.print("5. ");
        System.out.println(str6.matches("."));//%
        System.out.print("13. ");
        System.out.println(str7.matches("."));//A
        System.out.println("--x--x--");
        //[abc]
        System.out.print("5. ");
        System.out.println(str6.matches("[abc]"));//%
        System.out.print("6. ");
        System.out.println(str.matches("[abc]"));//1
        System.out.print("7. ");
        System.out.println(str0.matches("[abc]"));//a
        System.out.print("8. ");
        System.out.println(str1.matches("[abc]"));//ab
        System.out.print("9. ");
        System.out.println(str2.matches("[abc]"));//abc
        System.out.print("10. ");
        System.out.println(str3.matches("[abc]"));//b
        System.out.print("11. ");
        System.out.println(str4.matches("[abc]"));//c
        System.out.print("12. ");
        System.out.println(str5.matches("[abc]"));//p
        System.out.print("13. ");
        System.out.println(str7.matches("[abc]"));//A
        System.out.println("--x--x--");
        //^[abc]
        System.out.print("5. ");
        System.out.println(str6.matches("[^abc]"));//%
        System.out.print("6. ");
        System.out.println(str.matches("[^abc]"));//1
        System.out.print("7. ");
        System.out.println(str0.matches("[^abc]"));//a
        System.out.print("8. ");
        System.out.println(str1.matches("[^abc]"));//ab
        System.out.print("9. ");
        System.out.println(str2.matches("[^abc]"));//abc
        System.out.print("10. ");
        System.out.println(str3.matches("[^abc]"));//b
        System.out.print("11. ");
        System.out.println(str4.matches("[^abc]"));//c
        System.out.print("12. ");
        System.out.println(str5.matches("[^abc]"));//p
        System.out.print("13. ");
        System.out.println(str7.matches("[^abc]"));//A
        System.out.println("--x--x--");
        //[a-z0-9]
        System.out.print("5. ");
        System.out.println(str6.matches("[a-z0-9]"));//%
        System.out.print("6. ");
        System.out.println(str.matches("[a-z0-9]"));//1
        System.out.print("7. ");
        System.out.println(str0.matches("[a-z0-9]"));//a
        System.out.print("8. ");
        System.out.println(str1.matches("[a-z0-9]"));//ab
        System.out.print("9. ");
        System.out.println(str2.matches("[a-z0-9]"));//abc
        System.out.print("10. ");
        System.out.println(str3.matches("[a-z0-9]"));//b
        System.out.print("11. ");
        System.out.println(str4.matches("[a-z0-9]"));//c
        System.out.print("12. ");
        System.out.println(str5.matches("[a-z0-9]"));//p
        System.out.print("13. ");
        System.out.println(str7.matches("[a-z0-9]"));//A
        System.out.println("--x--x--");
        //[a-zA-Z0-9]
        System.out.print("5. ");
        System.out.println(str6.matches("[a-zA-Z0-9]"));//%
        System.out.print("6. ");
        System.out.println(str.matches("[a-zA-Z0-9]"));//1
        System.out.print("7. ");
        System.out.println(str0.matches("[a-zA-Z0-9]"));//a
        System.out.print("8. ");
        System.out.println(str1.matches("[a-zA-Z0-9]"));//ab
        System.out.print("9. ");
        System.out.println(str2.matches("[a-zA-Z0-9]"));//abc
        System.out.print("10. ");
        System.out.println(str3.matches("[a-zA-Z0-9]"));//b
        System.out.print("11. ");
        System.out.println(str4.matches("[a-zA-Z0-9]"));//c
        System.out.print("12. ");
        System.out.println(str5.matches("[a-zA-Z0-9]"));//p
        System.out.print("13. ");
        System.out.println(str7.matches("[a-zA-Z0-9]"));//A
        System.out.println("--x--x--");
        //[a-z][0-9]
        //All the above cases would print false .i.e from 1-13.
        System.out.print("14. ");
        System.out.println(str8.matches("[a-z][0-9]"));//a8
        System.out.print("15. ");
        System.out.println(str9.matches("[a-z][0-9]"));//a$
        System.out.print("16. ");
        System.out.println(str10.matches("[a-z][0-9]"));//10z
        //[a | b]
        // the above cases would print false .i.e from 12-16.
        System.out.print("5. ");
        System.out.println(str6.matches("[a | b]"));//%
        System.out.print("6. ");
        System.out.println(str.matches("[a | b]"));//1
        System.out.print("7. ");
        System.out.println(str0.matches("[a | b]"));//a
        System.out.print("8. ");
        System.out.println(str1.matches("[a | b]"));//ab
        System.out.print("9. ");
        System.out.println(str2.matches("[a | b]"));//abc
        System.out.print("10. ");
        System.out.println(str3.matches("[a | b]"));//b
        System.out.println("--x--x--");
        //String matching
        //Rest all cases print false output.
        System.out.print("9. ");
        System.out.println(str2.matches("abc"));//abc
        System.out.println("--x--x--");

    }
}
