//Anushka Chougule
import java.util.Scanner; //importing scanner
public class Assignmentfour {
   static boolean condition = false;// setting variable to false
   static int falsecount = 0; //defining variable
   public static void main(String[] args){
      do{ // runs the folloing code which asks the user a question on what they would like to have as their password
         Scanner in = new Scanner(System.in); // scanner is set/imported
         System.out.println("Password: ");//asking the question to user 
         String passcode = in.next();//the users input is saved in the variable "passcode"
         ValidPassword(passcode) ; //print out the methods "ValidPassword" with the input of passcode
      }
      while ( falsecount > 0  );// until all the false statements are zero keep repeating this in a loop
   }  
   public static boolean ValidPassword(String passcode){ //the string "passcode" is passed dow to the new static methods 
      longlength (passcode); // make sure there are eight digits 
      StartswithNum (passcode); //make sure it does NOT start with a number
      MinTwonum( passcode); //make sure it does have at least 2 numbers 
      MinTwoUpperCase(passcode); //make sure it has at least 2 uppercase letters
      MinOneLowerCase(passcode); //make sure it has at least 2 lowercase letters 
      return true; //if any of these does not satisfy our critaria then it will return true
   }
   
   public static boolean longlength(String passcode){ //new static methods which takes the string "passcode" from the begaining 
      if(passcode.length() >= 8){ //if the length of the passcode is greater or equal to 8 then do the following
         condition=true; // set "condition" equal to true
         return true; // return true
      }
      else{ // if it does not have the following then:
         System.out.println("Invalid password, Password Length < 8 ,try again "); // print out the following statement
         condition=false; // set "condition" to false
         falsecount++; //add the following to the falsecount 
         return false; //return false
      }}
   public static boolean StartswithNum(String passcode){ // creating a new static boolean
      char[] chars = passcode.toCharArray(); // cretaing a Array
      int len = passcode.length(); // setting the length of passcode to "len"
      for(int i=0 ; i < len ; i ++){ //creating a loop to see if there is any numbers in the begaining
         if(Character.isDigit(passcode.charAt(i))){ //if there is a digit then print out the following 
            System.out.println("Invalid password,Password starts with number,try again "); //prints out the reason why their code in invaid
            condition=false; //sets "condition" to false
            falsecount++; //increments the falsecount 
            break; // breaks the code right away
         }
         else{ // if the statement does not start with a number then:
            condition=true; // set "condition" to true
            return false; // return false 
         }}
      return true; // and return true
   }
   public static boolean MinTwonum(String passcode){ //created a new static method
      int count=0; //creating a new variable "count" and setting it to 0
      int len = passcode.length(); //setting variable "len" to the length of passcode
      for(int i=0 ; i < len ; i ++){ //creating a loop until len is greater than i
         if(Character.isDigit(passcode.charAt(i))){ // if this statement is true then do the following
            count ++; //increment in variable "count"
            if(count >= 2){ //if count is greater or equal to 2 then do the following 
               condition=true; //set condition equal to true  
               break; // quickly break the program
            }}
         else{ //else do the following 
            if(i >= (len-1) ){ // if i is greater than len minus 1 then do the following
               System.out.println("Invalid password,Paassword does not contain minimum 2 digits,  try again ");//prints out the reason why their code in invaid
               condition=false; //set "condition" to false
               falsecount++; //increment falsecount          
               return false; //return false back
            }}}
      return true;  //or else if none of them are true than return true
   }
   public static boolean MinTwoUpperCase(String passcode){ //creating a new static method
      int count=0; //set the variable "count" to 0
      int len = passcode.length(); //set the variable "len" to the length of password    
      for(int i=0 ; i < len ; i ++){ //create a loop until i is less than len
         if(Character.isUpperCase(passcode.charAt(i))){ // if this statement is true then do the following
            count ++; //increment in variable "count"
            if(count >= 2){ //if count is greater than or equal to 2 then do the following  
               condition=true; //set variable "condition" equal to true
               break; //break the code right away
            }}
         else{ //or else do the following
            if(i >= (len-1) ){ // if i is greater than len minus 1 then do the following
               System.out.println("Invalid password,Password does not contain minimum 2 uppercase characters, try again ");//prints out the reason why their code in invaid
               condition=false; //set variable "condition" equal to false
               falsecount++; //increment falsecount 
               return false; //return false 
            }}}
      return true; //if none of them are true than do the following and return true
   }
   public static boolean MinOneLowerCase(String passcode){ //creating a new static method
      int count=0; //set variable "count" equal to 0
      int len = passcode.length();   //set variable "len" to passcode length
      for(int i=0 ; i < len ; i ++){ //creates a loop until i is less than len 
         if(Character.isLowerCase(passcode.charAt(i))){ // if this statement is true then do the following
            count ++; //increment count 
            if(count >= 1){ //if count is greater than or equal to 1 then
               condition=true; // set "condition" to true
               break; //break this program  
            }}
         else{
            if(i >= (len-1) ){ // if i is greater than len minus 1 then do the following
               System.out.println("Invalid password,Password does not contain minimum 1 Lowercase character, try again ");//prints out the reason why their code in invaid
               condition=false; //set variable "condition" equal to false
               falsecount++; //increment falsecount    
               return false; //return false
            }}}
      return true; //if none of them are true than do the following and return true
   }}
       
