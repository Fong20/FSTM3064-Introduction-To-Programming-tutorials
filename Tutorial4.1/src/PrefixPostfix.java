import java.util.Scanner;
public class PrefixPostfix {
	public static void main(String [] args) {
		
		/* General tip:
		 * If prefix increment/decrement is used, the increment/decrement operator is executed first, followed by other expression (calculation etc).
		 * If postfix increment/decrement is used, the expression will be evaluated first, followed by the increment'decrement operator.
		 */
		
		//prefix variable declaration
		int myNumber,answer, prefixCalculation, postfixCalculation;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter value:");
		myNumber = keyboard.nextInt();
		answer = ++myNumber;
		
		
		//prefix increment and calculation
		System.out.println("After prefix increment, the value of myNumber is " + myNumber + " and value of answer is " + answer);
			prefixCalculation = answer + 3;
			System.out.println("value of prefix calculation:" + prefixCalculation);
		
		//postfix variable declaration
		System.out.print("\nPlease enter value:");
		myNumber = keyboard.nextInt();
		answer = myNumber++;
		
		//postfix increment and calculation
		System.out.println("After postfix increment, the value of myNumber is " + myNumber + " and value of answer is " + answer);
			postfixCalculation = answer + 3;
			System.out.println("value of postfix calculation:" + postfixCalculation);
	}

}
