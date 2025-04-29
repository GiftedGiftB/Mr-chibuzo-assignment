import java.util.Scanner;
public class PositiveAndNegativeCount{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);


	int counter = 0;
	int positiveNumber = 0;
	int negativeNumber = 0;
	int userNumber = 0;
	double total = 0;
	double average = 0;
	int sum = 0;


	System.out.print("Enter a number: ");
	userNumber = scan.nextInt();

	while (userNumber != 0){
	
	sum += userNumber;
		

	if(userNumber >= 0)
	positiveNumber++;

	if(negativeNumber <= 0){
	negativeNumber++;

	}
	System.out.print("Enter a number: ");
	userNumber = scan.nextInt();	
	

	counter++;
	average = sum / counter;
	}


	

	System.out.println("The positive numbers is: "+ positiveNumber);

	System.out.println("The negative numbers is: " + negativeNumber);

	System.out.println("Total number is: " + sum);

	System.out.println("average number is: " + average);


 }

}