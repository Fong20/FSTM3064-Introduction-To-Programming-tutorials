import java.util.*;
public class ArrayIndexOutOfBoundDemo {
	public static void main(String [] args) {
		
		/*Looking for an array index which does not exist
		 * Exception handling using catch by printing Array Index is Out of Bounds
		 */
		try {
			int a[] = new int[5];
			a[6] = 9;
			
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array Index is Out Of Bounds");
		}
	}

}
