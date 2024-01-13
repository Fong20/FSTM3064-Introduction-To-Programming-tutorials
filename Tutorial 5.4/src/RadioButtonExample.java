import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class RadioButtonExample {
	public static void main(String[] args) {
		
		
		//Create button group
		ButtonGroup bg = new ButtonGroup();
		
		//Create 3 radio buttons
		JRadioButton rb1 = new JRadioButton("Male", true);
		JRadioButton rb2 = new JRadioButton("Female", false);
		JRadioButton rb3 = new JRadioButton("Not specified", false);
		
		/*add the radio buttons into the button group
		 * button group allows the buttons to be selected independently
		 */
		bg.add(rb1);
		bg.add(rb2);
		bg.add(rb3);
		
		//create panel
		JPanel panel = new JPanel();
		
		//create frame
		JFrame frame = new JFrame("Hello Swing");
		frame.setSize(300,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		//add components into the frame
		panel.add(rb1);
		panel.add(rb2);
		panel.add(rb3);
		frame.add(panel);
		
		
	}

}
