import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class FrameProperties {
	public static void main(String [] args) {
		
		//Import picture
		ImageIcon planet = new ImageIcon("planet.jpg");
		
		ImageIcon galaxy = new ImageIcon("galaxy.jpg");
		
		//Create border
			//Color of border, thickness of border
			Border border = BorderFactory.createLineBorder(Color.white,10);
			
		//Create label
			JLabel label = new JLabel();
			
			//Label settings
			label.setText("I Eat, Breath and Live to Code");
			label.setIcon(galaxy);
			label.setHorizontalTextPosition(JLabel.CENTER);
			label.setVerticalTextPosition(JLabel.TOP);
			//Font color
			label.setForeground(new Color(52,73,94));
			label.setFont(new Font("Courier New", Font.PLAIN,20));
			//Position between image and text
			label.setIconTextGap(20);
			label.setBorder(border);
			label.setVerticalAlignment(JLabel.CENTER);
			label.setHorizontalAlignment(JLabel.CENTER);
			
			
			
		//Create frame
			JFrame frame = new JFrame();
			
			//Frame settings
				frame.setTitle("Frame Design");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setResizable(false);
				frame.setSize(800, 600);
				frame.setVisible(true);
				frame.getContentPane().setBackground(new Color(175,122,197));
				frame.add(label);
				frame.setIconImage(planet.getImage());
				
				
	}

}
