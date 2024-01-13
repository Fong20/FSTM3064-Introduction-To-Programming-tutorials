import javax.swing.*;
import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class LoginDemo extends JFrame implements ActionListener {
	
	JPanel panel;
	JLabel user_Label, password_Label, message;
	JTextField userName_Text;
	JPasswordField password_Text;
	JButton submit, cancel;
	
	LoginDemo() {
		//User Label
		user_Label = new JLabel();
		user_Label.setText("User Name :");
		userName_Text = new JTextField();
		
		//Password
		password_Label = new JLabel();
		password_Label.setText("Pasword :");
		password_Text = new JPasswordField();
		
		//Submit
		submit = new JButton("SUBMIT");
		
		panel = new JPanel(new GridLayout(3,1));
		panel.add(user_Label);
		panel.add(userName_Text);
		panel.add(password_Label);
		panel.add(password_Text);
		
		message = new JLabel();
		panel.add(message);
		panel.add(submit);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		/*Adding Listeners to components
		 * Action listener is applied to the submit button
		 */
		submit.addActionListener(this);
		add(panel, BorderLayout.CENTER);
		setTitle("Please Login Here !");
		setSize(375, 667);
		setVisible(true);
	}
		
		public static void main(String[] args) {
			new LoginDemo();
			
		}
		
		/*When user keys in username and password and clicks on submit button which is equipped with ActionListener,
		 * it will follow action event which will compare the conditions
		 * In this case, condition is set whereby the default username and password is admin.
		 * If admin is typed for username and password, it will print Hello admin
		 * else it will show invalid user 
		 */
		public void actionPerformed(ActionEvent ae) {
			String userName = userName_Text.getText();
			String password = password_Text.getText();
			
			if(userName.trim().equals("admin") && password.trim().equals("admin")) {
				message.setText(" Hello " + userName + "");
			}
			
			else {
				message.setText(" Invalid User.. ");
			}
	}
}
