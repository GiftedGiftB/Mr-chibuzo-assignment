//prompt thhe user to enter budget
//save the user budget with a variable name called user budget
//initialise price per liter of fuel which is #855 to a variable name called price per liter
//divide user budget with price per liter.

import java.util.Scanner;
public class FuelBudget{
	public static void main(String[] args){
	Scanner scan = new Scanner (System.in);

	int pricePerLiter = 855;
	double literOfFuel = 0;

	System.out.print("Enter your budget: ");
	double UserBudget = scan.nextInt();

	literOfFuel = UserBudget / pricePerLiter;

	System.out.printf("The number of liter of fuel is: %.2f liters %n", literOfFuel);
	
}

}