import java.util.Scanner;
public class Revision2Question2b {
public static void main(String [] args) {
	
	int number;
	
	Scanner keyboard = new Scanner(System.in);
	System.out.println("Please input a number: ");
	number = keyboard.nextInt();
	
	while(number != 0) {
		//System.out.println("Please input a number: ");
	System.out.println(number);
	number = keyboard.nextInt();
	//System.out.println(number);
}
}
}