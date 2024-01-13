import java.util.Scanner;
public class ArraySmallLarge {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int a[] = new int[] {33,53,73,94,22,45,23,87,13,63};
		int smallest =a[0];
		int largest = a[0];
		
		for(int i=1; i< a.length; i++) {
			if(a[i] > largest)
				largest = a[i];
			else if (a[i] < smallest)
				smallest = a[i];
		
		}
		
		System.out.println("Largest Number is: " + largest);
		System.out.println("Smallest Number is: " + smallest);
		
		
	}

}

