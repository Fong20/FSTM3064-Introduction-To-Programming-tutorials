import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.BorderLayout;
public class ShowBorderLayout {
	public static void main(String [] args) {
		
		//create a frame
		JFrame frame = new JFrame("Border Layout");
		frame.setSize(300, 300);
		frame.setLayout(new BorderLayout(5, 10));
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		//create buttons
		JButton eastButton = new JButton("East");
		JButton southButton = new JButton("South");
		JButton westButton = new JButton("West");
		JButton northButton = new JButton("North");
		JButton centerButton = new JButton("Center");
		
		/*add button into the frame
		 *arrange the buttons inside the frame using border layout
		 */
		frame.add(eastButton, BorderLayout.EAST);
		frame.add(southButton, BorderLayout.SOUTH);
		frame.add(westButton, BorderLayout.WEST);
		frame.add(northButton, BorderLayout.NORTH);
		frame.add(centerButton, BorderLayout.CENTER);
	}

}
