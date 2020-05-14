public class RegularPrice extends Price{
    public double getCharge(int _daysRented){
        if (_daysRented > 2)
        {
            return 2 + ((_daysRented - 2) * 1.5);
        }
        return 2;
    }   
     public int getFrequentRenterPoints(int points)
     {
        return 1;
    }
}