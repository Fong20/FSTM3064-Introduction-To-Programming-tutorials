import javax.swing.*;
import java.awt.event.*;

public class ComboBoxActionExample {
	JFrame f;
	final JLabel label;
	JButton b;
	final JComboBox cb;
	ComboBoxActionExample() {
		f = new JFrame("ComboBox Example");
		label = new JLabel();
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setSize(400,100);
		
		b = new JButton("Show");
		
		/*This method specifies the location and size of component using setBounds.
		 * setBounds(x-coordinate,y-coordinate,width,height)
		 * x-coordinate and y-coordinate starts from the top left section of the frame
		 * width = width of the component
		 * height = height of the component
		 */
		
		b.setBounds(200,100,75,20);
		
		String languages[] = {"C","C++","C#","Java","PHP"};
		cb = new JComboBox(languages);
		cb.setBounds(50,100,90,20);
		
		//Set properties of frame]
		f.setLayout(null);
		f.setSize(350,350);
		f.setVisible(true);
		
		
		//Add components to frame
		f.add(cb);
		f.add(label);
		f.add(b);
		
		//Add action listener to b
		b.addActionListener(new ActionListener() {
			
		public void actionPerformed(ActionEvent e) {
			String data = "Programming language selected"
 + cb.getItemAt(cb.getSelectedIndex());
			label.setText(data);
		}
	});
}
public static void main(String[] args) {
	new ComboBoxActionExample();
	
}

}
