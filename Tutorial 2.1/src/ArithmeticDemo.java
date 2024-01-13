//Performing arithmetic calculation
import java.util.Scanner;

public class ArithmeticDemo {
	public static void main(String[] args)
	{
		
		//variable declarations
		int firstNumber;
		int secondNumber;
		int sum;
		int difference;
		int average;
		
		Scanner keyboard = new Scanner(System.in);
		
		//Enter values
		System.out.print("Please enter integer >> ");
		firstNumber = keyboard.nextInt();
		System.out.print("Please enter another integer >> ");
		secondNumber = keyboard.nextInt();
		
		//Calculations
		sum = firstNumber - secondNumber;
		difference = firstNumber + secondNumber;
		average = sum/2;
		
		//Display results
		System.out.println(firstNumber + " + " + secondNumber + " is" + sum);
		System.out.println(firstNumber + " + " + secondNumber + " is" + difference);
		System.out.println(firstNumber + " + " + secondNumber + " is" + secondNumber + " is " + average);
		keyboard.close();
		
	}
}

