import java.util.Arrays;
public class ArraySort {
	public static void main(String[] args) {
		
		//int[] numArray = new int[5];
		
		//Declare values for each index
		//numArray[0] = 10;
		//numArray[1] = 5;
		//numArray[2] = 20;
		//numArray[3] = 45;
		//numArray[4] = 30;
		
		//or
		
		//Declare, create array and refer array to variable at the same time
		int[] numArray = {10,5,20,45,30};
		
		//Sort values in ascending order
		Arrays.sort(numArray);
		
		//use for loop to list down the sorted values
		int i;
		for(i = 0; i< numArray.length; i++) {
			System.out.println("num " + numArray[i]);
			
		}
		
	}

}
