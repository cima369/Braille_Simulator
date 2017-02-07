package eecs2311simulator;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.*;

/**
 * A simulator that was designed to simulate the hardware of a device that will be used to teach young, vision-impaired 
 * adolescents how to read and understand Braille characters. <br>
 * <br>
 * The index of the cells start from 0 .. (number of cells - 1), where the total number of cells subtracted by 1 represents the last Braille cell
 * displayed on the simulator. <br>
 * The index of the JButtons start from 0 .. (number of JButtons - 1), where the total number of JButtons subtracted by 1 represent the last JButton
 * displayed on the simulator. <br>
 * <br>
 * In addition, the numbering of the cells starts from the left-most cell. <br>
 * The same applies to the JButtons, as numbering starts from the left-most JButton. <br>
 * <br>
 * For the pins of the Braille cells, the pin number starts at 0 which represents the top left pin while the bottom right pin represents the total number of
 * pins subtracted by 1. <br>
 * <br>
 * A visual image is included for both the 6 and 8 pins to understand how the pin numbers work: <br>
 *  &nbsp;&nbsp; <U>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </U>		<br>
 *  &nbsp;&nbsp; | &nbsp; 0 &nbsp;&nbsp; 1 &nbsp; | &nbsp;&nbsp;&nbsp; 8-pin Braille cell with corresponding pin numbering.	<br>
 *  &nbsp;&nbsp; | &nbsp; 2 &nbsp;&nbsp; 3 &nbsp; |		<br>
 *  &nbsp;&nbsp; | &nbsp; 4 &nbsp;&nbsp; 5 &nbsp; |		<br>
 *  &nbsp;&nbsp; <U> | &nbsp; 6 &nbsp;&nbsp; 7 &nbsp; | </U>		<br>
 *  <br>
 *  <br>
 *  &nbsp;&nbsp; <U>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; </U>		<br>
 *  &nbsp;&nbsp; | &nbsp; 0 &nbsp;&nbsp; 1 &nbsp; | &nbsp;&nbsp;&nbsp; 6-pin Braille cell with corresponding pin numbering.	<br>
 *  &nbsp;&nbsp; | &nbsp; 2 &nbsp;&nbsp; 3 &nbsp; |		<br>
 *  &nbsp;&nbsp; <U> | &nbsp; 4 &nbsp;&nbsp; 5 &nbsp; | </U>		<br>
 *  <br>
 * @author Team 3 of EECS 2311 Winter 2017
 *
 */
public class Simulator
{
	
	private JFrame sim;
	private ArrayList <boolean []> cells;
	private ArrayList <JButton> buttons;
	private ArrayList <DrawingPanel> displays;

	/**
	 * Creates a JFrame GUI with one 8-pin Braille cell and one JButton. <br>
	 * By default, all pins on the Braille cell are initially lowered.
	 */
	public Simulator ()
	{
		this (true);
		display ();

	}
	
	/**
	 * Creates a JFrame GUI with cellsNum number of 8-pin or 6-pin Braille cells and buttonsNum number of JButtons. <br>
	 * By default, all pins on the Braille cells are initially lowered.
	 * 
	 * @param sixOrEight Set to true for the Braille cells to be 8-pin or false for the Braille cells to be 6-pin
	 * @param cellsNum Number of Braille cells to be displayed
	 * @param buttonsNum Number of JButtons to be displayed
	 * @throws IllegalArgumentException If cellsNum or buttonsNum is &lt; 1
	 */
	public Simulator (boolean sixOrEight, int cellsNum, int buttonsNum) throws IllegalArgumentException
	{
		this (sixOrEight);
		if (cellsNum < 1 || buttonsNum < 1)
		{
			throw new IllegalArgumentException ("Error! Both cellsNum and buttonsNum have to be ingtegers >= 1.");
		}
		else
		{
			for (int i = 1; i < cellsNum; i ++)
			{
				addCell (sixOrEight);
			}
			for (int i = 1; i < buttonsNum; i ++)
			{
				addButton ();
			}
			display ();
		}

	}
	
