public class Challenge1
{
    public static void main (String args[])
    {
        String str = "javaprogrammer@gmail.com" ;

        System.out.println(str);
        System.out.println("E-mail is made using G-mail = " + str.contains("gmail"));
        System.out.println("Domain name = " + str.substring( str.indexOf("@")));
        System.out.println("Username name = " + str.substring( 0  , str.indexOf("@")));
    }
}