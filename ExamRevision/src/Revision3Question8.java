import java.util.Scanner;
public class Revision3Question8 {
	public static void main(String [] args) {
		
		String donationType, volunteer, message;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter donation type:");
		donationType = keyboard.next();
		
		switch (donationType) {
		
		case "Clothing_code":
			volunteer = "Clothing_pricer";
			message = "A clothing donation";
			
			break;
			
		case "Furniture_code":
			volunteer = "Furniture_pricer";
			message = "A furniture donation";
			
			break;
			
		case "Electronics_code":
			volunteer = "Electronics_pricer";
			message = "An electronics donation";
			
			break;
			
		case "Other_code":
			volunteer = "Other_pricer";
			message = "Another donation type";
			
			break;
			
		default:
			volunteer = "invalid";
			message = "An invalid donation type";	
		}
		
		System.out.println("Volunteer is " + volunteer);
		System.out.println(message);
				
	}

}