	/**
	 * Creates a JFrame GUI with either one 8-pin or 6-pin Braille cell and one JButton. <br>
	 * By default, all pins on the Braille cell are initially lowered.
	 * 
	 * @param sixOrEight Set to true for an 8-pin Braille cell or false for a 6-pin Braille cell
	 */
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
				System.out.println ("This is the name of the button that was pressed: " + button.getText());
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
	
	/**
	 * Checks to see if the specified pin number at the specified Braille cell is raised.
	 * @param brailleCellNum The index of the Braille cell that contains the pin to be checked
	 * @param pinNum The index of the pin to be checked
	 * @return True if the specified pin is raised, false otherwise
	 * @throws IndexOutOfBoundsException If the index is out of range (index &lt; 0 || index &gt;= getBrailleCellsSize ())
	 */
	public boolean checkPinRaised (int brailleCellNum, int pinNum) throws IndexOutOfBoundsException
	{
		try
		{
			return cells.get(brailleCellNum)[pinNum];
		}
		catch (IndexOutOfBoundsException e)
		{
			throw new IndexOutOfBoundsException ("Error, incorrect input! Must be in the range of 0 .. " + 
					(getBrailleCellsSize() - 1)+ ". Index: " + brailleCellNum +", Size: " + getBrailleCellsSize());
		}
	}
	
	/**
	 * Returns the total number of Braille cells that are being displayed.
	 * @return The total number of Braille cells. Total number of Braille cells is &gt;= 1
	 */
	public int getBrailleCellsSize ()
	{
		return cells.size ();
	}
	
	/**
	 * Returns access to the individual JButton objects
	 * @param buttonNum The index of the JButton to get
	 * @return The JButton object at the specified position
	 * @throws IndexOutOfBoundsException If the index is out of range (buttonNum &lt; 0 || buttonNum &gt;= getButtonsSize ())
	 */
	public JButton getButton (int buttonNum) throws IndexOutOfBoundsException
	{
		try
		{
			return buttons.get(buttonNum);
		}
		catch (IndexOutOfBoundsException e)
		{
			throw new IndexOutOfBoundsException ("Error, incorrect input! Must be in the range of 0 .. " + 
					(getButtonsSize() - 1) +  ". Index: " + buttonNum +", Size: " + getButtonsSize());
		}
	}
	
	/**
	 * Returns the total number of JButtons that are being displayed.
	 * @return The total number of JButtons. Total number of JButtons is &gt;= 1
	 */
	public int getButtonsSize ()
	{
		return buttons.size ();
	}
	
	/**
	 * Returns the size of the JFrame.
	 * @return Size of the JFrame storing the visual elements
	 */
	public Dimension getSize ()
	{
		return sim.getSize();
	}
	
	/**
	 * Lowers the pin of the specified pin at the specified Braille cell. <br>
	 * @param brailleCellNum The index of the Braille cell that contains the pin to be lowered
	 * @param pinNum The index of the pin to lower
	 * @throws IndexOutOfBoundsException If the index is out of range (indexCell &lt; 0 || indexCell &gt;= getBrailleCellsSize ()) <br>
	 * Or if the index of the pin is out of range (indexPin &lt; 0 || indexPin &gt;= 8) for 8 pin cells or (indexPin &lt; 0 || indexPin &gt;= 6) for 6 pin cells
	 */
	public void lowerPin (int brailleCellNum, int pinNum) throws IndexOutOfBoundsException
	{
		try
		{
			cells.get(brailleCellNum)[pinNum] = false;
			display ();
		}
		catch (IndexOutOfBoundsException e)
		{
			throw new IndexOutOfBoundsException ("Error, incorrect input! Must be in the range of 0 .. " + 
					(getBrailleCellsSize() - 1) +  ". Index: " + brailleCellNum +", Size: " + getBrailleCellsSize() + ". <br> Or number of pins must be in the range of 0 .. 5 or 0 .. 7"
							+ "for 6 or 8 pin cells respectively." );
		}
	}
	
