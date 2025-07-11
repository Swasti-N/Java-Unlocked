import java.lang.*;

public class RE3Quantifiers
{
    public static void main(String args[])
    {
        String str = "aB1@a " ;//space is also included.
        String str0 = "aabcaccba";
        String str1 = "apple";
        String str2 = "app";
        String str3 = "swasti.nirawade.it@gmail.net";

        System.out.println(str.matches(".*"));//(.*) --> anything 0 or more
        System.out.println("--x--x--");

        System.out.println(str0.matches("[abc]*"));//No numbers or capital letters or symbols + separate spacing prints TRUE output.
        System.out.println("--x--x--");

        System.out.println(str1.matches("[a-z]*"));//Lowercase only + separate spacing prints TRUE output
        System.out.println("--x--x--");

        System.out.println(str1.matches("[a-z]+"));//Same as [a-z]* + separate spacing prints false output.
        System.out.println("--x--x--");

        System.out.println(str2.matches("[a-z]{3}"));//Character's must not exceed or lack the given limit + Same as [a-z]+.
        System.out.println("--x--x--");

        System.out.println(str1.matches("[a-z]{3,5}"));//Character's must not exceed or lack the given limit + Same as [a-z]+.
        System.out.println("--x--x--");

        System.out.println(str3.matches("\\w*@gmail.*"));//Gmail.
        System.out.println("--x--x--");
    }
}
