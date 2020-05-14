import java.util.Scanner;

public class Date
{
    private int day;
    private int month;
    private int year;
    
    public Date(String s)
   {
      String[] values = s.split(" ");
      day = Integer.parseInt(values[0]);
      month = Integer.parseInt(values[1]);
      year = Integer.parseInt(values[2]);
   }

    public String toString()
    {
        return day + "/" + month + "/" + year;
    }
    
    // Insert the isAfter method here.
    public boolean isAfter(Date other)
    {
        if(this.year > other.year){return true;}
        else if(this.year == other.year && this.month > other.month){return true;}
        else if(this.year == other.year && this.month == other.month && this.day >= other.day){return true;}
        return false;
    }

    // Here is the main method which will read in a sequence of dates.
    // Modify it so that it prints the latest date.
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        Date latest = new Date("0 0 0");
        String line;
        while(in.hasNextLine())
        {
           line = in.nextLine();
           if(line.length() != 0)
           {
              Date date = new Date(line);
              // Do what you want with the date.
              if(date.isAfter(latest)){latest = date;}
           }

        }
        System.out.println(latest); // Print the latest date
    }
}
