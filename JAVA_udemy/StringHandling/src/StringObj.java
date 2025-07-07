import java.lang.*;

public class StringObj
{
    public static void main( String args[] )
    {
        char c[] = {'H' , 'E' , 'L' , 'L' , 'O' };
        String str1 = new String(c,0,5);
        System.out.println(str1);

        byte b[] = {65 , 66 , 83 , 87 , 65 , 83 , 84 , 73};
        String str2 = new String(b,2,6);// user can change and experiment with the values
        System.out.println(str2);

        String str3 = "USER";
        System.out.println(str3);
        String str4 = "USER";//the o/p shall be false if a lower-case letter shall be in either of the str1 & str2.
        System.out.println(str3 == str4);//even a small change in either of the strings may print different o/p
        String str5 = new String("USER");
        System.out.println(str3 == str5);

        String str6 = new String("WELCOME - JAVA PROGRAMMING");
        System.out.println(str6);
    }
}
