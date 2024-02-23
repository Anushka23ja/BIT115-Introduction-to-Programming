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
         System.out.printf("First applicant overall score 1: %.2f", scorea); // Printing the First applicant ACT value   
      }
      System.out.println(); // Printing a blank line 
      System.out.println(); // Printing a blank line 
      System.out.println("Information for the second applicant: "); //Asking the user for a second applicant values 
      System.out.println("Do you have 1) SAT scores or 2) ACT scores? "); 
      double test2 = in.nextInt(); //Saving the Users input in the variable "test2" 
      if( test2 == 1){ // if the user inputs in "1" the the program will run the following: 
         System.out.println("SAT math: ");//Asking the user the "SAT Math"
         double math1 = in.nextDouble();//Saving the user input into one variable
         System.out.println("SAT verbal: ");//Asking the user the "SAT verbal"
         double verbal1 = in.nextDouble();//Saving the user input into one variable
         System.out.println("Overall GPA: ");//Asking the user the "Overall GPA"
         double overall1 = in.nextDouble();//Saving the user input into one variable
         System.out.println("Max GPA: ");//Asking the user the "Max GPA"
         double max1 = in.nextDouble();//Saving the user input into one variable
            
         double scorea1 = computeSAT2(verbal1, math1, overall1, max1); // Calculating the equation
         System.out.println("Second applicant overall score 1: "); // printing out a statement 
         System.out.printf("%.2f", scorea1); // Printing out a variable
      }
      else if( test2 == 2){ // if the user inputs in "2" the the program will run the following:
         System.out.println("ACT English: ");//Asking the user the "SAT Math"
         double english2 = in.nextDouble();//Saving the user input into one variable
         System.out.println("ACT math:  ");//Asking the user the "SAT Math"
         double amath2 = in.nextDouble();//Saving the user input into one variable
         System.out.println("ACT reading: ");//Asking the user the "SAT Math"
         double reading2 = in.nextDouble();//Saving the user input into one variable
         System.out.println("ACT science: ");//Asking the user the "SAT Math"
         double science2 = in.nextDouble();//Saving the user input into one variable
         System.out.println("Overall GPA: ");//Asking the user the "SAT Math"
         double aoverall2 = in.nextDouble() ;//Saving the user input into one variable
         System.out.println("Max GPA: ");//Asking the user the ""Max GPA"
         double  amax2 =  in.nextDouble();  //Saving the user input into one variable    
         double scorea3 = computeACT(reading2, english2, amath2 ,science2, aoverall2, amax2 );// Calculating the equation
         System.out.println("Second applicant overall score 1: ");// printing out a statement 
         System.out.printf("%.2f", scorea3);// Printing out a variable     
      }
   } 
   public static double computeSAT(double v, double m, double max, double overall){ //Creating a new method
      return((((2*v)+m)/24)+((max/overall)*100)); //Doing Calculation inside the method    
   }
   public static double computeSAT2(double verbal1, double math1, double max1, double overall1){//Creating a new method
      return((((2*verbal1)+math1)/24)+((max1/overall1)*100)); //Doing Calculation inside the method    
   }
   public static double computeACT(double r, double e, double ma, double s, double amax, double aoverall){ //Creating a new method
      return((((2*r)+e+ma+s)/1.8)+((amax/aoverall)*100)); //Doing Calculation inside the method
   }   
   public static double computeACT2(double reading2, double english2, double amath2, double science2, double amax2, double aoverall2){ //Creating a new method
      return((((2*reading2)+english2+amath2+science2)/1.8)+((amax2/aoverall2)*100)); //Doing Calculation inside the method
   } 

}
   
   

   
 
     
