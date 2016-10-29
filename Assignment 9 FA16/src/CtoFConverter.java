import java.awt.*;
import java.util.Scanner;

import javax.swing.*;

public class CtoFConverter extends JFrame{
	public CtoFConverter(){
		setTitle("Temperature Converter");
		setLayout(new FlowLayout());// can use new FlowLayout()
		setLocation(100,100);
		setSize(450,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Celsius to Fahrenheit
		
		//JPanel panel = new JPanel();
		
		//Celsius
		JLabel c = new JLabel("Celsius: ");
		c.setSize(200,80);
		add(c);
		
		JTextField ctemp = new JTextField("",5);
		//int cnum = Integer.parseInt(ctemp.getText());
		add(ctemp);

		//Fahrenheit
		JLabel f = new JLabel("Fahrenheit: ");
		f.setSize(200,80);
		add(f);
		
		//how to calculate
		//int fnum = 9 / 5 * cnum + 32;
		
		//how to show ftemp
		JTextField ftemp = new JTextField("",5);	
		add(ftemp);
		
		JButton convert = new JButton("Convert");
		convert.setSize(200,80);
		add(convert);
		
		
		setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner user = new Scanner(System.in);
		
		//convert c to f
		//F = (9/5) C + 32
		
		new CtoFConverter();
		
	}

}
