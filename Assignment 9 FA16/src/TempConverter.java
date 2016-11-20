import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TempConverter extends JFrame{
	
	//final
	final JLabel label;
	final JTextField value;	//inserted value
	final JTextField cvalue;	//conversion
	final JRadioButton f;
	final JRadioButton c;
	
	public TempConverter(){
		setTitle("Temperature Converter");
		setLayout(new FlowLayout());// can use new FlowLayout()
		setLocation(100,100);
		setSize(700,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//labels, text fields, and radio buttons
		label = new JLabel("Enter a value in Celsius or Fahrenheit");
		label.setSize(200,80);
		
		value = new JTextField(5);	//inserted value
		cvalue = new JTextField(5);	//conversion

		f = new JRadioButton("Convert to fahrenheit");
		c = new JRadioButton("Convert to celsius");
		
		//action
		f.addActionListener(new RadioButtonListener());
	    c.addActionListener(new RadioButtonListener());
		
		//add to frame
		add(label);
		add(value);
		add(f);
		add(c);
		add(cvalue);
		
		setVisible(true);
	}
	
	private class RadioButtonListener implements ActionListener
	   {
	      public void actionPerformed(ActionEvent e)
	      {
	         String input;          // To hold input
	         double result = 0.0;   // To hold the conversion

	         // Get input from the text field.
	         input = value.getText();
	         
	         // Determine the button that was clicked and
	         // perform the selected conversion.
	         if (e.getSource() == f)
	         {
	        	 //c to f
	            result = Double.parseDouble(input) * 9 / 5 + 32;
	            //don't show button to be clicked
	            c.setSelected(false);
	         }
	         else if (e.getSource() == c)
	         {
	        	 //f to c
	            result = (Double.parseDouble(input) - 32) * 5 / 9;
	            //don't show button to be clicked
	            f.setSelected(false);
	         }

	         // Display the converted distance.
	         String convertion = Double.toString(result);
	         cvalue.setText(convertion);	//conversion
	         
	      }
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new  TempConverter();

	}

}
