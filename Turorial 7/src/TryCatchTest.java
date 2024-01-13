import java.util.Scanner;
public class TryCatchTest {
	public static void main(String [] args) {
		
		try {
		int number1, number2, value;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter a value:");
		number1 = keyboard.nextInt();
		
		System.out.println("Please enter a value:");
		number2 = keyboard.nextInt();
		
		value = number1/number2;
		System.out.println("Value: " + value);
		}
		
		catch (ArithmeticException e) {
			System.out.println("Cannot divide a number by 0");
			
		}
		

}
}