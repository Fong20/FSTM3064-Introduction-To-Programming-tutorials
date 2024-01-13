import javax.swing.JOptionPane;
public class Question2c {
	public static void main(String [] args ) {
		
		try {
		String oranges, apples;
		int num_Oranges, num_Apples, total;
		
		oranges = JOptionPane.showInputDialog(null, "Please enter number of oranges");
		num_Oranges = Integer.parseInt(oranges);
		
		apples = JOptionPane.showInputDialog(null, "Please enter number of apples");
		num_Apples = Integer.parseInt(apples);
		
		total = num_Oranges + num_Apples;
		
		JOptionPane.showMessageDialog(null, "Total number of fruits is " + total);
		
		//System.out.println("Total number of fruits = " + total);
		}
		
		catch (NumberFormatException e) {
			System.out.println("String must be digits and cannot be other forms of value");
		}
		
		
	}

}
