import java.util.*;
public class ArithmeticExceptionDemo {
	public static void main(String[] args) {
		
		/*Exception handling to solve runtime error by using try catch 
		 * Situation: value divided by 0
		 */
		try {
			int a = 30,b = 0;
			int c = a/b;
			System.out.println("Result = " + c);
			
		}
		
		catch (ArithmeticException e) {
			System.out.println("Cannot divide a number by 0");
		}
	}

}
