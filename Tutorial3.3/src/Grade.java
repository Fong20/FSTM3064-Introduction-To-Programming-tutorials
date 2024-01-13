import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		
		//Declare variables
		char grade;
		
		Scanner keyboard = new Scanner(System.in);
		
		//Prompt user to enter grade
		System.out.println("Enter grade");
		grade = keyboard.next().charAt(0);
		
		//Switch statement
		switch (grade) {
		case 'A' : System.out.println("Excellent");
			break;
		case 'B' : System.out.println("Great");
			break;
		case 'C' : System.out.println("Not Bad");
			break;
		default : System.out.println("You need to work harder");
			break;
		}
		
		
		
	}

}
