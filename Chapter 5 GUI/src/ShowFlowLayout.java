import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JFrame;
import java.awt.FlowLayout;

public class ShowFlowLayout extends JFrame {
	public ShowFlowLayout() {
	
		//Set FlowLayout, aligned left with horizontal gap 10 and vertical gap 20 between components
		setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));
		
		/*add components to the frame
		 * In this case, labels and text fields are added to the frame/container
		 */
		add(new JLabel("First name"));
		add(new JTextField(8));
		add(new JLabel("MI"));
		add(new JTextField(1));
		add(new JLabel("Last Name"));
		add(new JTextField(8));
	}	
	
		/*Main method
		 * Create frame
		 */
		public static void main(String[] args) {
			//Declare showFlowLayout
			ShowFlowLayout frame = new ShowFlowLayout();
			
			//Set title of frame
			frame.setTitle("ShowFlowLayout");
			
			/*Set size of the frame
			 * Note:If size of the frame changes, all the components inside the frame will be automatically rearranged.
			 * Note:If size of the frame is not declared, the frame will only show the title bar. 
			 */
			frame.setSize(200, 200);
			
			/*Set position of frame
			 * Null positions the frame at the middle
			 */
			frame.setLocationRelativeTo(null);
			
			/* Set what operation to execute when the frame is closed
			 * JFrame.EXIT_ON_CLOSE exits the frame when the frame is closed.
			 */
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			/*Set visibility of the frame
			 * true displays the frame, false does not display the frame
			 */
			frame.setVisible(true);
	}

}
