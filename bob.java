//Anushka Chougule
import java.util.Scanner;
public class bob{
    public static void main(String[] args){
     	Scanner input = new Scanner(System.in);
      String firstname, lastname, state, creditHours, MTS, OLCredit, MClass;
      double cost;
      
     	System.out.println("Enter your first name:");
      firstname = input.next();
		System.out.println("Enter your last name:");
      lastname = input.next();

		System.out.println("Enter your state of residence as a 2-letter abbreviation (upper case): ");
      state = input.next();
      
      if(input.equalsIgnoreCase("OH", "WA","NY", "CA"){
      }

      System.out.println("Enter the total credit hours for the upcoming semester: ");
      creditHours = input.next();
      
      System.out.println("Enter the total number of MTS courses you are taking: ");
      MTS = input.next();
      
      System.out.println("Enter the total number of on-line credit hours you are taking: ");
      OLCredit = input.next();
      
      System.out.println("Are you taking one of MATH 140 or CSC 250 (Y/N): ");
      MClass = input.next();


    }
}
