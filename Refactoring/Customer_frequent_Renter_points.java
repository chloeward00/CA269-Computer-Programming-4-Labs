import java.util.*;
class Customer {
    private String _name;
    private List<Rental> _rentals;
    public Customer (String name, List<Rental> rentedlist){
        _name = name;
        _rentals=rentedlist;
    }
  
    public String getName(){
        return _name;
    }
    public List<Rental> getRentals(){
        return _rentals;
    }
    public String toString(){
        return _name+": "+_rentals.toString();
    }
    public String statement(){
        double totalA =0;
        int frequentRenterPoints=0;
        String result="";
        for (Rental rented:_rentals){
            double currAmount=0;
            currAmount=getTotal(rented);
            frequentRenterPoints += getFrequentRenterPoints(rented);
            if ((rented.getMovie().getPriceCode() == Movie.NEW_RELEASE) && rented.getDaysRented()>1){frequentRenterPoints++;}
            result +="  "+ rented.getMovie().getTitle()+"  "+String.valueOf(currAmount)+"\n";
            totalA+=currAmount;
        }
        result += "Amount owed is " + String.valueOf(totalA) +"\n";
        result += "You earned " + String.valueOf(frequentRenterPoints - 1)+" frequent renter points"+"\n";
        return result;
    }
    public double getTotal(Rental rented)
    {
       return rented.getCharge();
    }

    public int getFrequentRenterPoints(Rental rented)
    {
        int poi = 1;
        if((rented.getMovie().getPriceCode()==Movie.NEW_RELEASE)&&rented.getDaysRented()>1)
        {
            poi++;
        }
    return poi;
    }
}