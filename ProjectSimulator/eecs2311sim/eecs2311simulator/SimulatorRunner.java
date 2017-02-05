package eecs2311simulator;

public class SimulatorRunner {

	// testing
	// change
	public static void main (String [] args)
	{
		Simulator sim = new Simulator (true, 4, 2);
		
		sim.raisePin(0, 0);
		sim.raisePin(1, 3);
		sim.setCharToBraillePins(3, 'M');
		sim.setButtonText(1, "hello");
	//	sim.lowerPin(4, 2);
	//	sim.reset(5);
		sim.setSize(500, 500);
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
