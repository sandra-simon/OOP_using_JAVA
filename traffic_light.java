/*Write a java program that simulates a traffic light. The program lets the user select one of three lights: red, yellow or green. When a radio button is selected, the light is turned on and only one light can be on at a time. No light is on when the program starts.*/


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Light extends JPanel implements ActionListener
{
	private JRadioButton r1, r2, r3;
	private Color red_c, yellow_c, green_c;

	public Light()
	{
		setBounds(0,0,640,480);
		setBackground(Color.WHITE);

		r1 = new JRadioButton("Red");
		r2 = new JRadioButton("Yellow");
		r3 = new JRadioButton("Green");

		red_c = getBackground();
		yellow_c = getBackground();
		green_c = getBackground();

		ButtonGroup gp = new ButtonGroup();
		gp.add(r1);
		gp.add(r2);
		gp.add(r3);

		setLayout(new FlowLayout());
		add(r1);
		add(r2);
		add(r3);

		r1.addActionListener(this);
		r2.addActionListener(this);
		r3.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e)
	{
		if(r1.isSelected() == true)
		{
			red_c = Color.red;
			yellow_c = getBackground();
			green_c = getBackground();
		}
		else if(r2.isSelected() == true)
		{
			red_c = getBackground();
			yellow_c = Color.yellow;
			green_c = getBackground();
		}
		else if(r3.isSelected() == true)
		{
			red_c = getBackground();
			yellow_c = getBackground();
			green_c = Color.green;
		}
		repaint();
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		g.drawOval(50,50,50,50);
		g.drawOval(50,110,50,50);
		g.drawOval(50,170,50,50);

		g.setColor(red_c);
		g.fillOval(50,50,50,50);
		g.setColor(yellow_c);
		g.fillOval(50,110,50,50);
		g.setColor(green_c);
		g.fillOval(50,170,50,50);
	}
}

public class TrafficLight
{
	public static void main(String args[])
	{
		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		f.setSize(640,480);
		f.setLayout(null);
		f.setVisible(true);

		Light t = new Light();
		f.add(t);
	}
}