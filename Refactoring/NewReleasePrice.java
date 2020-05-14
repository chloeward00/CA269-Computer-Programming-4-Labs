public class NewReleasePrice extends Price{
    public double getCharge(int _daysRented){
        return 3 * _daysRented;
    }  
     public int getFrequentRenterPoints(int points){
        if (points > 1)
        {  
            return 2;
            
        }
        return 1;
    }
}