import java.util.*;

class Customer {
    private String _name;
    private List<Rental> _rentals;
    public Customer (String name, List<Rental> rentinglist){

        _name = name;
        _rentals=rentinglist;
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
        double totalAm =0;
        int frequentRenterPoints=0;
        String result="";
        for (Rental rental:_rentals){
            double currAmount=0;
            switch(rental.getMovie().getPriceCode()){
                case Movie.REGULAR:
                    currAmount+=2;
                    if(rental.getDaysRented()>2){
                        currAmount+= (rental.getDaysRented()-2)*1.5;
                    }
                    break;
                case Movie.NEW_RELEASE:
                    currAmount+= rental.getDaysRented()*3;
                    break;
                case Movie.CHILDRENS:
                    currAmount+=1.5;
                    if (rental.getDaysRented()>3){
                        currAmount+= (rental.getDaysRented()-3)*1.5;
                    }
                    break;
            } 
            frequentRenterPoints++;
            if ((rental.getMovie().getPriceCode() == Movie.NEW_RELEASE) && rental.getDaysRented()>1){frequentRenterPoints++;}
            result+="  "+ rental.getMovie().getTitle()+"  "+String.valueOf(currAmount)+"\n";
            totalAm+=currAmount;
        }
        result += "Amount owed is " + String.valueOf(totalAm) +"\n";
        result += "You earned " + String.valueOf(frequentRenterPoints)+" frequent renter points"+"\n";
        return result;
    }

}