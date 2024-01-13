import java.util.Scanner;
public class Question2a {
	public static void main(String [] args) {
		int children_Amount, working_People_Amount;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter the number of children:");
		children_Amount = keyboard.nextInt();

		System.out.println("Please enter the number of people earning income in family:");
		working_People_Amount = keyboard.nextInt();

if (children_Amount >=5 || working_People_Amount ==1) {
		System.out.println("You are eligible for Rm1000 social service subsidy");
}

else {
		System.out.println("You have to pay higher taxes");
}
}


}
