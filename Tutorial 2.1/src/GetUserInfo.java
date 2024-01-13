//Input and output values in string and integer.
import java.util.Scanner;

public class GetUserInfo {
		public static void main(String[] args){
				String name;
				int age;
				
				Scanner keyboard = new Scanner(System.in);
				System.out.print("Please enter your age >> ");
				age=keyboard.nextInt(); //This statement gets the integer
				keyboard.nextLine(); // Will allow you to input your name
				System.out.println("Please enter your name >> ");
				name = keyboard.nextLine();// This statement gets the name
				System.out.println("Your name is " + " and you are " + age + " years old. ");
				keyboard.close();
				
		}
}
