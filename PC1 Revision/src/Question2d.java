import java.util.Scanner;
public class Question2d {
	public static void main(String[] args) {
		
		int num,sum=0;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter value of numbers");
		num = keyboard.nextInt();
		num = keyboard.nextInt();
		
		while(num == 0) {
			num+=sum;
			System.out.print("Sum of numbers = " + num);
			
			}
		
	}

}
