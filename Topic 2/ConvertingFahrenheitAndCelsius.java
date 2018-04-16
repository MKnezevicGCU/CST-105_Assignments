//This is Michael Knezevic and this is my own work.
import java.util.Scanner;
public class ConvertingFahrenheitAndCelsius {
  public static void main(String[] args) {
	  
	//Create scanner object  
	Scanner input = new Scanner(System.in);
	
	//Ask user for Fahrenheit and Celsius
	System.out.print("Enter a degree in Fahrenheit: ");
	double fahrenheit = input.nextDouble();
	System.out.print("Enter a degree in Celsius: ");
	double celsius = input.nextDouble();
	
	//Covert Fahrenheit to Celsius and Celsius to Fahrenheit
	double celsius1 = (5.0/9) * (fahrenheit - 32);
	double fahrenheit1 = (9.0/5) * (celsius + 32);
	
	//Display the answers
	System.out.println("Fahrenheit " + fahrenheit + " is " + celsius1 + " in Celsius");
	System.out.println("Celsius " + celsius + " is " + fahrenheit1 + " in Fahrenheit");
  }
}
