import java.util.Scanner;
public class Revision3Question10 {
	public static void main(String [] args) {
		
		byte tic_Num, age;
		String gender;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter number of traffic tickets:");
		tic_Num = keyboard.nextByte();
		
		System.out.println("Please enter age:");
		age = keyboard.nextByte();
		
		System.out.println("Please enter gender:");
		gender = keyboard.next();
		
		if (tic_Num > 2 || age < 25 && gender == "male") {
			System.out.println("You have to pay aditional premium of 200");
		}	

	}

}
