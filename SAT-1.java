//Anushka Chougule
import java.util.Scanner;
public class SAT {
   public static void main(String[] args)
   {   
      Scanner in = new Scanner(System.in);//Scanner 
      
      System.out.println("This program compares two applicants to determine which one seems like the stronger applicant."); //Printing out Notes for user. 
      System.out.println("For each candidate I will need either SAT or ACT scores plus a weighted GPA.");// Printing out a statment for the user to read.
      System.out.println("Information for the first applicant: ");// Printing out a statment for the user to read.
      System.out.println("Do you have 1) SAT scores or 2) ACT scores? "); //Asking the user a question 
      double test = in.nextInt(); //Saving the users comment in one variable            
      double app1 = applicant(test,in); // Saving the calculation in the variable "app1"
      System.out.println(); // Printing a blank line 
      System.out.println(); // Printing a blank line 
      System.out.println("Information for the second applicant: "); // Printing out a statment for the user to read. 
      System.out.println("Do you have 1) SAT scores or 2) ACT scores? "); //Asking the user a question 
      test = in.nextInt(); //Saving the users comment in one variable   
      double app2 =  applicant(test,in); // Saving the calculation in the variable "app2"
      reportResults( app1, app2); // taking "app1" and "app2" and sending it to method "reportResults"
   } 
   public static double applicant(double test , Scanner in){ //Creating a new method
      if( test == 1){ // If the user inputs in "1" then do the following
         System.out.println("SAT math: "); //Asking the user the "SAT Math"
         double math = in.nextDouble(); //Saving the user input into one variable
         System.out.println("SAT verbal: "); //Asking the user the "SAT verbal"
         double verbal = in.nextDouble(); //Saving the user input into one variable
         System.out.println("Overall GPA: "); //Asking the user the "Overall GPA"
         double overall = in.nextDouble();  //Saving the user input into one variable
         System.out.println("Max GPA: "); //Asking the user the "Max GPA"
         double max = in.nextDouble();  //Saving the user input into one variable
         double score = computeSAT(verbal, math, overall, max); //Saving the Calculation from computeSAT in variable "score"
         System.out.println("First applicant overall score 1: "); //Printing out the First applicants Overall Score
         System.out.printf("%.2f", score); // Printing out the Actual Value, 2 places over the decimal point
      }
      else if( test == 2){ // If the user inputs in "2" then do the following
         System.out.println("ACT English: ");//Asking the user the "ACT English"
         double english = in.nextDouble();//Saving the user input into one variable
         System.out.println("ACT math:  ");//Asking the user the "ACT math"
         double amath = in.nextDouble();//Saving the user input into one variable
         System.out.println("ACT reading: ");//Asking the user the "ACT reading"
         double reading = in.nextDouble();//Saving the user input into one variable
         System.out.println("ACT science: ");//Asking the user the "ACT science"
         double science = in.nextDouble();//Saving the user input into one variable
         System.out.println("Overall GPA: ");//Asking the user the "Overall GPA"
         double aoverall = in.nextDouble() ;//Saving the user input into one variable
         System.out.println("Max GPA: ");//Asking the user the "Max GPA"
         double amax =  in.nextDouble(); //Saving the user input into one variable     
         double scorea = computeACT(reading, english, amath ,science, aoverall, amax ); // Saving the Calculation from "computeACT" in the variable "scorea"
         System.out.println("First applicant overall score 2: "); //Printing out the First applicants Overall Score
         System.out.printf("%.2f", scorea); // Printing out the Actual Value, 2 places over the decimal point      }
      } 
      return test; //returning the value "test"
   }
   
   public static double computeSAT(double v, double m, double max, double overall){ //Creating a new method
      return((((2*v)+m)/24)+((max/overall)*100)); //Doing Calculation inside the method    
   }
   public static double computeACT(double r, double e, double ma, double s, double amax, double aoverall){ //Creating a new method
      return((((2*r)+e+ma+s)/1.8)+((amax/aoverall)*100)); //Doing Calculation inside the method
   }   
   public static void reportResults(double app1, double app2) { //Creating a new method
      if(app1>app2){ //if "app1" is greater than "app2" then do the following
         System.out.println(); //Printing a blank line so there it is more neat to look at
         System.out.println(); //Printing a blank line so there it is more neat to look at
         System.out.println("The first applicant seems to be better "); //Printing out Notes for user. 
      }
      else if(app1 < app2){ //if "app1" is less than "app2" then do the following
         System.out.println(); //Printing a blank line so there it is more neat to look at
         System.out.println(); //Printing a blank line so there it is more neat to look at
         System.out.println("The second applicant seems to be better"); //Printing out Notes for user. 
      }
      else{ //if none of the statments are true than do the following
         System.out.println(); //Printing a blank line so there it is more neat to look at
         System.out.println(); //Printing a blank line so there it is more neat to look at
         System.out.println("The two applicants seem to be equal"); //Printing out Notes for user. 
      }
   }  

}
   
   

   
 
     
