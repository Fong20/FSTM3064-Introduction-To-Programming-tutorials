import java.util.Scanner;

public class ComputeArea {
	public static void main(String[] args) {
		
		//Declare variables
		double radius;
		double area;
		
		//Declare constant
		final double PI = 3.14159;
		
		Scanner keyboard = new Scanner(System.in);
		
		//Prompt user to enter radius
		System.out.print("Please enter radius :");
		radius = keyboard.nextDouble();
		
		//Condition
		if (radius >= 0) {
		
			//compute area of circle
			area = radius * radius * PI;
			Math.round(area);
			
			//Print out area of circle
			System.out.print("Area of circle = " + area);
		}
		
		else {
			System.out.print("Radius cannot be negative");
		}
		keyboard.close();
	}
}
