import java.util.Scanner;
public class IdentifyPrimeNumber{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int counter = 1;
	int primeCheck = 0;
	int numbersOfZero = 0;
	int total = 0;
	
	System.out.print("Enter a number: ");
	int userNumber = scan.nextInt();

	while(counter <= userNumber){

	primeCheck = userNumber % counter;
	
	if (primeCheck == 0){
	numbersOfZero = +1;

	total += numbersOfZero;
	}
	counter++;
	
	}
	if (total == 2){
	System.out.println("its a prime number ");
	}
	else{
	System.out.println("its not a prime number ");
	}

 }
}