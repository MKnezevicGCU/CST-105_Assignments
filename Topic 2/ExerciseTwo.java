//This is Michael Knezevic and this is my own work.
import java.util.Scanner;
public class ExerciseTwo {
  public static void main(String[] args) {
	//Create a Scanner
	Scanner input = new Scanner(System.in);
	//Prompt user to enter a 5-digit positive integer
	System.out.println("Enter 5 positive numbers ranging from 0-10: ");
	int number1 = input.nextInt();
	int number2 = input.nextInt();
	int number3 = input.nextInt();
	int number4 = input.nextInt();
	int number5 = input.nextInt();
	
	//Calculate the problem
	int sum = (number1 + number2 + number3 + number4 + number5);
	
	//Display the answer
	System.out.println("The sum of the 5 numbers is: " + sum);
  }
}
