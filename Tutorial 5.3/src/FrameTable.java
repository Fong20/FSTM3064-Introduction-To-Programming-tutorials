
import javax.swing.*;

public class FrameTable extends JFrame {
	JTable table;
	JFrame frame;
	JScrollPane scrollPane;
	//content in the table
	FrameTable(){
		
		//super creates an invisible frame with title
		//super ("Order Details");
		
		//Declare array variable columns and rows 
		//String columns[] = { "Code", "Product Name", "Quantity","Quality"};
		//String rows[][] = { {"1101", "Hello Kitty", "3", "Good"},
							//{"1102", "Power Ranger", "4", "Good"},
							//{"1103", "Bumblebee", "10", "Good"},
							//{"1104", "Mickey Mouse", "15", "Good"},
							//{"1105", "Frozen", "21", "Good"},
							//{"1106", "Sonic Hedgehog", "13", "Good"},
							//{"1107", "Doo Doo", "1", "Good"}};
		
		//table = new JTable(rows,columns );
		
		//getContentPane().add(new JScrollPane(table));
		//setSize(500, 160);
		//setVisible(true);
		//setLocationRelativeTo(null);
		
		//or
		
		//create a table
		//Declare array variable columns and rows 
		String[] columns = { "Code", "Product Name", "Quantity"};
		String[][] rows = { {"1101", "Hello Kitty", "3"},
							{"1102", "Power Ranger", "4"},
							{"1103", "Bumblebee", "10"},
							{"1104", "Mickey Mouse", "15"},
							{"1105", "Frozen", "21"},
							{"1106", "Sonic Hedgehog", "13"},
							{"1107", "Doo Doo", "1"}};
		
		//create a table
		table = new JTable(rows, columns);
		
		//create a frame
		frame = new JFrame("Order Details");
		frame.setSize(500,160);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		//add table into frame
		frame.add(table);
		
		//create scrollpane for table
		scrollPane = new JScrollPane(table);
				
		//add scrollpane into frame
		frame.add(scrollPane);
	
		
		}
	
	public static void main (String[] args) {
		new FrameTable();
		
	}

}
