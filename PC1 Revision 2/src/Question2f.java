import java.util.Scanner;
public class Question2f {
	public static void main(String [] args) {
		
	
	String donationType;
	
	Scanner keyboard = new Scanner(System.in);
	
	System.out.print("Please enter input:");
	donationType = keyboard.next();
	
	switch (donationType) {
	
	case "Clothing_code":
		System.out.println("Suitable volunteer for chosen option is Clothing_pricer");
		System.out.println("It is a clothing donation");
		
		break;
		
	case "Furniture_code":
		System.out.println("Suitable volunteer for chosen option is Furniture_pricer");
		System.out.println("It is a furniture donation");
		
		break;
		
	case "Electronics_code":
		System.out.println("Suitable volunteer for chosen option is Electronics_pricer");
		System.out.println("It is an electronics donation");
		
		break;
		
	case "Other_code":
		System.out.println("Suitable volunteer for chosen option is Other_pricer");
		System.out.println("It is Another donation type");
		
		break;
		
	default:
		System.out.println("Suitable volunteer for chosen option is invalid");
		System.out.println("It is an invalid donation type");
		
		break;
	}

}
}