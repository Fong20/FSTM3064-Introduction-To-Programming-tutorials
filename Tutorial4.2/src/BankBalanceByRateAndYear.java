import java.util.Scanner;

public class BankBalanceByRateAndYear {
	public static void main(String[] args) {
		
		//declare variables
		double initialBalance, balance, interest;
		int year;
		final double LOW = 0.02, HIGH = 0.05, INCREMENT = 0.01; 
		final int MAX_YEAR = 4;
		
		Scanner keyboard = new Scanner(System.in);
		
		//Prompt user to enter initial bank balance
		System.out.print("Enter initial bank balance > ");
		initialBalance = keyboard.nextDouble();
		keyboard.nextLine();
		
		//for loop
		for (interest = LOW; interest <= HIGH; interest += INCREMENT) {
					balance = initialBalance;
					System.out.println("\nWith an initial balance of $ " + balance + " at an interest rate of " + interest);
					
				for (year = 1; year <= MAX_YEAR; ++year) {
					balance = balance + balance * interest;
					System.out.println("After year " + year + " balance is $ " + balance);
				}
		}
	}
}

