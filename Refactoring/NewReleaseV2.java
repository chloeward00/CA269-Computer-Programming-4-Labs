public class NewReleasePrice extends Price
{
    public double getCharge(int _daysRented)
        {

            return _daysRented * 3;
        }
}