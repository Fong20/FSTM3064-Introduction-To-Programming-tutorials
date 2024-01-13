import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class JResortCalculator extends JFrame implements ItemListener {
	
	final int BASE_PRICE = 200, WEEKEND_PREMIUM = 100, BREAKFAST_PREMIUM = 20, GOLF_PREMIUM = 75;
	int totalPrice = BASE_PRICE;
	
	JCheckBox weekendBox = new JCheckBox ("Weekend premium $" + WEEKEND_PREMIUM, false);
	JCheckBox breakfastBox = new JCheckBox ("Breakfast $" + BREAKFAST_PREMIUM, false);
	JCheckBox golfBox = new JCheckBox ("Golf $" + GOLF_PREMIUM,false);
	
	JLabel resortLabel = new JLabel("Resort Price Calculator");
	JLabel priceLabel = new JLabel("The price for your stay is");
	JTextField totPrice = new JTextField(4);
	JLabel optionExplainLabel = new JLabel ("Base price for a room is $" + BASE_PRICE + " . ");
	JLabel optionExplainLabel2 = new JLabel ("Check the options you want.");
	
	public JResortCalculator() {
		super("Resort Price estimator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//use flow layout to arrange all the components
		setLayout(new FlowLayout());
		add(resortLabel);
		add(optionExplainLabel);
		add(optionExplainLabel2);
		add(weekendBox);
		add(breakfastBox);
		add(golfBox);
		add(priceLabel);
		add(totPrice);
		
		totPrice.setText("$" + totalPrice);
		//item listener is added to the following check boxes
		weekendBox.addItemListener(this);
		breakfastBox.addItemListener(this);
		golfBox.addItemListener(this);
	}
		//allows the check box to function
		public void itemStateChanged(ItemEvent event) {
			
			Object source = event.getSource();
			int select = event.getStateChange();
			
			//if user selects weekend box
			if(source == weekendBox)
				if(select == ItemEvent.SELECTED)
					totalPrice += WEEKEND_PREMIUM;
				
				else
					totalPrice -= WEEKEND_PREMIUM;
			
			//if user selects breakfast box
			else if(source == breakfastBox)
			{
				if(select == ItemEvent.SELECTED)
					totalPrice += BREAKFAST_PREMIUM;
				else
					totalPrice -= BREAKFAST_PREMIUM;
			}
			
			else //if(source == golfBox) by default
				if(select == ItemEvent.SELECTED)
					totalPrice += GOLF_PREMIUM;
				
				else
					totalPrice -= GOLF_PREMIUM;
			
			totPrice.setText("$" + totalPrice);
		}
		
		public static void main(String[] args) {
			JResortCalculator aFrame = new JResortCalculator();
			final int WIDTH = 300, HEIGHT = 200;
			aFrame.setSize(WIDTH, HEIGHT);
			aFrame.setVisible(true);
		}
		
	
}
