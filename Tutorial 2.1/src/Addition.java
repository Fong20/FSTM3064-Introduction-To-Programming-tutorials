//Addition program that inputs two numbers than displays their sum.
import java.util.Scanner; // program that uses class Scanner

public class Addition { 

//main method begins execution of Java application
	public static void main(String[] args)
	{
		//create a Scanner to obtain input from the command window
		Scanner keyboard = new Scanner(System.in);
	
		int number1; //first number to add
		int number2; //second number to add
		int sum; // sum of number1 and number2
		
		System.out.print("Enter first integer:"); //prompt 
		number1 = keyboard.nextInt();//read first number from user
		
		System.out.println("Enter second integer:"); //prompt
		number2 = keyboard.nextInt();// read second number from user
		
		sum = number1 + number2; // add numbers, then store total in sum
		System.out.print("Sum is " + sum);
		keyboard.close();

	} //end method main
} //end class addition


