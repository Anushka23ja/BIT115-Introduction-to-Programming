import java.util.*;
public class Assignmentfour{
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in); //Creating a Scanner 
      int finishcodewhen = 0; //setting variable to "finishcodewhen" to 0
      do{ //do the following in a loop until the password is valid
         System.out.println("Password: "); //Printing a comment for the user to input 
         String passcode = input.nextLine(); // Saves the Users input into a variable 
      
         if (ValidPassword(passcode)) {  // if the condition is true then do the following
            System.out.println("The Password entered is valid"); //print out the following code
            finishcodewhen++; //increment the variable by 1
         }
         else { //or else do the following
            System.out.println("Invalid Password, try again"); //print out the following statement 
         }
      }
      while(finishcodewhen==0);  // the following until the variable is equal to 0
   }
   
   public static boolean ValidPassword(String passcode){ // Create a new method called "ValidPassword"
      if( (longlength(passcode)) && (StartingChar(passcode)) && (MinTwonum(passcode)) &&  (MinTwoUpperCase(passcode)) && (MinOneLowerCase(passcode)) ){ //if this statement is true do the following
         return true; //make sure to return the variable passcode true
      }else{ //else do the following instead
         return false; //make sure to return the variable passcode false
      }
   }
   
   public static boolean  longlength(String passcode){ // Create a new method called "longlength"
      if (passcode.length()>=8){ //If the length of passcode is more or equal to 8 then do the following
         return true; //make sure to return the variable passcode true
      }else //else do the following instead
         return false; //make sure to return the variable passcode false
   }
   
   public static boolean MinTwonum( String passcode) {  // Create a new method called "MinTwonum"
      int MinNum = 0; //set the variable to 0
      for (int i=0; i < passcode.length(); i++) { //create a loop
         char Min = passcode.charAt(i); //Setting the variable equal to "passcode.charAt(i)"
         if (Character.isDigit(Min)){ //if the variable "MinNum" is true if you instert Min then do the following
            MinNum++; //increment "MinNum" by one each time around
         }
      }
      if (MinNum>=2){ // If "MinNum" is greater or equal to 2 then do the following          
         return true; //make sure to return the variable passcode true
      }else  //else do the following instead
         return false; //make sure to return the variable passcode false
   }

   public static boolean MinOneLowerCase(String passcode) { // Create a new method called "MinOneLowerCase"
      int LowerCase = 0; // Set the variable equal to 0
      for (int i=0; i < passcode.length(); i++) { //create a loop
         char Lower = passcode.charAt(i); //set the variable equal to "passcode.charAt(i)"
         if (Character.isLowerCase(Lower)){ //if the statement is true then do the following
            LowerCase++; //increment the value of "LowerCase" by one each time around
         }
      } 
      if (LowerCase >=1){ // if the value of "LowerCase" is greater or equal to one then do the following 
         return true; //make sure to return the variable passcode true
      }else  //else do the following instead
         return false; //make sure to return the variable passcode false
   }
   
   public static boolean MinTwoUpperCase(String passcode) { // Create a new method called "MinTwoUpperCase"
      int UpperCase = 0; //set the variable "UpperCase" equal to 0
      for (int i=0; i < passcode.length(); i++) { //Create a loop
         char Upper = passcode.charAt(i); // set the variable "Upper" equal to "passcode.charAt(i)"
         if (Character.isUpperCase(Upper)){ // if this statement is true then do the following
            UpperCase++; // Increment the vaule of "UpperCase" each time around
         }
      }
      if (UpperCase >= 2){ //if the value of "UpperCase" is greater or equal to 2 then do the following 
         return true; //make sure to return the variable passcode true  
      }else  //else do the following instead
         return false; //make sure to return the variable passcode false
   }
   
   public static boolean StartingChar(String passcode) { // Create a new method called "StartingChar"
      char StartingDig = passcode.charAt(0); // Create a new variable "StartingDig" equal to "passcode.charAt(0)"
      if (Character.isDigit(StartingDig)){ //if this statement is true then do the following
         return false; //make sure to return the variable passcode false
      }else //else do the following instead
         return true; //make sure to return the variable passcode true   
   }
}