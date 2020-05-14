public class Movie {
 public static final int CHILDRENS = 2;
 public static final int REGULAR = 0;
 public static final int NEW_RELEASE = 1;

 private String _title;

 private int _priceCode;
 private int _daysRented;

 public Movie(String title, int priceCode) {
 	_title = title;
 	_priceCode = priceCode;
 
 	}
 public int getPriceCode() {
 	return _priceCode;
 	}
 public void setPriceCode(int arg) {
 	_priceCode = arg;
 	}
 public String getTitle (){
 	return _title;
 	};

 	public double getCharge(int _daysRented)
 	{
 		double amount = 0;
 		switch(_priceCode)
 		{
 			case Movie.REGULAR:
 			amount+= 2;
 			if(_daysRented > 2)
 			{
 				amount+= (_daysRented - 2) * 1.5; 			
 			}
 			break;

 			case Movie.NEW_RELEASE:
 			amount += _daysRented * 3;
 			break;

 			case Movie.CHILDRENS:
 			amount += 1.5;
 			if(_daysRented > 3)
 			{
 				amount += (_daysRented-3) * 1.5;
 			}
 			break;
 		}
 	  return amount;
 	}

 	    public int getFrequentRenterPoints(int _daysRented)
 		{
 		int poi = 1;
 		if ((_priceCode==Movie.NEW_RELEASE)&& _daysRented > 1)
 		{
 			poi++;
 		}
 	return poi;
 	}
 }