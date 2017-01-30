package eecs2311simulator;

public class SimulatorRunner {

	
	// random changes
	public static void main (String [] args)
	{
		Simulator sim = new Simulator (true, " does this work");
		sim.addCell(true);
		sim.addCell(true);
		sim.addCell(true);
		sim.addCell(true);
		sim.addCell(true);
		
		sim.raisePin(0, 0);
		sim.raisePin(1, 3);
		sim.addButton(" Hello ");
		sim.addButton ();
		try
		{
			Thread.sleep(3000);
		}
		catch (Exception e)
		{
			
		}
	//	if (sim.checkPinRaised(0, 5) && sim.checkPinRaised(0, 0))
	//	{
	//		sim.lowerPin(0, 0);
	//	}
	}

}
