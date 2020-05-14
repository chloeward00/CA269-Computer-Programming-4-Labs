class Rental {
 	private Movie _movie;
 	private int _daysRented;

 	public Rental(Movie movie, int daysRented) {
 		_movie = movie;
 		_daysRented = daysRented;
 		}

 	public int getDaysRented() {
 		return _daysRented;
 		}

 	public Movie getMovie() {
 		return _movie;
 		}
 	public String toString()
 	{
 		return this.getMovie() + " [" + this.getDaysRented() + "]";
 	}

public int getFrequentRenterPoints()
    {
        return _movie.getFrequentRenterPoints(_daysRented);
    }

  public double getCharge()

  {
  	return _movie.getCharge(_daysRented);
  }

 }