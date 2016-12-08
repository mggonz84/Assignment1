
import java.awt.*;
import javax.swing.*;

public class Scoreboard extends JFrame{
	public Scoreboard(){
		
		setTitle("JButton Scoreboard");
		setLayout(null);// can use new FlowLayout()
		setLocation(100,100);
		setSize(500,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Red
		/**
		JPanel RedTeam = new JPanel();
		RedTeam.setLocation(25,50);
		RedTeam.setLayout(null);
		RedTeam.setSize(100,200);
		add(RedTeam);
		**/
		JLabel label = new JLabel("Red Team");
		label.setBounds(100,10,200,80);//location(x,y) and size (height and length)
		label.setForeground(Color.RED);
		add(label);
		JLabel Rscore = new JLabel("0");
		Rscore.setBounds(120, 100, 200, 80);
		add(Rscore);
		JButton b = new JButton ("Red Score!");
		b.setLocation(25, 200);
		b.setSize(200,50);
		add(b);
		
		//Blue
		/**
		JPanel BlueTeam = new JPanel();
		BlueTeam.setLocation(260,30);
		BlueTeam.setLayout(null);
		BlueTeam.setSize(100,200);
		add(BlueTeam);
		**/
		JLabel label2 = new JLabel("BlueTeam");
		label2.setBounds(335,10,200,80);//location(x,y) and size (height and length)
		label2.setForeground(Color.BLUE);
		add(label2);
		JLabel Bscore = new JLabel("0");
		Bscore.setBounds(350, 100, 200, 80);
		add(Bscore);
		JButton r = new JButton ("Blue Score!");
		r.setLocation(260, 200);
		r.setSize(200,50);
		add(r);
		
		//Reset Button
		/**
		//JPanel p3 = new JPanel();
		//p3.setLocation(x, y);
		**/
		JButton s = new JButton ("Reset Score");
		s.setLocation(25, 280);
		s.setSize(435,50);
		add(s);
		
				
		
		setVisible(true);
	}
	public static void main (String []args)  {
		new Scoreboard();
		
	}

}
