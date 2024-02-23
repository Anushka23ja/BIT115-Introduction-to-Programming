// Anushka Chougule, Joseph Renalds, Carson Findley
public class TestFutureInvestment {
	public static void main(String[] args) {
   // Defining Scanner 
		java.util.Scanner input = new java.util.Scanner(System.in);

		// Asking the user for their investment amount, along with an example. 
		System.out.print("Enter investment amount, for example 100: ");
      // Saving the input in a variable titled "investmentAmount"
		double investmentAmount =  input.nextDouble();
      
      // Asking the user for their yearly intrest rate along with an example.
		System.out.print("Enter yearly interest rate, for example 5.25: ");
      // Storing the input in the variable "annualInterestRate". 
		double annualInterestRate = input.nextDouble();

      // Printing out one line with two sections with the header of "years" and "future value".
		System.out.printf("%5s%20s\n", "Years", "Future Value");

      // Printing out 30 years of investmentAmount and annualInterestRate.
		for (int i = 1; i <= 30; i++) {
      // Calculation for the futureInvestmentValue before printing it out. 
			futureInvestmentValue(investmentAmount, annualInterestRate / 1200, i);
		}
	}
   
   // Creating a new public static void
	public static void futureInvestmentValue(double investmentAmount,
   // defines Variables "monthlyInterestRate" and "futureValue"
	double monthlyInterestRate, int numOfYears) {
	double futureValue = investmentAmount * Math.pow(1 + monthlyInterestRate, numOfYears * 12);
   
   //Printing out output of "numOfYears" and "futureValue" with space in between. 
	System.out.printf("%5d%20.2f\n", numOfYears, futureValue);
  }
}
