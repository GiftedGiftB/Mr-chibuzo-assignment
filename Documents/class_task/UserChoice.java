import java.util.Scanner;
public class UserChoice{
	public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	
	String menu= """

	   what will you like to do?

	1. Add numbers
	2. Subtract numbers
	3. Multiply numbers
	4. divide numbers

""";
	while(true){
	int userNumber; int firstNumber = 0; int secondNumber = 0;
	int sum = 0; int subtraction = 0; int multiply = 0; int divide = 0;

	System.out.print(menu);
	
	System.out.print("Select an option: ");
	userNumber = scan.nextInt();
 
	switch(userNumber){
	case 1:{
	
	System.out.print("Enter first number: ");
	firstNumber = scan.nextInt();

	System.out.print("Enter second number: ");
	secondNumber = scan.nextInt();
	
	sum = firstNumber + secondNumber;
	
	System.out.println("The sum is: "+ sum);
	
	System.out.print("Press 1 back to menu: ");
	userNumber = scan.nextInt();
 
	}
	
	case 2:{
	
	System.out.print("Enter first number: ");
	firstNumber = scan.nextInt();

	System.out.print("Enter second number: ");
	secondNumber = scan.nextInt();
	
	subtraction = firstNumber - secondNumber;
	
	System.out.println("The answer is: "+ subtraction);
	
	System.out.print("Press 1 back to menu: ");
	userNumber = scan.nextInt();
 
	}
	case 3:{
	
	System.out.print("Enter first number: ");
	firstNumber = scan.nextInt();

	System.out.print("Enter second number: ");
	secondNumber = scan.nextInt();
	
	multiply = firstNumber * secondNumber;
	
	System.out.println("The answer is: "+ multiply);
	
	System.out.print("Press 1 back to menu: ");
	userNumber = scan.nextInt();
 
	}
	case 4:{
	
	System.out.print("Enter first number: ");
	firstNumber = scan.nextInt();

	System.out.print("Enter second number: ");
	secondNumber = scan.nextInt();
	
	divide = firstNumber / secondNumber;
	
	System.out.println("The answer is: "+ divide);
	
	System.out.print("Press 1 back to menu: ");
	userNumber = scan.nextInt();
 
	}
	}
}
}
}


