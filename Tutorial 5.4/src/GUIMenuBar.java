import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.*;

public class GUIMenuBar {
	public static void main(String args[]) {
		
		//Create frame
		JFrame frame = new JFrame("Chat Frame");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400,400);
		
		//Create menu bar 
		JMenuBar mb = new JMenuBar();
		
		//Create menu
		JMenu m1 = new JMenu("FILE");
		JMenu m2 = new JMenu("HELP");
		
		//Add menu to menu bar
		mb.add(m1);
		mb.add(m2);
		
		//Create menu item
		JMenuItem m11 = new JMenuItem("Open");
		JMenuItem m22 = new JMenuItem("Save as");
		
		//Add menu item into menu
		m1.add(m11);
		m1.add(m22);
		
		//Create panel
		JPanel panel = new JPanel();
		
		
		JLabel label = new JLabel("Enter Text");
		
		JTextField tf = new JTextField(10);//accept up to 10 characters
		
		JButton send = new JButton("Send");
		JButton reset = new JButton("Reset");
		
		//Add components to panel
		panel.add(label);
		panel.add(tf);
		panel.add(send);
		panel.add(reset);
		
		JTextArea ta = new JTextArea();
		
		/*Add components to the frame
		 * frame use border layout
		 */
		frame.getContentPane().add(BorderLayout.SOUTH,panel);
		frame.getContentPane().add(BorderLayout.NORTH,mb);
		frame.getContentPane().add(BorderLayout.CENTER,ta);
		frame.setVisible(true);
		
	}	
}
