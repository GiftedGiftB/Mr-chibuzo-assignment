//prompt the user to enter pincipal amount
//prompt the user to enter the annual interest rate
//prompt the user to enter the duration in years 
//

import java.util.Scanner;
public class MortageCalculator{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	double monthlyPayment = 0;
	double monthly = 0;
	double calculation1 = 0;
	double calculation2 = 0;

	System.out.print("Enter amount to be borrowed : ");
	double amountBorrowed = input.nextDouble();

	System.out.print("Enter the annual interest rate : ");
	double interestRate = input.nextDouble();

	System.out.print("Duration of YEARS : ");
	double durationOfYears = input.nextDouble();

	interestRate = interestRate / 100/ 12;
	
	durationOfYears = durationOfYears * 12;

	calculation1 = amountBorrowed  * interestRate * Math.pow(1 + interestRate , durationOfYears);
	calculation2 = Math.pow(1 + interestRate , durationOfYears)- 1;

	monthlyPayment = calculation1 / calculation2;

	System.out.printf("Your monthly payment is: &%.2f", monthlyPayment);


}
}