import javax.swing.JOptionPane;

public class Selection1 {
	public static void main(String[] args) {
		
		int year;
		String inputString;
		
		inputString = JOptionPane.showInputDialog(null,  "Enter your year in university",JOptionPane.INFORMATION_MESSAGE);
				year = Integer.parseInt(inputString);
				
				
				if(year ==1)
					System.out.println("Freshman");
				else if(year ==2)
					System.out.println("Sophomore");
				else if(year ==3)
					System.out.println("Junior");
				else if(year ==4)
					System.out.println("Senior");
				else
					System.out.println("Invalid year");
		
	}
}
