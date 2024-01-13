import javax.swing.JTextField;

import java.awt.Color;

import javax.swing.JFrame;
public class JTextFieldExample {
	public static void main(String [] args) {
		
		
		
		JTextField textField = new JTextField(8);
		//textField.setForeground(new Color(255,255,255));
		
		JFrame frame = new JFrame("TextField Example");
		frame.setSize(500,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		frame.add(textField);
		
	}

}
