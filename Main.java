import java.util.Scanner;
public class Main 
{
  public static void main(String[] args) 
  {
    	Scanner sc = new Scanner(System.in);

      System.out.println("First User's Rating - -");
    	System.out.println("Enter your rating:");
    	double firstRating = sc.nextDouble();  //may need fixing

      while (firstRating > 5){
        System.out.println("Please enter again wite a rate on a range from 0-5 stars: ");
        firstRating = sc.nextDouble(); 
      }

    	System.out.println("Enter the Business: ");
    	String business = sc.next();
    
     // System.out.println(business);


		//Create object so that test cases work
		Rating b1 = new Rating(business, firstRating);
    b1.getRating(); 

		
		//Test Case: User Input
		System.out.println("Current Rating: " + b1.getRating());
		System.out.println(b1);
		b1.toString();

		// Test Case: High rating
    System.out.println("Second User's Rating - -");
		b1.setRating(4.5);
		System.out.println("\nCurrent Rating: " + b1.getRating());
		System.out.println(b1);
		        
		// Test Case: Setting rating too high
    System.out.println("Third User's Rating - -");
		b1.setRating(100);
		System.out.println("\nCurrent Rating: " + b1.getRating());
		System.out.println(b1);
		        
		// Test Case: Low rating
    System.out.println("Fourth User's Rating - -");
		b1.setRating(1);
		System.out.println("\nCurrent Rating: " + b1.getRating());
		System.out.println(b1); 
    b1.toString();

   }

}