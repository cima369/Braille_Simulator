package eecs2311simulator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimulatorRunner 
{
	public static void main (String [] args)
	{
		Simulator sim = new Simulator (true, 4, 2);
		
		sim.raisePin(0, 0);
		sim.raisePin(1, 3);
		sim.setCharToBraillePins(3, 'M');
		sim.setSize(500, 500);
		sim.getButton(1).removeActionListener(sim.getButton(1).getActionListeners()[0]);
		sim.getButton(1).addActionListener(new ActionListener()
		{
			public void actionPerformed (ActionEvent e)
			{
				System.out.println ("Yes");
			}
		});
	}

}
