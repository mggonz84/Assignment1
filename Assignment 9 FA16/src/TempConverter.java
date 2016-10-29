import javax.swing.*;
import java.awt.*;

public class TempConverter extends JFrame{
	public TempConverter(){
		setTitle("Temperature Converter");
		setLayout(new FlowLayout());// can use new FlowLayout()
		setLocation(100,100);
		setSize(700,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel label = new JLabel("Enter a value in Celsius or Fahrenheit");
		label.setSize(200,80);
		add(label);
		
		JTextField value = new JTextField("", 5);
		add(value);
		
		JRadioButton f = new JRadioButton("Convert to fahrenheit");
		add(f);
		
		JRadioButton c = new JRadioButton("Convert to celsius");
		add(c);
		
		JTextField cvalue = new JTextField("", 5);
		add(cvalue);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new  TempConverter();

	}

}
