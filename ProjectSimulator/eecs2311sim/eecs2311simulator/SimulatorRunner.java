package eecs2311simulator;

public class SimulatorRunner {

	//dsads
	// random 
	// change
	public static void main (String [] args)
	{
		Simulator sim = new Simulator (true, 4, 2);
		
		sim.raisePin(0, 0);
		sim.raisePin(1, 3);
		sim.setCharToBraillePins(3, 'M');
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
