import java.util.Scanner;

public class Numbers {
	public static void main(String[] args) {
		
	//Declare variable
	int value;
	
	
	Scanner keyboard = new Scanner(System.in);

	//Prompt user to enter value
	System.out.print("Please enter value: ");
	value = keyboard.nextInt();
	
	if (value%2 == 0) {
	System.out.print("The value is even");
	
	}
	
	else {
	System.out.print("The value is odd number");
	}
	
	keyboard.close();
}
}