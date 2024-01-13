import java.util.*;
import javax.swing.JOptionPane;
public class NumberFormatDemo {
	public static void main(String[] args) {
		
		/*akki is not an integer, it is a string so it will cause runtime error
		 * Exception handling using catch by printing Number Format Exception
		 */
		try {
			//String value;
			
			
			//value = JOptionPane.showInputDialog(null, "Please enter value");
			//int num = Integer.parseInt(value);
			
			//System.out.print(num);
			
			//or
			
			String value;
			
			Scanner keyboard = new Scanner(System.in);
			System.out.println("Please enter value:");
			value = keyboard.next();
			
			int num = Integer.parseInt(value);
			
			System.out.print(num);
		}
		
		catch(NumberFormatException e) {
			System.out.println("Number Format Exception");
		}
		
	}

}
