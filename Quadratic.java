//Comments added by Anushka Chougule 
import java.util.Scanner;

public class Quadratic {

    
  public static void main(String[] Strings) {
        // Sets Scanner 
        Scanner input = new Scanner(System.in);
          // Program asks for users input.
            System.out.print("Input a: ");
            //The users input is saved in the variable "a".
            double a = input.nextDouble();
            // Program asks for users input
            System.out.print("Input b: ");
            //The users input is saved in the variable "b".
            double b = input.nextDouble();
            // Program asks for users input
            System.out.print("Input c: ");
            //The users input is saved in the variable "c".
            double c = input.nextDouble();

            // result is calculated using the variables the user inputed above.
            double result = b * b - 4.0 * a * c;
            
            //Checks to see if the final result that is calculated is greater than 0.0.
            if (result > 0.0) {
		/* Math.sqrt() is used to calculate the square root of a value of type double passed to it as argument
		   For example here: It will compute the square root of  result */
		
                // if the "if statement" is true the program will fill in the variables and caluclate the r1 and r2.
                // r1 is  a addition of -b and Math.squrt(result)
                double r1 = (-b + Math.sqrt(result)) / (2.0 * a); 
                //r2 is  a subtraction of -b and Math.squrt(result)
                double r2 = (-b - Math.sqrt(result)) / (2.0 * a);
            
            // Prints out both of the roots that were calculated in line 33 and line 35.
                System.out.println("The roots are " + r1 + " and " + r2);
                
                
        // if the "if statement" is false the program will skip and come to the "else if".    
            } else if (result == 0.0) {
            // if the "else if" statement is true the program will only find the r1.
            // Line 45 calculates the root 1
                double r1 = -b / (2.0 * a);
                //The program prints out the root calculated in the "else if" statement.
                System.out.println("The root is " + r1);
                
                
         // if both the "if statement" as well as the "else if Statement" is false the program is left with only one option.
         // It comes to the "Else Statement.
            } else {
            // if the "else Statement" is true the program will print out that there is no real roots.
                System.out.println("The equation has no real roots.");
            }

    }
}