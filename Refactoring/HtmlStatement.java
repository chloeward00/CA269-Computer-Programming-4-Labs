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
        String output = "Statement for " + getName() + "\n";
        for(Rental rental : getRentals())
            output += "  " + rental.getMovie().getTitle() + "  " + rental.getCharge() + "\n";

        output += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
        output += "You earned " + String.valueOf(getTotalFrequentRenterPoints())  + " frequent renter points\n";
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

    public String htmlStatement()
    {
        String output = "<h1>Statement for " + getName() + "</h1>\n<ol>\n";
        for(Rental rental : getRentals())
        {
            output += "  <li>" + rental.getMovie().getTitle() + "  " + rental.getCharge() + "</li>\n";
        }

        output += "</ol>\n<p>Amount owed is " + String.valueOf(getTotalCharge()) + "</p>\n";
        output += "<p>You earned " + String.valueOf(getTotalFrequentRenterPoints())  + " frequent renter points.</p>\n";
        return output;
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