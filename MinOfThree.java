import java.util.Scanner;

public class MinOfThree {
   public static void main(String[] args) {
      Scanner kb = new Scanner (System.in);
        //int num1, num2, num3, num4, ;
      int num1, num2, num3, num4, min=0 ;
      System.out.println ("Please enter four numbers.");
      System.out.print ("First value: ");
      num1=kb.nextInt();
      System.out.print ("Second value: ");
      num2=kb.nextInt();
      System.out.print ("Third value: ");
      num3=kb.nextInt();
      System.out.print ("Fourth value: ");
      num4=kb.nextInt();
          
      if (num1 < num2) {
         if (num1 < num3) {
            min = num1;
         }
         else {
            min = num3;
         }
      }
      else if (num2 < num3) { 
         {
            min = num2;
         }
      }
       if (num3 < num1) {
         if (num3 < num2) {
            min = num3;
         }
         else {
            min = num4;
         }
      if(num4 < min){
         min = num4;
      }
     }
      
      
      System.out.println ("Minimum value is: " + min);
      
   }
}