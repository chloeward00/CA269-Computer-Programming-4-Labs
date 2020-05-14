public class Date
{
    private int day;
    private int month;
    private int year;

    public Date(String word)
    {
    	String [] dates = word.split(" "); // initialising a string list and splitting it
    	day = Integer.parseInt(dates[0]); // position 0 in list
    	month = Integer.parseInt(dates[1]); // position 1 in list
    	year = Integer.parseInt(dates[2]); // position 2 in list
    }

    public boolean isOnOrAfter(Date date2) //calling from Date constructor above
    {
        int year1 = this.day + this.month + this.year; // original date no.1 
        int date2 = date2.day + date2.month + date2.year; // calling date again which makes date2
        if(year1 >= year2)
        {
            return true;
        }
        return false; // if it doesnt this return false
    }
    
    public String toString()
    {
        return day + "/" + month + "/" + year;
    }
}