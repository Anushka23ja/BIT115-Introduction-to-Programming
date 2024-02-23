//Anushka Chougule worked with Joseph
import java.util.Scanner;
public class MovieTicket{
    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      
       String Name,County;
       double Age, Age1;
       double Price;
       
            System.out.print("Please enter your name: ");
            Name=in.next();


            System.out.println("Hi " +Name+" ! Welcome to Wild Waves Theme and Water Park!! ");
            
            System.out.println("Please Enter what County you are from: ");
            County=in.next();
            
            if ( County.equalsIgnoreCase("King")){
             System.out.print("Please Enter what you're age is: ");
             Age=in.nextDouble();

             
             if(Age>=65){
             Price= 15;
             System.out.print("You're total price at the Window is: $"+ Price);
             }else if (Age<5){
             System.out.print("You're ticket is free");
             }else if (Age>=5 && Age<14){
             Price= 24.60;
             System.out.print("You're total price at the Window is: $"+ Price);
             }else {
             Price= 30;
             System.out.print("You're total price at the Window is: $"+ Price);

             }
             }
             
             else{
             System.out.print("Please Enter what you're age is: ");
             Age1=in.nextDouble();
            
             if(Age1>=65){
             Price= 20;
             System.out.print("You're total price at the Window is: $"+ Price);
              }else if (Age1<5){
             System.out.print("You're ticket is free");
             }else if (Age1>=5 && Age1<14){
             Price= 32.80;
             System.out.print("You're total price at the Window is: $"+ Price);
             }else {
             Price= 40;
             System.out.print("You're total price at the Window is: $"+ Price);

             }
            

            
             }

      
      
      }}