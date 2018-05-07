//Hello this is Michael Knezevic and this is my own work
import java.util.Scanner;
public class GuessingGameProgram {
  public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	  
	  //generate a random integer between 1-10000
	  int number1 = (int)(Math.random() * (10000 - 1));
	  
	  //Ask user for a number
	  System.out.println("Welcome to the number guessing game.");
	  int number2 = 0;
	  int upper = 10000;
	  int lower = 1;
	  //compare numbers
	  for(int i = 0; number2 != number1; i++) {
		  System.out.println("Enter a guess between " + lower + " and " + upper);
	  number2 = input.nextInt();
	  if (number2 > lower && number2 < number1)
		  lower = number2 + 1;
	  if (number2 < upper && number2 > number1)
		  upper = number2 - 1;
	  if (number1 < number2)
		  System.out.println("LOWER");
      else if (number1 > number2)
		  System.out.println("HIGHER");
	  else
		  System.out.println("You are correct! It took you " + i + " guesses");
	  }
  }
}
