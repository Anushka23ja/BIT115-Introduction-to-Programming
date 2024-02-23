// worked on by: Jolie Davison, Carson Findley, Anushka Chougule
import java.util.*;


/**
 * Starter code for the "Guess My Number" exercise.
 */
public class GuessStarter {

    public static void main(String[] args) {
    
        Scanner cin= new Scanner(System.in);
        int guessNum;   
         
        // pick a random number
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        System.out.println("I'm thinking of a whole number between 1 and 100 (including both). Can you guess what it is?");
        
        guessNum= cin.nextInt();
        System.out.println("Your guess is: "+ guessNum);
        System.out.println("The number I was thinking of is: "+ number);
        int difference = (Math.abs(guessNum - number));
        
        System.out.print("You were off by: "+ difference);
       
    }

}
