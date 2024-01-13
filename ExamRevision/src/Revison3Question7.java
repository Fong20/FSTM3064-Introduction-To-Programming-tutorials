import javax.swing.JOptionPane;
public class Revison3Question7 {
	public static void main(String [] args) {
		
		try {
		
		String oranges, apples;
		int num_Oranges, num_Apples, total;
		
		oranges = JOptionPane.showInputDialog(null, "Please enter number of oranges:");
		num_Oranges = Integer.parseInt(oranges);
		
		apples = JOptionPane.showInputDialog(null, "Please enter number of apples:");
		num_Apples = Integer.parseInt(apples);
		
		total = num_Oranges + num_Apples;
		
		//Display total number of fruits using JOptionPane message dialog
		JOptionPane.showMessageDialog(null,  "Total number of fruits: " + total);
		
		}
		
		catch (NumberFormatException e) {
			System.out.println("Please enter an integer");
		}
	}

}
