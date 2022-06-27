public class Rating
{
    private String name; // name of company
    private double rating; // number rating (0 - 5)
    public String business;
    public double initialRating;
    
    
    public Rating(String company, double initialRating)
    {
        //name = company;
        business = company;
        rating = initialRating;
    }
    
    // Set rating to newRating
    // As long as it's no more than 5

    // The Rating class represents a rating system for a company. The company is rated on a scale of 0 - 5. 

    // You need to fill in the setRating() method. The rating should only be changed if the new rating is 5 or less. 
    public void setRating(double newRating){
      // if(newRating <= 5)
      // {
      //   rating = newRating;
      // }
      
      // if (newRating > 5){
      //   System.out.println("Please rate on a range from 0-5 stars");
      // }
      rating = newRating;
    }
     
    // Returns the rating of the company
    public double getRating()
    {
        return rating;
    }
    
    // Returns a string representation of the company6
    
    // based on their ratings
    public String toString()
    {
      if(rating < 2)
      {
        return "Not Recommended Company: " + business;
      }
      if(rating >= 3.5)
      {
        return "Gold Star Company: " + business;
      }
        return "Well Rated Company: " + business;
    }

}
