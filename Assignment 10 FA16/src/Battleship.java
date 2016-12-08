
import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import java.awt.*;
import java.awt.event.*;

public class Battleship extends JFrame{
	
	//Legend
	JLabel hit;
	JLabel miss;
	JLabel kill;
	
	//***Field***
	//board
	JButton spaces[][] = new JButton[8][8];
	//letters
	JLabel letter;
	String[] n = {"a","b","c","d","e","f","g","h"};
	//num
	JLabel num;
	
	//***Ships***
	JButton Ship1;
	JButton Ship2[] = new JButton[2];
	JButton Ship3[] = new JButton[3];
	JButton Ship4[] = new JButton[4];
	
	//attempts
	int attempts = 0;
	
	public Battleship(){
		setTitle("Battleship Game");
		setLocation(25,25);
		setSize(900,700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Title
		JPanel title = new JPanel();
		add(title, BorderLayout.NORTH);
		title.add(new JLabel("Let's Play Battleship!"), BorderLayout.NORTH);
		
		//***Legend***
		//legend();
		
		//***Board***
		JPanel Board = new JPanel();
		Board.setLayout(new GridLayout(10,9));//9x9 
		add(Board);

		for(int m = 0; m <= n.length; m++)	//letters
		{
			if(m == 0)
			{
				letter = new JLabel("", SwingConstants.CENTER);
				Board.add(letter);
			}
			else
			{
				letter = new JLabel(n[m-1], SwingConstants.CENTER);
				Board.add(letter);
			}
		}
		
		//8X8 (buttons)
		for (int i=0; i<spaces.length; i++ )
		{	
			String n = Integer.toString(i + 1);
			num = new JLabel(n, SwingConstants.CENTER);
			Board.add(num);
		        
		    for (int j=0;j<spaces[i].length;j++)
		    {
		    	spaces[i][j] = new JButton();
		    	spaces[i][j].addActionListener(new ButtonAction());
		    	Board.add(spaces[i][j]);
		    }
		    
		}
		
		
		
		//***Ships***
		//overrides a space for the ships and make sure that they DON'T overlap
		
		//Ship1***
		Ship1 = spaces[(int)(Math.random()*8)][(int)(Math.random()*8)];
		
		//Ship2***
		//horizontal
		 if(Math.random()*1 < 0.5)
		 {
		 	int col = (int)(Math.random()*7);
		 	int row = (int)(Math.random()*8);
		 	for(int i = 0; i<Ship2.length; i++)
		 	{
		 		Ship2[i] = spaces[row][col+i];
		 		while(Ship2[i] == Ship1){
		 			col = (int)(Math.random()*7);
				 	row = (int)(Math.random()*8);
				 	i = 0;
		 			Ship2[i] = spaces[row][col+i];
		 		}
		 	}
		 } 
		 //vertical
		 else
		 {
		 	int col = (int)(Math.random()*8);
		 	int row = (int)(Math.random()*7);
		 	for(int i = 0; i<Ship2.length; i++)
		 	{
		 		Ship2[i] = spaces[row+i][col];
		 		while(Ship2[i] == Ship1){
		 			col = (int)(Math.random()*8);
				 	row = (int)(Math.random()*7);
				 	i = 0;
		 			Ship2[i] = spaces[row+i][col];
		 		}
		 	}
		 }
		 
		//Ship3***
		//horizontal
		 if(Math.random()*1 < 0.5)
		 {
		 	int col = (int)(Math.random()*6);
		 	int row = (int)(Math.random()*8);
		 	for(int i = 0; i<Ship3.length; i++)
		 	{
		 		Ship3[i] = spaces[row][col+i];
		 		while(Ship3[i] == Ship1 || Ship3[i] == Ship2[0] || Ship3[i] == Ship2[1])
		 		{
		 			col = (int)(Math.random()*6);
				 	row = (int)(Math.random()*8);
				 	i = 0;
		 			Ship3[i] = spaces[row][col+i];
		 		}
		 	}
		 } 
		 //vertical
		 else
		 {
		 	int col = (int)(Math.random()*8);
		 	int row = (int)(Math.random()*6);
		 	for(int i = 0; i<Ship3.length; i++)
		 	{
		 		Ship3[i] = spaces[row+i][col];
		 		while(Ship3[i] == Ship1 || Ship3[i] == Ship2[0] || Ship3[i] == Ship2[1])
		 		{
		 			col = (int)(Math.random()*8);
				 	row = (int)(Math.random()*6);
				 	i = 0;
		 			Ship3[i] = spaces[row+i][col+i];
		 		}
		 	}
		 }
		
		//Ship4***
		//horizontal
		 if(Math.random()*1 < 0.5)
		 {
		 	int col = (int)(Math.random()*5);
		 	int row = (int)(Math.random()*8);
		 	for(int i = 0; i < Ship4.length; i++)
		 	{
		 		Ship4[i] = spaces[row][col+i];
		 		while(Ship4[i] == Ship1 || Ship4[i] == Ship2[0] || Ship4[i] == Ship2[1] || Ship4[i] == Ship3[0] || Ship4[i] == Ship3[1] || Ship4[i] == Ship3[2])
		 		{
		 			col = (int)(Math.random()*5);
				 	row = (int)(Math.random()*8);
				 	i = 0;
		 			Ship4[i] = spaces[row][col+i];
		 		}
		 	}
		 } 
		 //vertical
		 else
		 {
		 	int col = (int)(Math.random()*8);
		 	int row = (int)(Math.random()*5);
		 	for(int i = 0; i < Ship4.length; i++)
		 	{
		 		
		 		Ship4[i] = spaces[row+i][col];
		 		
		 		while(Ship4[i] == Ship1 || Ship4[i] == Ship2[0] || Ship4[i] == Ship2[1] || Ship4[i] == Ship3[0] || Ship4[i] == Ship3[1] || Ship4[i] == Ship3[2])
		 		{
		 			col = (int)(Math.random()*8);
				 	row = (int)(Math.random()*5);
				 	i = 0;
		 			Ship4[i] = spaces[row+i][col];
		 		}
		 	}
		 }
		
		setVisible(true);
		
	}
	
	public class ButtonAction implements ActionListener{
		public void actionPerformed(ActionEvent e){
			//keep count of attempts
			attempts++;
			
			//if button selected is one of the ships, it will call upon the action
			((JButton)e.getSource()).setBackground(Color.BLUE);//any other button
			
			//Ship1***
			if(((JButton)e.getSource()) == Ship1)
			{
				Ship1.setBackground(Color.BLACK);
			}
			
			//Ship2***
			if(((JButton)e.getSource()) == Ship2[0] && Ship2[0].getBackground() != Color.BLACK)
			{
				Ship2[0].setBackground(Color.RED);
			}
			if(((JButton)e.getSource()) == Ship2[1] && Ship2[1].getBackground() != Color.BLACK)
			{
				Ship2[1].setBackground(Color.RED);
			}
			if(Ship2[0].getBackground() == Color.RED && Ship2[1].getBackground() == Color.RED)
			{
				Ship2[0].setBackground(Color.BLACK);
				Ship2[1].setBackground(Color.BLACK);
			}
			
			//Ship3***
			if(((JButton)e.getSource()) == Ship3[0] && Ship3[0].getBackground() != Color.BLACK)
			{
				Ship3[0].setBackground(Color.RED);
			}
			if(((JButton)e.getSource()) == Ship3[1] && Ship3[1].getBackground() != Color.BLACK)
			{
				Ship3[1].setBackground(Color.RED);
			}
			if(((JButton)e.getSource()) == Ship3[2] && Ship3[2].getBackground() != Color.BLACK)
			{
				Ship3[2].setBackground(Color.RED);
			}
			if(Ship3[0].getBackground() == Color.RED && Ship3[1].getBackground() == Color.RED && Ship3[2].getBackground() == Color.RED)
			{
				Ship3[0].setBackground(Color.BLACK);
				Ship3[1].setBackground(Color.BLACK);
				Ship3[2].setBackground(Color.BLACK);
			}
			
			//Ship4***
			if(((JButton)e.getSource()) == Ship4[0] && Ship4[0].getBackground() != Color.BLACK)
			{
				Ship4[0].setBackground(Color.RED);
			}
			if(((JButton)e.getSource()) == Ship4[1] && Ship4[1].getBackground() != Color.BLACK)
			{
				Ship4[1].setBackground(Color.RED);
			}
			if(((JButton)e.getSource()) == Ship4[2] && Ship4[2].getBackground() != Color.BLACK)
			{
				Ship4[2].setBackground(Color.RED);
			}
			if(((JButton)e.getSource()) == Ship4[3] && Ship4[3].getBackground() != Color.BLACK)
			{
				Ship4[3].setBackground(Color.RED);
			}
			if(Ship4[0].getBackground() == Color.RED && Ship4[1].getBackground() == Color.RED && Ship4[2].getBackground() == Color.RED && Ship4[3].getBackground() == Color.RED)
			{
				Ship4[0].setBackground(Color.BLACK);
				Ship4[1].setBackground(Color.BLACK);
				Ship4[2].setBackground(Color.BLACK);
				Ship4[3].setBackground(Color.BLACK);
			}
						
			//at the end of game
			//show message and # of attempts
			if(Ship1.getBackground() == Color.BLACK && Ship2[0].getBackground() == Color.BLACK && Ship2[1].getBackground() == Color.BLACK
			&& Ship3[0].getBackground() == Color.BLACK && Ship3[1].getBackground() == Color.BLACK && Ship3[2].getBackground() == Color.BLACK
			&& Ship4[0].getBackground() == Color.BLACK && Ship4[1].getBackground() == Color.BLACK && Ship4[2].getBackground() == Color.BLACK 
			&& Ship4[3].getBackground() == Color.BLACK)
			{
				JOptionPane.showMessageDialog(null, "Great job! You have killed all the ship!\nIt took you " + attempts + " tries.");
				System.exit(0);
			}
		}
	}
	
	public void legend ()
	{
		//Legend
		
		
		JPanel Legend = new JPanel();
		add(Legend, BorderLayout.EAST);
		Legend.setSize(200,200);
		
		JLabel legend = new JLabel("Legend", SwingConstants.CENTER);
		//add(legend, BorderLayout.EAST);
		JLabel legend1 = new JLabel("", SwingConstants.CENTER);
		
		Legend.setLayout(new GridLayout(4,2));
		
		hit = new JLabel("Hit = ", SwingConstants.CENTER);
		JPanel hitPanel = new JPanel();
		hitPanel.setBackground(Color.RED);
		miss = new JLabel("Miss = ", SwingConstants.CENTER);
		JPanel missPanel = new JPanel();
		missPanel.setBackground(Color.BLUE);
		kill = new JLabel("Kill = ", SwingConstants.CENTER);
		JPanel killPanel = new JPanel();
		killPanel.setBackground(Color.BLACK);
		
		Legend.add(legend);
		Legend.add(legend1);
		Legend.add(hit);
		Legend.add(hitPanel);
		Legend.add(miss);
		Legend.add(missPanel);
		Legend.add(kill);
		Legend.add(killPanel);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Battleship();
		
		
	}

}
