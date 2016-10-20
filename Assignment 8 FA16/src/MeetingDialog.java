import java.awt.*;
import java.util.Scanner;
import javax.swing.*;

public class MeetingDialog extends JFrame{
	
	public MeetingDialog(){
		// Set the title bar text.
	      setTitle("Name");

	      // Set the size of the window.
	      setSize(400, 200);

	      // Specify an action for the close button.
	      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	      // Add a FlowLayout manager to the content pane.
	      setLayout(new FlowLayout());

	      // Create three buttons.
	      JButton button1 = new JButton("Button 1");
	      JButton button2 = new JButton("Button 2");
	      JButton button3 = new JButton("Button 3");

	      // Add the three buttons to the content pane.
	      add(button1);
	      add(button2);
	      add(button3);

	      // Display the window.
	      setVisible(true);
	}

	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);

		//asks your name using an Input Dialog
		JFrame f = new JFrame("Input Dialog");
		String name = JOptionPane.showInputDialog(null,"Enter Your Name: ");
		
		//Uses a confirm dialog to confirm "is <name> your name?" with yes/no buttons
		JFrame c = new JFrame("Confirm Dialog");
		String rname = JOptionPane.showConfirmDialog(null, "is " + name + " your name?");
		JButton ybutton = new JButton("Yes");
		JButton nbutton = new JButton("No");

		//yes-should proceed to the next step
		
		//no- should bring the input dialog again
		
		
		//uses a message dialog to respond "nice to meet you <name>"
		
		
		user.close();

	}

}
