/*
	CS1: Program 6
	First GUI
	Semester: 1

	Kaden Scroggins
	CS-1113-60992

	Simple GUI with movable elements
*/

import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics.*;
import javax.swing.*;
import javax.imageio.*;

public class Program7 extends JFrame implements ActionListener, MouseListener, MouseMotionListener
{
	public JButton oval = new JButton("Oval");
	public JButton picture = new JButton("Picture");
	public JButton reset = new JButton("Center");
	public JButton unique = new JButton("Kaden Scroggins");
	public boolean ovalVis = true;
	public boolean picVis = false;
	public double picx = 350;
	public double picy = 250;
	public double ovalx = 350;
	public double ovaly = 300;
	public double ovalh = 50;
	public double ovalw = 100;
	public Image dog;
	public boolean flip = false;

	public Program7()
	{
		super("Kaden Scroggins");
		Container cPane = this.getContentPane();

		this.setSize(800,600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		cPane.setLayout(new BorderLayout());
		cPane.setBackground(new Color(27,125,182));

		JPanel buttons = new JPanel();
		buttons.setLayout(new GridLayout(0,4));
		buttons.add(oval);
		oval.addActionListener(this);
		oval.setActionCommand("oval");
		buttons.add(picture);
		picture.addActionListener(this);
		picture.setActionCommand("picture");
		buttons.add(reset);
		reset.addActionListener(this);
		reset.setActionCommand("reset");
		buttons.add(unique);
		unique.addActionListener(this);
		unique.setActionCommand("unique");

		cPane.add(buttons, BorderLayout.NORTH);

		this.addMouseListener(this);
		this.addMouseMotionListener(this);

		try
		{
			dog = ImageIO.read(new File("dog.png"));
		}
		catch (IOException e)
		{
			e.printStackTrace();
			System.out.println("Dog not found");
			System.exit(0);
		}

	}

	public void paint(Graphics g)
	{
		super.paint(g);
		g.setColor(new Color(255,255,255));
		//if (ovalVis) g.drawOval(200, 200, (int)ovalw, (int)ovalh);
		if (ovalVis) 
		{
			g.fillOval((int)ovalx, (int)ovaly, (int)ovalw, (int)ovalh);

		}
		//if (picVis) g.drawImage(dog, 400, 400, null);
		if (picVis) g.drawImage(dog, (int)picx, (int)picy, null);
	}

	public void actionPerformed(ActionEvent event)
	{
		if (event.getActionCommand().equals("oval"))
		{
			ovalVis = true;
			picVis = false;
			repaint();
		}
		else if (event.getActionCommand().equals("picture"))
		{
			ovalVis = false;
			picVis = true;
			repaint();
		}
		else if (event.getActionCommand().equals("reset"))
		{
			ovalx = 350;
			ovaly = 300;
			picx = 350;
			picy = 250;
			repaint();
		}
		else if (event.getActionCommand().equals("unique"))
		{
			if (!flip)
			{
				try
				{
					dog = ImageIO.read(new File("flip.png"));
				}
				catch (IOException e)
				{
					e.printStackTrace();
					System.out.println("Flipped dog not found");
					System.exit(0);
				}
				flip = true;
			}
			else
			{
				flip = false;
				try
				{
					dog = ImageIO.read(new File("dog.png"));
				}
				catch (IOException e)
				{
					e.printStackTrace();
					System.out.println("Dog not found");
					System.exit(0);
				}
			}
			repaint();
		}
		//System.out.println(event.getActionCommand());
		//System.out.println(ovalVis + " " + picVis);
	}

	public void mouseEntered(MouseEvent event) {}
	public void mouseExited(MouseEvent event) {}
	public void mousePressed(MouseEvent event) {}
	public void mouseClicked(MouseEvent event) {}
	public void mouseReleased(MouseEvent event) {}
	public void mouseMoved(MouseEvent event) {}
	public void mouseDragged(MouseEvent event)
	{
		//System.out.println("Mouse Dragged");
		if (ovalVis)
		{
			ovalx = event.getX();
			ovaly = event.getY();
			repaint();
		}
		else if (picVis)
		{
			picx = event.getX();
			picy = event.getY();
			repaint();
		}
		//System.out.println("x = " + event.getX() + ", y = " + event.getY());
	}

	public static void main(String[] args)
	{
		Program7 gui = new Program7();
		gui.setVisible(true);
		//System.out.println("WE HAVE ACTIVATED THE GOOEY");
	}
}
