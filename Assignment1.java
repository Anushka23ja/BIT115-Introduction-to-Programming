//Practice code from Canvas 
//Anushka Chougule
import java.util.Scanner;
public class Assignment1{
    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
      
      String city1, city2;
      int distance;
      double costPerMile;
      int dollarAmount;
      
      System.out.print("Enter the starting city: ");
      city1=in.next();
      
      System.out.print("Enter the ending city: ");
      city2=in.next();

      System.out.print("Enter distance in miles between cities: ");
      distance=in.nextInt();

      System.out.print("Enter the cost of travel per mile: ");
      costPerMile=in.nextDouble();

      dollarAmount=(int)(distance*costPerMile);
      System.out.println("\n\nThe cost of traveling from " + city1 + " to " + city2 + " is $" + dollarAmount);
  }
}
