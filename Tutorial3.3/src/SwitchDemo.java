import java.util.Scanner;
public class SwitchDemo {
	public static void main(String [] args) {
		
		//variable declaration
		int number;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter 1, 2, 3, 4, or 5: ");
		number = keyboard.nextInt();
		
		//switch statement
		switch (number) {
		
		case 1:
			System.out.println("You entered 1.");
			break;
			
		case 2:
			System.out.println("You entered 2.");
			break;
			
		case 3:
			System.out.println("You entered 3.");
			break;
			
		case 4:
			System.out.println("You entered 4.");
			break;
			
		case 5:
			System.out.println("You entered 5.");
			break;
			
		default:
			System.out.println("That is not 1,2,3,4 or 5!.");
		}
		
	}

}
