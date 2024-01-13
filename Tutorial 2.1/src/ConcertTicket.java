import java.util.Scanner;

public class ConcertTicket {
	public static void main(String[] args) {
		
		//Declare variables
		int amountRM;
		int amountUS;
		int numberOfTickets;
		
		//Constant declaration
		final int CONCERT_TICKET_PRICE = 100;
		
		Scanner keyboard = new Scanner(System.in);
		
		//This prompts user to enter amount in RM
		System.out.print("Please enter amount in RM >> ");
		amountRM = keyboard.nextInt();
		
		
		//This command converts amount in RM to US and prints it
		amountUS = amountRM * 4;
		System.out.println("amount in US = " + amountUS );
		
				
		//This calculates number of tickets can be purchased
		numberOfTickets = amountUS/CONCERT_TICKET_PRICE;
		
		//Prints out number of tickets can be purchased
		System.out.print("number of tickets = " + numberOfTickets);
		
		keyboard.close();
	}
}
