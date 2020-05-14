public class RegularPrice extends Price
{
    public double getCharge(int _daysRented)
    {
        if (_daysRented > 2)
        {
            return (2 + ((_daysRented - 2) * 1.5)) * 2;
        }
        return 4;
    }   
     public int getFrequentRenterPoints(int points)
     {
        return 1;
    }
     public int getPriceCode()
     {
        return REGULAR*2;
    }
}