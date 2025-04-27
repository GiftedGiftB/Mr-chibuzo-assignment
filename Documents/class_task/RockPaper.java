import java.util.Random;
import java.util.Scanner;
public class RockPaper{
	public static void main(String[] args){
	Random rand = new Random();
	Scanner scan = new Scanner(System.in);

	int randomChoice = rand.nextInt(3);
	System.out.println("The random choice is: "+ randomChoice);

	int winCounter = 2;
	while(winCounter <= 2){
	System.out.print("Enter a number ( 0 )scissor, ( 1 )rock, ( 2 )paper: ");
	int userGuess = scan.nextInt();
	
	if(randomChoice == 0 && userGuess == 1){
	System.out.println("you win");
	}				
	else if(randomChoice == 0 && userGuess == 2){
	System.out.println("you lose");
	}
	else if(randomChoice == 0 && userGuess == 0){
	System.out.println("draw");
	}
	else if(randomChoice == 1 && userGuess == 0){
	System.out.println("you lose");
	}
	else if(randomChoice == 1 && userGuess == 2){
	System.out.println("you win");
	}
	else if(randomChoice == 1 && userGuess == 1){
	System.out.println("draw");
	}
	else if(randomChoice == 2 && userGuess == 0){
	System.out.println("you win");
	}
	else if(randomChoice == 2 && userGuess == 1){
	System.out.println("you lose");
	}
	else if(randomChoice == 2 && userGuess == 2){
	System.out.println("draw");
	}
	}
  }

}