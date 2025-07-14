import java.lang.*;

public class Challenge3
{
    public static void main(String args[])
    {
        String str = "J@v@1$2?3#" ;
        // Removing special character's from a string
        String str0 = str.replaceAll("[^a-z0-9A-Z]" , "        ");
        System.out.println(str0);
        // Removing extra space from a string
        String str1 = str0.replaceAll("\\s+" , "   ");//s+ "+" i necessary
        System.out.println(str1);

        //The above code can also be implemented in this manner.
        //String str = "J@v@1$2?3#       ";
        //System.out.println(str.replaceAll("[^a-z0-9A-Z]", "    ") .replaceAll("\\s" , "" ) .trim());
        // Finding no. of words in a string.

        String str2[] = str1.split("\\s+");
        System.out.println(str2.length);

    }
}
