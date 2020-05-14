import java.util.Scanner;

public class Main
{
   public static void main(String [] args)
   {
      Scanner in = new Scanner(System.in);
      String line1 = in.nextLine();
      String line2 = in.nextLine();

      Time time1 = new Time(line1);
      Time time2 = new Time(line2);

      if(time1.isLater(time2))
         System.out.println(time1 + " is later than " + time2);
      else
         System.out.println(time1 + " is not later than " + time2);
   }
}