	/**
	 * Raises the pin of the specified pin at the specified Braille cell. <br>
	 * @param brailleCellNum The index of the Braille cell that contains the pin to be raised
	 * @param pinNum The index of the pin to raise
	 * @throws IndexOutOfBoundsException If the index is out of range (indexCell &lt; 0 || indexCell &gt;= getBrailleCellsSize ()) <br>
	 * Or if the index of the pin is out of range (indexPin &lt; 0 || indexPin &gt;= 8) for 8 pin cells or (indexPin &lt; 0 || indexPin &gt;= 6) for 6 pin cells
	 */
	public void raisePin (int brailleCellNum, int pinNum)throws IndexOutOfBoundsException
	{
		try
		{
			cells.get(brailleCellNum)[pinNum] = true;
			display ();
		}
		catch (IndexOutOfBoundsException e)
		{
			throw new IndexOutOfBoundsException ("Error, incorrect input! Must be in the range of 0 .. " + 
					(getBrailleCellsSize() - 1) +  ". <br> Or number of pins must be in the range of 0 .. 5 or 0 .. 7"
							+ "for 6 or 8 pin cells respectively." );
		}
		
	}
	
	
	/** 
	 * Lowers all the pins of the specified Braille cell, thereby resetting it back to its original state.
	 *
	 * @param brailleCellNum The index of the Braille cell to reset the pins to lowered
	 * @throws IndexOutOfBoundsException If the index is out of range (index &lt; 0 || index &gt;= getBrailleCellsSize ())
	 */
	public void reset (int brailleCellNum) throws IndexOutOfBoundsException
	{
		try
		{
			for (int i = 0; i < cells.get(brailleCellNum).length; i ++)
			{
				cells.get(brailleCellNum)[i] = false;
			}
			display ();
		}
		catch (IndexOutOfBoundsException e)
		{
			throw new IndexOutOfBoundsException ("Error, incorrect input! Must be in the range of 0 .. " + 
					(getBrailleCellsSize() - 1)+ ". Index: " + brailleCellNum +", Size: " + getBrailleCellsSize());
		}
		
	}
	
	/**
	 * Sets the corresponding Braille character for the specified letter for the specified Braille cell.
	 * @param brailleCellNum The index of the Braille cell to display the Braille character
	 * @param character The English letter to be displayed onto the Braille cell
	 * @throws IndexOutOfBoundsException If the index is out of range (index &lt; 0 || index &gt;= getBrailleCellsSize ())
	 * @throws IllegalArgumentException If the input of character is not a valid letter of the English alphabet
	 */
	public void setCharToBraillePins (int brailleCellNum, char character) throws IndexOutOfBoundsException, IllegalArgumentException
	{
		try
		{
			if ((character < 65 || character > 90) && (character < 97 || character > 122 ))
			{
				throw new IllegalArgumentException ("Error! Input of char is not a valid letter of the English alphabet.");
			}
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
		catch (IndexOutOfBoundsException e)
		{
			throw new IndexOutOfBoundsException ("Error, incorrect input! Must be in the range of 0 .. " + 
					(getBrailleCellsSize() - 1)+ ". Index: " + brailleCellNum +", Size: " + getBrailleCellsSize());
		}
	}
	
	
	/**
	 * Changes the size of the window of the simulator.
	 * @param width The width of the window to be changed to
	 * @param height The height of the window to be changed to
	 * @throws IllegalArgumentException Width must be at least 500 and height must be at least 500
	 */
	public void setSize (int width, int height) throws IllegalArgumentException
	{
		try
		{
			if (width < 500 || height < 500)
			{
				throw new IllegalArgumentException ("Error! Width must be at least 500 and/or height must be at least 500. ");
			}
			sim.setSize(new Dimension (width, height));
		}
		catch (IllegalArgumentException e)
		{
			throw new IllegalArgumentException ("Error! Width must be at least 500 and/or height must be at least 500. ");

		}
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
