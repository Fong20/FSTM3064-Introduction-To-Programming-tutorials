import java.util.Scanner;
public class ArrayCount {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		int[] z = new int[10];
		int pos = 0;
		int neg = 0;
		int odd = 0;
		int even = 0;
		int zero = 0;
		
		for (int i = 0; i <z.length; i++) {
			System.out.println("Print the value of z");
			z[i] = keyboard.nextInt();
		}
		
		for(int i = 0; i <z.length; i++) {
			if(z[i] > 0) {
				pos++; //count how many positive values
			}
			else if (z[i] < 0) {
				neg++; //count how many negative values
			}
			else {
				zero++;
			}
			
			if (z[i]% 2==0) {
				even++;
			}
			else {
				odd++;
			}
			
			System.out.println("\nPositive: " + pos + "\nNegative: " + neg + "\nZero: " + zero + "\nOdd: " + odd + "\nEven: " + even);
		}
	}
}
