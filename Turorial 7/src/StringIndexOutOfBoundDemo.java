import java.util.*;
public class StringIndexOutOfBoundDemo {
	public static void main(String[] arg) {
		try {
			//length of string is 20
			String a = "This is like chipping";
			/*wants to print out the 30th character in string a
			 * However, the length of string a is only 20 so it does not exist, it will cause runtime error
			 * Exception handling using try catch which will print StringIndexOutOfBoundsException
			 */
			
			//c is the 30th character of string a. It does not exist
			char c = a.charAt(30);
			System.out.println(c);
		}
		
		catch (StringIndexOutOfBoundsException e) {
			System.out.println("StringIndexOutOfBoundsException");
		}
	}

}
