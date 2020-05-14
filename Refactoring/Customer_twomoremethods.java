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

    public String statement()
    {
        String output = "";
        double total = 0;
        int frequentRenterPoints = 0;
        for(Rental rental : getRentals())
        {
            double currAmount = 0;
            currAmount = getTotal(rental);
            total += getTotal(rental);
            frequentRenterPoints += getFrequentRenterPoints(rental);
            output += "  " + rental.getMovie().getTitle() + "  " +  currAmount + "\n";
        }
    
        output += "Amount owed is " + total + "\n";
        output += "You earned " + frequentRenterPoints + " frequent renter points\n";
        return output;
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

    public double getTotalCharge()
    {
        double total = 0;
        for(Rental rentals: _rentals)
        {
            total += getTotal(rentals);
        }
    return total;
    }

    public int getTotalFrequentRenterPoints()
    {
        int poi = 0;
        for(Rental rentals: _rentals)
        {
            poi += getFrequentRenterPoints(rentals);
        }
    return poi;
    }
}