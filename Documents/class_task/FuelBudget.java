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