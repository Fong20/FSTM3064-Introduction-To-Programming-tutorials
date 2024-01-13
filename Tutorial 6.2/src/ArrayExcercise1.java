import java.util.Scanner;
public class ArrayExcercise1 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		//Array size is 15
		int[] numArray = new int[15];
		
		//Prompt user to enter value for array index 8
		System.out.print("Enter value for index 8 = ");
		numArray[8] = keyboard.nextInt();
		
		//Array index 4 is 35
		numArray[4] = 35;
		
		//Array index 9 is equal to array index 4 plus array index 8
		numArray[9] = numArray[4] + numArray[8];
		System.out.println("Result of index addition is " + numArray[9]);
	}

}
