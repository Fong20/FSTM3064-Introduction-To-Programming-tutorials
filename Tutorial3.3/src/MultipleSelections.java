import java.util.Scanner;

public class MultipleSelections {
	public static void main(String[] args) {
		
		//Declare variables
		String level;
		int salary;
		
		Scanner keyboard = new Scanner(System.in);
		
		//Prompt user to enter level
		System.out.println("Please enter level");
		level = keyboard.nextLine();
		
		System.out.print("Please enter salary");
		salary = keyboard.nextInt();
		
		//Switch statement
		switch (level) {
		case "Top Management":
		case "Senior Manager":
			if (salary > 8000) {
				System.out.println("High income earner");
			}
			break;
			
		case "Manager":
		case "Senior Executive":
			if ((salary < 8000) && (salary > 5000)) {
				System.out.println("Time to earn more");
			}
			
			else
				System.out.println();
			break;
			
			default:
				System.out.println("How to survive like this?");
		}
	}
}
