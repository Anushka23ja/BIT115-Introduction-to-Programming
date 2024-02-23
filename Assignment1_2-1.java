// worked on by Anushka Chougule
// imports package with various tools like Random, Scanner and more.
import java.util.*;
public class Assignment1_2 {

    public static void main(String[] args) {
    
        
        // Setting the Scanner into variable that way it can be used later on.
        // For instance, cin.nextInt()     
        Scanner cin= new Scanner(System.in);
        
        // Settting the Varibale into a specific category like string, double and int.
        String name; 
        double perGallon;         
        double totalPrice;   
        int odometer;   
        int finalodometer;   
 
        // Asking the user for input on each of the questions.
        // Then saving the users input into a variable which you can use later.
        // To help for sentence as well as do calculations form the users input. 
        System.out.println("Enter your name: ");
        name= cin.next();
        
        System.out.println("Enter price per gallon: ");
        perGallon= cin.nextDouble();
        
        System.out.println("Enter total price for fill up:");
        totalPrice= cin.nextDouble();
        
        System.out.println("Enter initial odometer value:");
        odometer= cin.nextInt();
        
        System.out.println("Enter final odometer value:");
        finalodometer= cin.nextInt();
        
       //Calculating the miles, gallons and mpg from the previous variables. 
       //To help printout the sentence with correct calculations.
       int miles= finalodometer-odometer;
       double gallons= (int)(miles/perGallon);
       double mpg= (int)(miles/gallons);
       
       //Printout the final cacluations by linking them into a sentence. 
       System.out.printf(name+ " you drove "+ miles + " miles using %.1f", gallons);
       System.out.printf(" gallons with an mpg %.1f", mpg);
              
    }

}
