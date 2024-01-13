import java.util.Scanner;
public class AnalyzeNumber {
	public static void main(String[] args) {
		
		final int NUMBER_OF_ELEMENTS = 10;
		
		//Declare array
		double[] numbers = new double[NUMBER_OF_ELEMENTS];
		double sum = 0;
		
		Scanner input = new Scanner(System.in);
		
		
		//Since number of elements is 10, it will loop from 0 to 9
		for(int i = 0; i < NUMBER_OF_ELEMENTS; i++) {
			System.out.print("Enter a new number: ");
			
			numbers[i] = input.nextDouble();
			
			sum += numbers[i];
			
		}
		
		//Calculate average
		double average = sum/NUMBER_OF_ELEMENTS;
		
		/*comparing how many values larger than average value
		 * if value of numbers[i] is larger than average value, the count will increase by 1
		 */
		int count = 0;
		for(int i = 0; i < NUMBER_OF_ELEMENTS; i++) {
			if(numbers[i] > average) {
				count++;
			}
		}
		
		System.out.println("Average is " + average);
		System.out.println("Number of elements above the average: " + count);
		
		input.close();
	}

}
