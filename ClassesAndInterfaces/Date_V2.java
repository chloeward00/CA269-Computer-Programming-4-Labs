public class Date
{
    private int day;
    private int month;
    private int year;

    public Date() // when initialising to a certain time the constructor takes in no values
    {
    	day = 1; // this.day etc is no longer use when were telling the program what to use
    	month = 1;
    	year = 1;
    }
    
    public String toString()
    {
        return day + "/" + month + "/" + year;
    }
}