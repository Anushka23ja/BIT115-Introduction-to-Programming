// Carson Findley, Anushka Chougule, Joseph Renalds
import java.util.*;
public class salesamount1{
   public static void main(String[] args) {
      Scanner input= new Scanner(System.in); 
   
      double sale; 
   
      System.out.println("Enter the Sale Amount: ");
      sale = input.nextDouble();
      
      calcCommission(sale);
   }
   public static void calcCommission(double salesamount){
      double commission = 0;
      double total = 0;
   
      if ((salesamount >= 0.01) && (salesamount <= 5000))
         total = (salesamount *0.08);
        
      if ((salesamount >= 5000.01) && (salesamount <= 10000))
          total = (400+ ((salesamount - 5000) * 0.10));
          
      if ((salesamount >= 10000.01))
         total = (900+ ((salesamount - 10000) * 0.12));
        
         
    
      System.out.println("Commission: " + total);
   }   
}