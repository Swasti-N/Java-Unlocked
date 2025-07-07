import java.lang.String;

public class StringMethods
{
    public static void main(String args[])
    {
        String str = " THANK YOU. ";
        String str0 ="HELLO! USER WELCOME TO JAVA PROGRAMMING.";

        //Upper-case & Lower-case.
        str0 = str0.toLowerCase();
        System.out.println("1. " + str0);
        String str1 = str0.toUpperCase();//A separate or a different string is used to assign the uppercase result inorder to prevent the original string from modification.
        System.out.println("2. " + str1);

        //Length of a string.
        System.out.println("3. " + str0.length());

        //trim.
        String str2 = "      Welcome      ";
        System.out.println("4. " + str2);
        str2 = str2.trim();
        System.out.println("5. " + str2);

        //Substring + starting index & ending index.
        System.out.println("6. " + str0.substring(0,4));

        //Replacing a letter.
        System.out.println("7. " + str1.replace('H','C'));
        str1 = str1.replace('H','J');
        System.out.println("8. " + str0+":before     after:"+str1);

        //STARTS & END'S WITH
        System.out.print("9. ");
        System.out.println(str0.startsWith("hello!"));//Boolean o/p
        System.out.print("10. ");
        System.out.println(str0.endsWith("programming."));//Boolean o/p

        //Returns character based on thr index.
        System.out.println("11. " + str0.charAt(9));
        System.out.print("12. ");
        for (int i = 0 ; i < str0.length(); i++)
            System.out.print(str0.charAt(i));
        System.out.println(".");

        //Returns index of a desired letter
        System.out.print("13. ");
        System.out.println(str0.indexOf("va"));//for a missing/invalid character -1 is returned.
        System.out.print("14. ");
        System.out.println(str0.indexOf("l",4));// for finding specific value.
        System.out.print("15. ");
        System.out.println(str0.lastIndexOf("a",32));// for finding index from the end - start .i.e from right - left.

        //Equals
        String str3 = "Python" ;
        String str4 = "Java" ;
        String str5 =  "python";
        String str6 = new String("Java");
        System.out.println("16. " + str4.equals(str6));
        System.out.println(str4 == str6);// Here the references are compared with each other.
        System.out.println("17. " + str3.equals(str5));
        System.out.println(str3 == str5);// Here the references are compared with each other.

        System.out.println("18. " + str3.equalsIgnoreCase(str5));

        // Compares two strings in dictionary order.
        System.out.println("19. " + str3.compareTo(str4));//Python(1st string) << Java(2nd String) = +ive value
        System.out.println("20. " + str4.compareTo(str3));//Java(1st string) >> Python(2nd String) = -ive value
        System.out.println("21. " + str4.compareTo(str6));// if both the values are equal = 0 result

        //Contains
        System.out.println("22. " + str0.contains("programming"));

        //Concat
        System.out.println("23. " + str0.concat(str));
        //System.out.println((str +  str0));Alternative method.
    }
}
