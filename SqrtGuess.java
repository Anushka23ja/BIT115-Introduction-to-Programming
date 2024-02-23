import java.util.Scanner;

public class SqrtGuess {
	public static void main(String[] args)
	{
      // adding scanner to the program 
		Scanner in = new Scanner(System.in);
      // printing a comment to enter a number to square root
		System.out.print("Enter a positive value and I will approximate its square root  ");
      // save the value entered as an integer 
		int value = in.nextInt();
      // creates a loop if the value is greater than 0 
		while(value>0)							
		{		
      // the loop first prints out the square root of the value								
			System.out.printf("%d has a square root of %.2f which I estimated as %.2f\n", value, Math.sqrt(value), mySquareRoot(value));
		// this line prints out a commment to input another value	
         System.out.print("Enter a positive value and I will approximate its square root  ");
      // the entered value by the user is saved in the variable "value" as an integer   
			value = in.nextInt();
		}
	}
	
	
	// new public static is created of which only "int x" is forwarded from 
   // the first main public static. 
	public static double mySquareRoot(int x)
	{
   // defining variables 
		double myNewGuess = 1.0, myLastGuess = 0;
   // creates a loop if the value of "myNewGuess-myLastGuess" is greater than 0.01
		while(Math.abs(myNewGuess-myLastGuess)>0.01){
      // sets the value of "myLastGuess" and "myNewGuess" the same
			myLastGuess = myNewGuess;		
      // sets the value of "myNewGuess" as "(myLastGuess + x / myLastGuess) / 2;	"	
			myNewGuess = (myLastGuess + x / myLastGuess) / 2;	
		}
      // returns the value of myNewGuess
		return myNewGuess;
	}
}