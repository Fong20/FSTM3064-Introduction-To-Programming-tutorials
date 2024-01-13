import java.util.Scanner;

public class SalaryRange {
	public static void main(String[] args) {
		
		//Declare variables
		int salary;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter your salary");
		salary = keyboard.nextInt();
		
		if ((salary >= 1000) && (salary <= 1500)) {
			System.out.println("Clerical Staff");
		}
		
		else if ((salary > 1500) && (salary <= 2500)) {
			System.out.println("Executive level");
			
		}
		
		else if ((salary > 2500) && (salary <= 4500)) {
			System.out.println("Senior executive");
		}
	
		else if ((salary > 4500) && (salary <= 6500)) {
			System.out.println("Manager");
		}
		
		else if (salary > 6500) {
			System.out.println("Senior Manager or Top Management");
		}
		
		else {
			System.out.println("Time to find new job");
		}
		
		keyboard.close();
	}

}
