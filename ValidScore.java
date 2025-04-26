import java.util.Scanner;
public class ValidScore{
	public static void main(String[] args){
	  Scanner scan = new Scanner(System.in); 
	
	int validCounter = 0;
	int invalidCounter = 0;
	int grade1 = 0;
	int grade2 = 0;
	int grade3 = 0;
	int grade4 = 0;
	int grade5 = 0;
	
	while(validCounter < 10){
	System.out.print("Enter a number between 0 - 100: ");
	int userNumber = scan.nextInt();

	if(userNumber < 0 || userNumber > 100){
	System.out.println("Invalid number");
	invalidCounter++;
	continue;
	}
        validCounter++;
	  switch(userNumber / 10){
		case 10:
		case 9:
		case 8:
			System.out.println("A");
		grade1++;
		break;

		case 7:
			 System.out.println("B");
		grade2++;
		break;

		case 6:
			 System.out.println("C");
		grade3++;
		break;

		case 5:
			System.out.println("D");
		grade4++;
		break;
		
		case 4:
		case 3:
		case 2:
		case 1:
		case 0:
			
		default:
			System.out.println("F");
			grade5++;
			break;
	}

 	}
	
		System.out.println("Number of student grades:  " +grade1);
		System.out.println("Number of student grades:  " +grade2);
		System.out.println("Number of student grades:  " +grade3);
		System.out.println("Number of student grades:  " +grade4);
		System.out.println("Number of student grades:  " +grade5);

		System.out.printf("Invalid number is %d%n:",invalidCounter);

}
}



