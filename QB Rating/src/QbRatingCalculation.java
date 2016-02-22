//Import Scanner Method
import java.util.Scanner;
public class QbRatingCalculation {

	public static void main(String[] args) {
		//Creates Scanner Object
		Scanner input = new Scanner(System.in);
		
		//Collects QB Statistics
		System.out.print("Enter total touchdowns: ");
		float TD = input.nextInt();
		
		System.out.print("Enter total passing yards: ");
		float Yards = input.nextInt();
		
		System.out.print("Enter total thrown interceptions: ");
		float INT = input.nextInt();
		
		System.out.print("Enter total number of completions: ");
		float comp = input.nextInt();
		
		System.out.print("Enter total number of attempted passes: ");
		float ATT = input.nextInt();
		
		//Rating Calculation
		double a = ((comp / ATT) - 0.3) * 5;
		double b = ((Yards / ATT) - 3) * 0.25;
		double c = (TD / ATT) * 20;
		double d = 2.375 - ((INT / ATT) * 25); 
		double qb_rating = ((a + b + c + d) / 6) * 100; 
		//Display Rating
		System.out.printf("You quarterback's rating is: " + "%3.1f",qb_rating);

	}

}
