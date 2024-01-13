
public class MyTestArray {
	public static void main(String[] args) {
		
		//Prints out value
		double[] myArray = {0.5,1.2,2.2,3.4,4.7};
		
		for(int k = 0; k < myArray.length; k++) {
		System.out.println(myArray[k]);
	}
		
		//Total up all values
		double aggregate = 0;
		
		for (int k = 0; k < myArray.length; k++) {
			aggregate +=myArray[k];
		}
		
		System.out.println("Aggregate value = " + aggregate);
		
		/*Compare the values
		 * myArray[0] = 0.5
		 */
		double maxVal = myArray[0];
		
		for(int k = 0; k < myArray.length; k++) {
			//If value of myArray is more than value of maxVal, the largest value of the myArray will be the value of maxVal 
			if (myArray[k] > maxVal)
				maxVal = myArray[k];
			
		}
		
		//Print out maxValue
		System.out.println("Max Value is " + maxVal);
		
		
	}

}
