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
        double totalAmount =0;
        int frequentRenterPoints=0;
        String result="";
        for (Rental rental:_rentals){
            double currAmount=0;
             currAmount=getTotal(rental);
            frequentRenterPoints++;
            if ((rental.getMovie().getPriceCode() == Movie.NEW_RELEASE) && rental.getDaysRented()>1)
            {
                frequentRenterPoints++;
                
            }
            result +="  "+ rental.getMovie().getTitle()+"  "+String.valueOf(currAmount)+"\n";
            totalAmount+=currAmount;
        }
        result += "Amount owed is " + String.valueOf(totalAmount) +"\n";
        result += "You earned " + String.valueOf(frequentRenterPoints)+" frequent renter points"+"\n";
        return result;
    }
    public double getTotal(Rental rented){
        double amount=0;
        switch(rented.getMovie().getPriceCode()){
                case Movie.REGULAR:
                    amount +=2;
                    if(rented.getDaysRented()>2){
                        amount+= (rented.getDaysRented()-2)*1.5;
                    }
                    break;
                case Movie.NEW_RELEASE:
                    amount += rented.getDaysRented()*3;
                    break;
                case Movie.CHILDRENS:
                    amount +=1.5;
                    if (rented.getDaysRented()>3){
                        amount += (rented.getDaysRented()-3)*1.5;
                    }
                    break;
            }
        return amount;
    }
}