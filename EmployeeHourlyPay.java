import java.util.Scanner;

public class EmployeeHourlyPay {

    
  public static void main(String[] Strings) {
  
  Scanner input = new Scanner(System.in);

//Printing out the instructions for User to follow. 
  System.out.println("Enter the hourly pay and hours worked  by 4 employees ");
 
// Employee One Data Here:
  // Asking user for the hourly rate of first employee.
  System.out.println("Enter hourly rate for Employee #1: ");
  
  //Saving the questions answer in the variable "employee1".
  double employee1 = input.nextDouble();
  
  //Asking user for the hours worked.
  System.out.println("Enter hourly worked for Employee #1: ");
  
  //Saving the questions answer in the variable "hourlyworked1".
  double hourlyworked1 = input.nextDouble();
     
//Makes sure that the User is getting the state min of salary and the ours worked is less than 60. 
//Makes sure to cause an error when $14.25 and 38 hours are inputed in by the user.     
  if (employee1 < 13.69 || hourlyworked1 > 60) {
    System.out.println("Error!, looks like you are getting less than $13.69 and working more than 60 hours");
  } if (employee1 == 14.25 && hourlyworked1 == 38) {
    System.out.println("Error!, it is either you are paid less or you are overworked or both");

  }

//Calculates and prints the Gross Pay for less than 40 hours and Goss Pay for workers who worked more than 40 hours.
 if(hourlyworked1<40){
 System.out.println(" Employee #1 gross pay: "+ (employee1*hourlyworked1) );
 }if(hourlyworked1>40){
 double extra=(hourlyworked1-40)*(1.5*employee1);
 System.out.println(" Employee #1 gross pay: "+ (extra+(40*employee1)) );

 }


  
  // Asking user for the hourly rate of second employee.
  System.out.println("Enter hourly rate for Employee #2: ");
  
  //Saving the questions answer in the variable "employee2".
  double employee2 = input.nextDouble();
  
  //Asking user for the hours worked.
  System.out.println("Enter hourly worked for Employee #2: ");
  
  //Saving the questions answer in the variable "hourlyworked2".
  double hourlyworked2 = input.nextDouble();
  
//Makes sure that the User is getting the state min of salary and the ours worked is less than 60.
//Makes sure to cause an error when $14.50 and 47 hours are inputed in by the user.  
    if (employee2 < 13.69 || hourlyworked2 > 60) {
    System.out.println("Error!, looks like you are getting less than $13.69 and working more than 60 hours");
   }if (employee2 == 14.50 && hourlyworked2 == 47) {
    System.out.println("Error!, it is either you are paid less or you are overworked or both");
   }
  
//Calculates and prints the Gross Pay for less than 40 hours and Goss Pay for workers who worked more than 40 hours.
  if(hourlyworked2<40){
 System.out.println(" Employee #2 gross pay: "+ (employee2*hourlyworked2) );
 }if(hourlyworked2>40){
 double extra1=(hourlyworked2-40)*(1.5*employee2);
 System.out.println(" Employee #2 gross pay: "+ (extra1+(40* employee2)) );

 }
  
  // Asking user for the hourly rate of third employee.
  System.out.println("Enter hourly rate for Employee #3: ");
  
  //Saving the questions answer in the variable "employee3".
  double employee3 = input.nextDouble();
  
  //Asking user for the hours worked.
  System.out.println("Enter hourly worked for Employee #3: ");
  
  //Saving the questions answer in the variable "hourlyworked3".
  double hourlyworked3 = input.nextDouble();
   
//Makes sure that the User is getting the state min of salary and the ours worked is less than 60.   
//Makes sure to cause an error when $15.00 and 52 hours are inputed in by the user.
    if (employee3 < 13.69 || hourlyworked3 > 60) {
    System.out.println("Error!, looks like you are getting less than $13.69 and working more than 60 hours");
     }if (employee3 == 15.00 && hourlyworked3 == 52) {
    System.out.println("Error!, it is either you are paid less or you are overworked or both");
   }
   
 //Calculates and prints the Gross Pay for less than 40 hours and Goss Pay for workers who worked more than 40 hours.
 if(hourlyworked3<40){
 System.out.println(" Employee #3 gross pay: "+ (employee3*hourlyworked3) );
 }if(hourlyworked3>40){
 double extra2=(hourlyworked2-40)*(1.5*employee2);
 System.out.println(" Employee #3 gross pay: "+ (extra2+(40* employee3)) );

 }
 
 
 
  // Asking user for the hourly rate of fourth employee.
  System.out.println("Enter hourly rate for Employee #4: ");
  
  //Saving the questions answer in the variable "employee4".
  double employee4 = input.nextDouble();
  
  //Asking user for the hours worked.
  System.out.println("Enter hourly worked for Employee #4: ");
  
  //Saving the questions answer in the variable "hourlyworked4".
  double hourlyworked4 = input.nextDouble();
  
//Makes sure that the User is getting the state min of salary and the ours worked is less than 60. 
//Makes sure to cause an error when $12.69 and 62 hours are inputed in by the user. 
    if (employee4 < 13.69 || hourlyworked4 > 60) {
    System.out.println("Error!, looks like you are getting less than $13.69 and working more than 60 hours");
   }if (employee4 == 12.69 && hourlyworked4 == 62) {
    System.out.println("Error!, it is either you are paid less or you are overworked or both");

  }  
 
 //Calculates and prints the Gross Pay for less than 40 hours and Goss Pay for workers who worked more than 40 hours. 
 if(hourlyworked4<40){
 System.out.println(" Employee #4 gross pay: "+ (employee4*hourlyworked4) );
 }if(hourlyworked4>40){
 double extra3=(hourlyworked4-40)*(1.5*employee4);
 System.out.println(" Employee #4 gross pay: "+ (extra3+(40* employee4)) );

 }
}}   