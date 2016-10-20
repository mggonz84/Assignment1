import java.awt.*;
import javax.swing.*;

public class ColorPanels extends JFrame{
	public ColorPanels (){
		setTitle("Color Panels");
		setLayout(null);
		setLocation (100,200);
		setSize (745, 500);
		setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("RED");
		label.setBounds(120,10,200,80);
		label.setForeground(Color.RED);
		add(label);
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground (Color.RED);
		panel.setLocation(25,75);
		panel.setSize(200,200);
		add(panel);
		JButton b = new JButton ("RED");
		b.setBounds(75,325,100,50);
		add(b);
		
		JLabel label2 = new JLabel("BLUE");
		label2.setBounds(345,10,200,80);
		label2.setForeground(Color.BLUE);
		add(label2);
		JPanel panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setBackground (Color.BLUE);
		panel2.setLocation(260,75);
		panel2.setSize(200, 200);
		add(panel2);
		JButton b2 = new JButton ("BLUE");
		b2.setBounds(315,325,100,50);
		add(b2);		
		
		JLabel label3 = new JLabel("YELLOW");
		label3.setBounds(575,10,200,80);
		label3.setForeground(Color.YELLOW);
		add(label3);
		JPanel panel3 = new JPanel();
		panel3.setLayout(null);
		panel3.setBackground (Color.YELLOW);
		panel3.setLocation(495 ,75);
		panel3.setSize(200, 200);
		add(panel3);
		JButton b3 = new JButton ("YELLOW");
		b3.setBounds(550,325,100,50);
		add(b3);
		
		setVisible (true);
	}
	public static void main (String []args)  {
		new ColorPanels();
		
	}

}
