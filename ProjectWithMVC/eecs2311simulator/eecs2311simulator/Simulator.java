package eecs2311simulator;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;
@SuppressWarnings("serial")
public class Simulator extends JFrame {

	//private boolean sixOrEight;
	private ArrayList <boolean []> cells;
	private ArrayList <JButton> buttons;
	private ArrayList <DrawingPanel> displays;
	
	public Simulator ()
	{
		this (true);
	}
	
	public Simulator (boolean sixOrEight, String text)
	{
		this (sixOrEight);
		buttons.get(0).setText(text);
	}
	public Simulator(boolean sixOrEight) 
	{
		cells = new ArrayList <boolean []> ();
		buttons = new ArrayList <JButton> ();
		displays = new ArrayList <DrawingPanel> ();
		addCell (sixOrEight);
		addButton ();
		display ();
//		option1.setSize(new Dimension (80, 100));
//		option2.setSize(new Dimension (80, 100));
//		option3.setSize(new Dimension (80, 100));
//		getContentPane().setLayout(new GridBagLayout());
//		c = new GridBagConstraints ();
//		c.fill = GridBagConstraints.HORIZONTAL;
//		c.ipady = 0;
//		c.weightx = 0.5;
//		c.gridy = 0;
//		addComponentsToPane (getContentPane());
//		setListener (option1);
//		setListener (option2);
//		setListener (option3);
		
		setSize (850, 650);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
/*
	private void addComponentsToPane (Container pane)
	{
		pane.setLayout (new GridBagLayout ());
	//	GridBagConstraints c = new GridBagConstraints ();
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.ipady = 40;
		c.weightx = 0.5;
		c.gridy = 1;
		c.gridx = 0;
		pane.add(option1, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.5;
		c.gridy = 1;
		c.gridx = 1;
		pane.add(option2, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.5;
		c.gridy = 1;
		c.gridx = 2;
		pane.add(option3, c);
		
		c.fill = GridBagConstraints.HORIZONTAL;
		c.insets = new Insets (0, 0, 10, 0);
		c.ipady = 0;
		c.weightx = 0.5;
		c.gridy = 0;
		c.gridx = 0;
		pane.add(drawP, c);
	}
	

	public void setChoices8 (char ans)
	{
		brailleChoices = Braille.getChoices8(ans);
		answer = brailleChoices[0];
		option1.setText(Braille.convert(brailleChoices[1]));
		option2.setText(Braille.convert(brailleChoices[2]));
		option3.setText(Braille.convert(brailleChoices[3]));
		drawP.repaint(); 
		setChoices (ans, 8);
	}
	
	public void setChoices6 (char ans)
	{
		setChoices (ans, 6);
	}
	
	
	private void setChoices (char ans, int braillePins)
	{
		correct = false;
		this.braillePins = braillePins;
		if (braillePins == 6)
		{
			brailleChoices = Braille.getChoices6(ans);
		}
		else
		{
			brailleChoices = Braille.getChoices8(ans);
		}
		answer = brailleChoices[0];
		option1.setText(Braille.convert(brailleChoices[1]));
		option2.setText(Braille.convert(brailleChoices[2]));
		option3.setText(Braille.convert(brailleChoices[3]));
		drawP.repaint();
	} */
	
	/*
	public String getAnswer ()
	{
		return Braille.convert(answer);
	}
	
	public boolean checkAnswer ()
	{
		return correct;
	} */
	
	
	private void setListener (JButton button)
	{
		button.addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e)
			{
			/*	if (button.getText().equals(getAnswer()))
				{
					correct = true;
				}
				else
				{
					correct = false;
				} */
				button.setText("Has been clicked");
			}
		});
	}
	
	
	public void addCell (boolean sixOrEight)
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
		display ();
	}

	public void addButton ()
	{
		addButton ("Option: " + (buttons.size() + 1));
	}
	
	public void addButton (String text)
	{
		buttons.add (new JButton (text));
		setListener (buttons.get(buttons.size() - 1));
		display ();
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
	
	public boolean checkPinRaised (int brailleCellNum, int pinNum)
	{
		return cells.get(brailleCellNum)[pinNum];
	}
	
	
	public int getBrailleCellsSize ()
	{
		return cells.size ();
	}
	
	private void display ()
	{
		getContentPane().removeAll();
		getContentPane().revalidate();
		getContentPane().setLayout(new GridBagLayout ());
		
		GridBagConstraints c = new GridBagConstraints ();
		
		for (int i = 0; i < buttons.size(); i ++)
		{
			c.fill = GridBagConstraints.HORIZONTAL;
			c.insets = new Insets (30, 0, 0, 0);

			c.ipady = 50;
			c.weightx = 0.5;
			c.gridy = 1;
			c.gridx = i;
			getContentPane().add(buttons.get(i), c);
		}
		
		for (int j = 0; j < displays.size (); j ++)
		{
			c.fill = GridBagConstraints.HORIZONTAL;
			c.insets = new Insets (0, 0, 30, 0);
			c.ipady = 0;
			c.weightx = 0.5;
			c.gridy = 0;
			c.gridx = j;
			getContentPane().add(displays.get(j), c);
			displays.get(j).repaint();
		}
			
	}
	
	private class DrawingPanel extends JPanel
	{
		private int num;
		public DrawingPanel (int num)
		{
			setBorder(BorderFactory.createLineBorder(Color.black));
			this.num = num;
		}
		
		public Dimension getPreferredSize ()
		{
			return new Dimension(60, 220);
		}
		
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
