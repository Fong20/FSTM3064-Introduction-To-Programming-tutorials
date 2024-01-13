import java.util.Scanner;
public class ArrayCal {
	public static void main(String[] args) {
		
		int Size, i;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter number of elements in the array:");
		Size = keyboard.nextInt();
		
		//Convert input from size into array variable as array size
		int[] a = new int[Size];
		int[] b = new int[Size];
		int[] addition = new int[Size];
		int[] subtraction = new int[Size];
		int[] multiplication = new int[Size];
		int[] division = new int[Size];
		float[] modulus = new float[Size];
		
		//Prompt user to enter the elements of each array index for variable a
		System.out.println("\nPlease enter " + Size + " elements of an array:");
		
		for(i=0; i<Size; i++) {
			a[i] = keyboard.nextInt();
			
		}
		
		//Prompt user to enter the elements of each array index for variable b
		System.out.println("\nPlease enter " + Size + " elements of an array:");
		
		for(i=0; i<Size; i++) {
			b[i] = keyboard.nextInt();
		}
		
		//Perform calculations
		for(i=0; i<Size; i++) {
			addition [i] = a[i] + b[i];
			subtraction [i] = a[i] - b[i];
			multiplication [i] = a[i] * b[i];
			division [i] = a[i] / b[i];
			modulus [i] = a[i] % b[i];
		}
		
		/* Print out calculation results
		 * \n is used for vertical spacing
		 * \t is used for horizontal spacing
		 */
		
		System.out.println("\nadd\t sub\t multi\t div\t mod");
		//System.out.println("\nadd sub multi div mod");
		for(i=0; i<Size; i++) {
			System.out.print(addition[i] + "\t" );
			System.out.print(subtraction[i] + "\t");
			System.out.print(multiplication[i] + "\t");
			System.out.print(division[i] + "\t");
			System.out.print(modulus[i] + "\t");
			System.out.print("\n");
		}
		
		
	}

}
