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
    
    public String toString()
    {
        return day + "/" + month + "/" + year;
    }
}