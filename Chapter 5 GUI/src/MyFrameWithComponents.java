// Do not need to import individual J component class as the asterisk represents all type of component class including JOptionFrame
import javax.swing.*;

public class MyFrameWithComponents {
	public static void main(String[] args) {
		
	//Add frame
	JFrame frame = new JFrame("MyFrameWithComponents");
	
	//Add a button to the frame
	JButton jbtOK = new JButton("OK");
	frame.add(jbtOK);
	
	//Set size of the frame
	frame.setSize(400, 300);
	
	//Set what operation to execute when the frame is closed
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
	//Set position of frame
	frame.setLocationRelativeTo(null); 
	
	//Set visibility of frame
	frame.setVisible(true);
	}

}
