import java.util.Scanner;
public class Question3b {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number, max;
		number = input.nextInt();
		max = number;
		
		do  {
			//System.out.print("Please enter a value:");
			 number = input.nextInt();
			 if (number > max)
				 max = number;
			 } 
		while (number != 0);
		
		//Print out values
			System.out.println("max is " + max);
			System.out.println("number " + number);
			
		

	}

}
