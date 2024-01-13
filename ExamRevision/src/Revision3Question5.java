import java.util.Scanner;
public class Revision3Question5 {
	public static void main(String [] args) {
		
		int count = 1, number;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Please enter value of number:");
		number = keyboard.nextInt();
		
		while (count <= number) {
			System.out.println("value  of count:" + count);
			System.out.println("value of number:" + number);
			count++;
			System.out.println("Buckle my shoes");
		}
	
	

}
}