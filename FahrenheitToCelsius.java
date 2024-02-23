//worked on by Jolie Davison, Carson Findley, Anushka Chougule
import java.util.Scanner;
public class FahrenheitToCelsius {

    public static void main(String[] args) {
    Scanner cin= new Scanner(System.in);
    System.out.print("Enter a temperature in Fahrenheit: ");
    double F = cin.nextDouble();
    double C = (F-32.0)*(5.0/9.0);
    System.out.printf(F + " F = %.1f C", C );
        }
}