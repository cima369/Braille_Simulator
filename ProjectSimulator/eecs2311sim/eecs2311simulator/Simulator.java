package eecs2311simulator;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;
public class Simulator{
	
	private JFrame sim;
	private ArrayList <boolean []> cells;
	private ArrayList <JButton> buttons;
	private ArrayList <DrawingPanel> displays;

	public Simulator ()
	{
		this (true);
		display ();

	}
	
	public Simulator (boolean sixOrEight, int cells, int buttons)
	{
		this (sixOrEight);
		for (int i = 1; i < cells; i ++)
		{
			addCell (sixOrEight);
		}
		for (int i = 1; i < buttons; i ++)
		{
			addButton ();
		}
		display ();

	}
	
	public Simulator(boolean sixOrEight) 
	{
		sim = new JFrame ();
		sim.setSize (850, 650);
		sim.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		sim.setVisible(true);
		cells = new ArrayList <boolean []> ();
		buttons = new ArrayList <JButton> ();
		displays = new ArrayList <DrawingPanel> ();
		addCell (sixOrEight);
		addButton ();		
	}
	
	private void setListener (final JButton button)
	{
		button.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e)
			{
				button.setText("Has been clicked");
			}
		});
	}
	
	
	private void addCell (boolean sixOrEight)
	{
		if (sixOrEight)
		{
			cells.add(new boolean [8]);
		}
		else
		{
			cells.add(new boolean [6]);
		}
		displays.add(new DrawingPanel (displays.size()));
	}

	private void addButton ()
	{
		buttons.add(new JButton ("Option: " + (buttons.size() + 1)));
		setListener(buttons.get(buttons.size() - 1));
	}
	
	public void raisePin (int brailleCellNum, int pinNum)
	{
		cells.get(brailleCellNum)[pinNum] = true;
		display ();
	}
	
	public void lowerPin (int brailleCellNum, int pinNum)
	{
		cells.get(brailleCellNum)[pinNum] = false;
		display ();
	}
	
	public void reset (int brailleCellNum)
	{
		for (int i = 0; i < cells.get(brailleCellNum).length; i ++)
		{
			cells.get(brailleCellNum)[i] = false;
		}
		display ();
	}
	
	public void setCharToBraillePins (int brailleCellNum, char character)
	{
		if (cells.get(brailleCellNum).length == 8)
		{
			cells.set(brailleCellNum,Braille.charToBraille(true, character));
		}
		else
		{
			cells.set(brailleCellNum,Braille.charToBraille(false, character));
		}
		display ();
	}
	public boolean checkPinRaised (int brailleCellNum, int pinNum)
	{
		return cells.get(brailleCellNum)[pinNum];
	}
	
	
	public int getBrailleCellsSize ()
	{
		return cells.size ();
	}
	
	public int getButtonsSize ()
	{
		return buttons.size ();
	}
	
	private void display ()
	{
		sim.getContentPane().removeAll();
		sim.getContentPane().revalidate();
		sim.getContentPane().setLayout(new GridBagLayout ());
		
		GridBagConstraints c = new GridBagConstraints ();
		
		for (int i = 0; i < buttons.size(); i ++)
		{
			c.fill = GridBagConstraints.HORIZONTAL;
			c.insets = new Insets (30, 0, 0, 0);

			c.ipady = 50;
			c.weightx = 0.5;
			c.gridy = 1;
			c.gridx = i;
			sim.getContentPane().add(buttons.get(i), c);
		}
		
		for (int j = 0; j < displays.size (); j ++)
		{
			c.fill = GridBagConstraints.HORIZONTAL;
			c.insets = new Insets (0, 0, 30, 0);
			c.ipady = 0;
			c.weightx = 0.5;
			c.gridy = 0;
			c.gridx = j;
			sim.getContentPane().add(displays.get(j), c);
			displays.get(j).repaint();
		}
			
	}
	
	@SuppressWarnings("serial")
	private class DrawingPanel extends JPanel
	{
		private int num;
		public DrawingPanel (int num)
		{
			setBorder(BorderFactory.createLineBorder(Color.black));
			this.num = num;
		}
		
		@Override
		public Dimension getPreferredSize ()
		{
			return new Dimension(60, 220);
		}
		
		@Override
		public void paintComponent (Graphics g)
		{
			super.paintComponent(g);
			for (int i = 0; i < cells.get(num).length ; i ++)
			{
				if (cells.get(num)[i] == false)
				{
					g.drawOval(10 + (i % 2) * 60, 5 + (60)*(i/2), 30, 30);
				}
				else
				{
					g.fillOval(10 + (i % 2) * 60, 5 + (60)*(i/2), 30, 30);
				}
			}
		}
		
	}

}
