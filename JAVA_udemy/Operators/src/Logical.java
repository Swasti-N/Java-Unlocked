import java.lang.*;

public class Logical
{
    public static void main(String args[])
    {
      int a = 5 , b = 10 , c = 15 ;
      boolean R ;

      System.out.println("&&");
      R = a < b && a < c ;
      System.out.println("1. TT = " +R);
      R = a > b && a < c ;
      System.out.println("2. FT = " +R);
      R = a < b && a > c ;
      System.out.println("3. TF = " +R);
      R = a > b && a > c ;
      System.out.println("4. FF = " +R);

      System.out.println("--x--x--");

      System.out.println("||");
      R = a < b || a < c ;
      System.out.println("5. TT = " +R);
      R = a > b || a < c ;
      System.out.println("6. FT = " +R);
      R = a < b || a > c ;
      System.out.println("7. TF = " +R);
      R = a > b || a > c ;
      System.out.println("8. FF = " +R);

      System.out.println("--x--x--");
      System.out.println("Logical NOT (!)A");
      boolean A ;

      A = a > b ;
      R = !A ;
      System.out.println("9. " +R);

      A = a < b;
      R = !A ;
      System.out.println("10. " +R);

      A = a == b;
      R = !A ;
      System.out.println("11. " +R);

      A = a != b;
      R = !A ;
      System.out.println("12. " +R);

      System.out.println("--x--x--");
    }
}
