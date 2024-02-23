//Anushka Chougule 
import java.util.Scanner;
public class CustomerPlans{
	public static void main(String[] args){
   //Defining Varibales in integer, double, and character. 
		int minutes;
		double cost = 0.0;
		char customerType;
		
		Scanner input = new Scanner(System.in);
		
      // Asking the user if they  are a "residential or commercial customer?".
		System.out.println("Are you a residential or commercial customer? ");
      // Telling the user what to input in the abriviated form "res and com".
		System.out.println("type res for residential or com for commercial");
      // Telling the computer to use the first character of the input that is lowercase and use that.
		customerType = input.next().toLowerCase().charAt(0);
      
      //if the letter are "r" or "c" the computer will do the following:
		if(customerType == 'r' || customerType == 'c'){
      // print the following question if the statement is true:
			System.out.println("Enter the number of minutes used for the week");
      // Set Variable to :mintues"
			minutes = input.nextInt();
			
         // find the "extalMinR" and "extralMinC" by subtracting 60 or 300.  
			int extalMinR = minutes - 60;
			int extralMinC = minutes - 300;
			
         // if its "r" and min is "60" or less the cost is equal to 5
			if (customerType == 'r' && minutes <= 60){
				cost = 5 ;
			}
         // Or else the cost is 5 + (0.1 * extalMinR)
			else {
				cost = 5 + (0.1 * extalMinR);
			}
         
         //Or if customerType == 'c' && minutes <= 300
         //Cost is then 300 * 0.2
		
			if(customerType == 'c' && minutes <= 300){
			cost = 300 * 0.2;
			}			
         
         // or else if its not "r" then do the following:
			else if(customerType != 'r') {
         //cost is equal to (300 * 0.2) + (0.15 * extralMinC) 
			cost = (300 * 0.2) + (0.15 * extralMinC);		
			}
			
         // Print out Customer Type: + customerType
			System.out.print("Customer Type: " + customerType);
         // Print out ", Total minutes used =  + minutes
			System.out.print(", Total minutes used = " + minutes);
         // Print out , and your total cost = $%.2f, cost
			System.out.printf(", and your total cost = $%.2f", cost );
			//System.out.println(", and your total cost = " + cost);
			System.out.println();
	
		}
      // if both of them are false from the if statement then print: Error: Invalid input. Try again!!
		else {
		System.out.println("Error: Invalid input. Try again!!");
		}
	}
}