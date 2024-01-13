import java.awt.Color;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboBoxExample {
	public static void main(String [] args) {
	
	//Create combobox for countries
	//JComboBox cb = new JComboBox(new String[] {"India", "Australia", "USA", "UK", "New Zealand"});
	//cb.setBounds(50,50,90,20);
	
	//or
	
	String[] countries = {"India", "Australia", "USA", "UK", "New Zealand"};
	JComboBox cb = new JComboBox(countries);
	cb.setBounds(50,50,90,20);
	
	//create frame
	JFrame frame = new JFrame("ComboBox Example");
	frame.setSize(400,500);
	frame.getContentPane().setBackground(Color.gray);
	frame.setLayout(null);
	frame.setVisible(true);
	
	//add combobox into frame
	frame.add(cb);
		
	}

}
