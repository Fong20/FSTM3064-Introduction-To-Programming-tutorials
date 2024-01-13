import java.util.Scanner;
public class Revision {
	public static void main(String[] args) {
		
		//variable declaration
		int x = 10, a;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter value of a:");
		a = keyboard.nextInt();
		
		switch (a) {
		case 1:
			x+=5;
			System.out.print("value of x:" + x);
			break;
			
		case 2:
			x+=10;
			System.out.print("value of x:" + x);
			break;
			
		case 3:
			x+=16;
			System.out.print("value of x:" + x);
			break;
			
		case 4:
			x+=34;
			System.out.print("value of x:" + x);
			break;
			
		}
		keyboard.close();
	}

}
