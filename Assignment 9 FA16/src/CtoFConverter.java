import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CtoFConverter extends JFrame{
	
	//final
	final JLabel c;
	final JLabel f;
	final JTextField ctemp;
	final JTextField ftemp;
	final JButton convert;
	
	public CtoFConverter(){
		setTitle("Temperature Converter");
		setLayout(new FlowLayout());// can use new FlowLayout()
		setLocation(100,100);
		setSize(450,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Celsius to Fahrenheit
				
		//Celsius
		c = new JLabel("Celsius: ");
		c.setSize(200,80);
		add(c);
		
		ctemp = new JTextField(5);
		add(ctemp);

		//Fahrenheit
		f = new JLabel("Fahrenheit: ");
		f.setSize(200,80);
		add(f);
		
		//show ftemp
		ftemp = new JTextField(5);	
		add(ftemp);
		
		convert = new JButton("Convert");
		convert.setSize(200,80);
		convert.addActionListener(new RadioButtonListener());
		add(convert);
		
		
		setVisible(true);
		
	}
	
	private class RadioButtonListener implements ActionListener
	   {
	      public void actionPerformed(ActionEvent e)
	      {
	         String input;          // To hold input
	         double result = 0.0;   // To hold the conversion

	         // Get input from the text field.
	         input = ctemp.getText();
	         
	       //performs the conversion when button is pressed
	         
	        	//convert c to f
	     		//F = (9/5) C + 32
	            result = Double.parseDouble(input) * 9 / 5 + 32;

	         // Display the converted distance.
	         String convertion = Double.toString(result);
	         ftemp.setText(convertion);	//conversion
	         
	      }
	   }

	public static void main(String[] args) {
		
		new CtoFConverter();
		
	}

}
