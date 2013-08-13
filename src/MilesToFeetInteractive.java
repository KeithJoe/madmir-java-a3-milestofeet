import java.util.Scanner;
import javax.swing.JOptionPane;

public class MilesToFeetInteractive {

	public static void main(String[] args) {
		
		//Declare an initialize name constant FEET_PER_MILE
		final int FEET_PER_MILE = 5280;
		//Declare and initialize variables
		float uncleMiles = 85f; 
		float uncleFeet;
		uncleFeet = uncleMiles * FEET_PER_MILE;
		Scanner sc = new Scanner(System.in);
				
		//Display output
		System.out.print("Enter a number: ");
		uncleMiles = sc.nextFloat();
		uncleFeet = uncleMiles * FEET_PER_MILE;
		System.out.println("The distance to my uncles house is " + uncleMiles + " miles");
		System.out.println("That's " + uncleFeet + "feet");
		JOptionPane.showMessageDialog(null, "How many miles to your uncles house? " + uncleMiles + " miles. Thats " + uncleFeet + "feet!");
		
			}	

	}
