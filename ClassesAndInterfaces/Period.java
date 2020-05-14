public class Period
{
    private Time start;
    private Time end;
    
    
   // Private variables
   // Constructor (with two Time parameters)
   
   public Period(Time t1, Time t2)

    {
        start = t1;
        end = t2;
    }
    
    
    public boolean overlaps(Period otherPeriod)
    {
        if(otherPeriod.start.isLater(start) && end.isLater(otherPeriod.start))
        {
            return true;
        }
        if(start.isLater(otherPeriod.start) && otherPeriod.end.isLater(start))
        {
            return true;
        }
        
        return false;
    }
    
    public String toString()
    {
        return start + " -> " + end;
    }
   // overlaps(Period otherPeriod) // boolean method to check if two periods overlap
   // String toString() // return a String representation of the Period
}