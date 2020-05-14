public class Movie {
     public static final int  CHILDRENS = 2;
   public static final int  REGULAR = 0;
   public static final int  NEW_RELEASE = 1;
    private String _title;
    public Price price;
    public Movie(String title, int priceCode) {
       _title = title;
        setPriceCode(priceCode);
       }
     public int getPriceCode() {
        return price.getPriceCode();
         }
     public void setPriceCode(int arg) {

        if (arg==CHILDRENS){
            price= new ChildrensPrice();
        }
        else if(arg==NEW_RELEASE){
            price= new NewReleasePrice();
        }
        else
            price = new RegularPrice();
        }
    public String getTitle (){
       return _title;
       }
    public double getCharge(int _daysRented){
        double amount=0;
        if (price.getPriceCode()==REGULAR){
                amount+=2;
                if(_daysRented > 2){
                    amount+= (_daysRented - 2)*1.5;
                }
        }
        else if (price.getPriceCode()==NEW_RELEASE){
                amount+= _daysRented * 3;
        }
        else if (price.getPriceCode()==CHILDRENS){
                amount+=1.5;
                if (_daysRented > 3){
                    amount+= (_daysRented - 3) * 1.5;
                }
        }
        return amount;
    }
    public int getFrequentRenterPoints(int _daysRented){
        int poi=1;
        if ((price.getPriceCode()==NEW_RELEASE) && _daysRented > 1)
            {
                poi++;
            }
        return poi;
    }
 }