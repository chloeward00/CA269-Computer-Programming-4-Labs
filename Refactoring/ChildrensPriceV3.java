public class ChildrensPrice extends Price{
    public double getCharge(int _daysRented){
        if ( _daysRented > 3){
            return 1.5 + ((_daysRented - 3) * 1.5);
        }
        return 1.5;
    }
    public int getFrequentRenterPoints(int points){
        return 1;
    }
}