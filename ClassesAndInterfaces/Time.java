public class Time
{
   private String time; 
   private int hour;
   private int minutes;

   public Time(String time2) // taking an string in the format 1145
   {
      hour = Integer.parseInt(time2.substring(0,2));
      minutes = Integer.parseInt(time2.substring(2,4));
      time = time2;
   }

   public boolean isLater(Time othertime)
   {
    if(this.hour == othertime.hour && this.minutes > othertime.minutes)
    {
      return true;
    }
    else if(this.hour > othertime.hour)
    {
      return true;
    }
    return false;
   }
   public String toString()
   {
      return(hour + ":" + minutes);
   }
}