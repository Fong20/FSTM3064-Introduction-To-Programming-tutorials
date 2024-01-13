import javax.swing. *;
import java.awt.*;
public class TestImageicon extends JFrame {
	
	/*please save 4 images and put the file path that you have saved them
	 *the below image name and file path are based on the images that I have saved on my desktop
	 */
	
	private ImageIcon adultSetPic = new ImageIcon("C:\\Users\\weitz\\Pictures\\adultset.jpg");
	
	private ImageIcon kidSetPic = new ImageIcon("C:\\Users\\weitz\\Pictures\\kidset.jpg");
	
	private ImageIcon saladPic = new ImageIcon("C:\\Users\\weitz\\Pictures\\salad.jpg");
	
	private ImageIcon dessertPic = new ImageIcon("C:\\Users\\weitz\\Pictures\\dessert.jpg");
	
	public TestImageicon() {
			setLayout(new GridLayout(2,2,10,10));
			add(new JLabel(adultSetPic));
			add(new JLabel(kidSetPic));
			add(new JButton(saladPic));
			add(new JButton(dessertPic));
	}
	
	//Main method
	public static void main(String[] args) {
			TestImageicon frame = new TestImageicon();
			frame.setTitle("TestImageIcon");
			frame.setSize(1200,600);
			frame.setLocationRelativeTo(null);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);
	}
}

