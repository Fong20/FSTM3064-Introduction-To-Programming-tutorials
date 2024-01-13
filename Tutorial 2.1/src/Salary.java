import java.util.Scanner;

public class Salary {
	public static void main(String[] args) {
		
		//Declare variables
		int HourlyRate;
		int Working_hours;
		int Monthly_Salary;
		
		Scanner keyboard = new Scanner(System.in);
		
		//This statement prompts user to enter HourlyRate
		System.out.print("Please enter HourlyRate >> ");
		HourlyRate = keyboard.nextInt();
		
		//This statement prompts user to enter employee's number of working hours
		System.out.print("Please enter Working hours >> ");
		Working_hours = keyboard.nextInt();
		
		//This calculates the part-time employee salary for a month
		Monthly_Salary = HourlyRate * Working_hours;
		
		//This prints out the part-time employee's salary per month
		System.out.println("Part-time employee's salary per month in RM = " + Monthly_Salary);
		
		if (Monthly_Salary < 2000) {
			//Print out message "Need to work more"
			System.out.print("Need to work more"); 
			}
		
		else {
			//Print out message "good job"
			System.out.print("good job");
				
		}
		
		keyboard.close();
		
	}
}
