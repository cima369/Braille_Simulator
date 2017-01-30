package eecs2311simulator;

public class SimulatorRunner {

	public static void main (String [] args)
	{
		Simulator sim = new Simulator (false, " does this work");
		sim.addCell(false);
		sim.addCell(false);
		sim.raisePin(0, 0);
		sim.raisePin(0, 5);
		sim.addButton(" Hello ");
		sim.addButton ();
		try
		{
			Thread.sleep(3000);
		}
		catch (Exception e)
		{
			
		}
		if (sim.checkPinRaised(0, 5) && sim.checkPinRaised(0, 0))
		{
			sim.lowerPin(0, 0);
		}
	}

}
