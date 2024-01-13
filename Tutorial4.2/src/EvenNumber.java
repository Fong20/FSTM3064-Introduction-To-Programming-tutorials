
public class EvenNumber {
	public static void main(String[] args) {
		
		//define limit
		int limit = 50;
		
		System.out.println("Printing Even numbers between 1 and " + limit);
		
			//start i with number 1, if condition is true, add i with 1
			for (int i = 1; i <= limit; i++) {
				//if number is divisible by 2, then it is even number
				if ( i % 2 == 0) {
					System.out.println(i + " is even number");
				}
			}
	}

}
