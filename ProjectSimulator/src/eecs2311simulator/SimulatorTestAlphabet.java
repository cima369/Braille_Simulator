package eecs2311simulator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SimulatorTestAlphabet {

	Simulator panel;
	
	@Before
	public void setUp() throws Exception {
		panel = new Simulator (true, 5, 2);
	}

	@Test
	public void testCharConvert1(){
	
	panel.setCharToBraillePins(0, 'a');
	assertEquals(panel.checkPinRaised(0, 0), true);
	assertEquals(panel.checkPinRaised(0, 1), false);
	assertEquals(panel.checkPinRaised(0, 2), false);
	assertEquals(panel.checkPinRaised(0, 3), false);
	assertEquals(panel.checkPinRaised(0, 4), false);
	assertEquals(panel.checkPinRaised(0, 5), false);
	assertEquals(panel.checkPinRaised(0, 6), false);
	assertEquals(panel.checkPinRaised(0, 7), false);
	
	panel.setCharToBraillePins(1, 'b');
	assertEquals(panel.checkPinRaised(1, 0), true);
	assertEquals(panel.checkPinRaised(1, 1), false);
	assertEquals(panel.checkPinRaised(1, 2), false);
	assertEquals(panel.checkPinRaised(1, 3), true);
	assertEquals(panel.checkPinRaised(1, 4), false);
	assertEquals(panel.checkPinRaised(1, 5), false);
	assertEquals(panel.checkPinRaised(1, 6), false);
	assertEquals(panel.checkPinRaised(1, 7), false);
	
	panel.setCharToBraillePins(2, 'c');
	assertEquals(panel.checkPinRaised(2, 0), true);
	assertEquals(panel.checkPinRaised(2, 1), false);
	assertEquals(panel.checkPinRaised(2, 2), false);
	assertEquals(panel.checkPinRaised(2, 3), false);
	assertEquals(panel.checkPinRaised(2, 4), false);
	assertEquals(panel.checkPinRaised(2, 5), true);
	assertEquals(panel.checkPinRaised(2, 6), false);
	assertEquals(panel.checkPinRaised(2, 7), false);
	
	panel.setCharToBraillePins(3, 'd');
	assertEquals(panel.checkPinRaised(3, 0), true);
	assertEquals(panel.checkPinRaised(3, 1), false);
	assertEquals(panel.checkPinRaised(3, 2), false);
	assertEquals(panel.checkPinRaised(3, 3), false);
	assertEquals(panel.checkPinRaised(3, 4), false);
	assertEquals(panel.checkPinRaised(3, 5), false);
	assertEquals(panel.checkPinRaised(3, 6), false);
	assertEquals(panel.checkPinRaised(3, 7), true);
	
	panel.setCharToBraillePins(4, 'e');
	assertEquals(panel.checkPinRaised(4, 0), false);
	assertEquals(panel.checkPinRaised(4, 1), false);
	assertEquals(panel.checkPinRaised(4, 2), true);
	assertEquals(panel.checkPinRaised(4, 3), false);
	assertEquals(panel.checkPinRaised(4, 4), false);
	assertEquals(panel.checkPinRaised(4, 5), false);
	assertEquals(panel.checkPinRaised(4, 6), false);
	assertEquals(panel.checkPinRaised(4, 7), false);
	
	panel.setCharToBraillePins(0, 'f');
	assertEquals(panel.checkPinRaised(0, 0), false);
	assertEquals(panel.checkPinRaised(0, 1), false);
	assertEquals(panel.checkPinRaised(0, 2), true);
	assertEquals(panel.checkPinRaised(0, 3), true);
	assertEquals(panel.checkPinRaised(0, 4), false);
	assertEquals(panel.checkPinRaised(0, 5), false);
	assertEquals(panel.checkPinRaised(0, 6), false);
	assertEquals(panel.checkPinRaised(0, 7), false);
	
	panel.setCharToBraillePins(1, 'g');
	assertEquals(panel.checkPinRaised(1, 0), false);
	assertEquals(panel.checkPinRaised(1, 1), false);
	assertEquals(panel.checkPinRaised(1, 2), true);
	assertEquals(panel.checkPinRaised(1, 3), false);
	assertEquals(panel.checkPinRaised(1, 4), false);
	assertEquals(panel.checkPinRaised(1, 5), true);
	assertEquals(panel.checkPinRaised(1, 6), false);
	assertEquals(panel.checkPinRaised(1, 7), false);
	
	panel.setCharToBraillePins(2, 'h');
	assertEquals(panel.checkPinRaised(2, 0), false);
	assertEquals(panel.checkPinRaised(2, 1), false);
	assertEquals(panel.checkPinRaised(2, 2), true);
	assertEquals(panel.checkPinRaised(2, 3), false);
	assertEquals(panel.checkPinRaised(2, 4), false);
	assertEquals(panel.checkPinRaised(2, 5), false);
	assertEquals(panel.checkPinRaised(2, 6), false);
	assertEquals(panel.checkPinRaised(2, 7), true);
	
	panel.setCharToBraillePins(3, 'i');
	assertEquals(panel.checkPinRaised(3, 0), false);
	assertEquals(panel.checkPinRaised(3, 1), false);
	assertEquals(panel.checkPinRaised(3, 2), false);
	assertEquals(panel.checkPinRaised(3, 3), false);
	assertEquals(panel.checkPinRaised(3, 4), true);
	assertEquals(panel.checkPinRaised(3, 5), false);
	assertEquals(panel.checkPinRaised(3, 6), false);
	assertEquals(panel.checkPinRaised(3, 7), false);
	
	panel.setCharToBraillePins(4, 'j');
	assertEquals(panel.checkPinRaised(4, 0), false);
	assertEquals(panel.checkPinRaised(4, 1), false);
	assertEquals(panel.checkPinRaised(4, 2), false);
	assertEquals(panel.checkPinRaised(4, 3), true);
	assertEquals(panel.checkPinRaised(4, 4), true);
	assertEquals(panel.checkPinRaised(4, 5), true);
	assertEquals(panel.checkPinRaised(4, 6), false);
	assertEquals(panel.checkPinRaised(4, 7), false);
	
	panel.setCharToBraillePins(0, 'k');
	assertEquals(panel.checkPinRaised(0, 0), false);
	assertEquals(panel.checkPinRaised(0, 1), false);
	assertEquals(panel.checkPinRaised(0, 2), false);
	assertEquals(panel.checkPinRaised(0, 3), false);
	assertEquals(panel.checkPinRaised(0, 4), true);
	assertEquals(panel.checkPinRaised(0, 5), true);
	assertEquals(panel.checkPinRaised(0, 6), false);
	assertEquals(panel.checkPinRaised(0, 7), true);
	
	panel.setCharToBraillePins(1, 'l');
	assertEquals(panel.checkPinRaised(1, 0), false);
	assertEquals(panel.checkPinRaised(1, 1), false);
	assertEquals(panel.checkPinRaised(1, 2), false);
	assertEquals(panel.checkPinRaised(1, 3), true);
	assertEquals(panel.checkPinRaised(1, 4), true);
	assertEquals(panel.checkPinRaised(1, 5), false);
	assertEquals(panel.checkPinRaised(1, 6), false);
	assertEquals(panel.checkPinRaised(1, 7), false);
	
	panel.setCharToBraillePins(2, 'm');
	assertEquals(panel.checkPinRaised(2, 0), false);
	assertEquals(panel.checkPinRaised(2, 1), false);
	assertEquals(panel.checkPinRaised(2, 2), false);
	assertEquals(panel.checkPinRaised(2, 3), false);
	assertEquals(panel.checkPinRaised(2, 4), true);
	assertEquals(panel.checkPinRaised(2, 5), true);
	assertEquals(panel.checkPinRaised(2, 6), false);
	assertEquals(panel.checkPinRaised(2, 7), false);
	}
	
	@Test
	public void testCharConvert2(){
		
	panel.setCharToBraillePins(3, 'n');
	assertEquals(panel.checkPinRaised(3, 0), false);
	assertEquals(panel.checkPinRaised(3, 1), false);
	assertEquals(panel.checkPinRaised(3, 2), false);
	assertEquals(panel.checkPinRaised(3, 3), false);
	assertEquals(panel.checkPinRaised(3, 4), true);
	assertEquals(panel.checkPinRaised(3, 5), false);
	assertEquals(panel.checkPinRaised(3, 6), false);
	assertEquals(panel.checkPinRaised(3, 7), true);
	
	panel.setCharToBraillePins(4, 'o');
	assertEquals(panel.checkPinRaised(4, 0), false);
	assertEquals(panel.checkPinRaised(4, 1), false);
	assertEquals(panel.checkPinRaised(4, 2), false);
	assertEquals(panel.checkPinRaised(4, 3), false);
	assertEquals(panel.checkPinRaised(4, 4), false);
	assertEquals(panel.checkPinRaised(4, 5), false);
	assertEquals(panel.checkPinRaised(4, 6), true);
	assertEquals(panel.checkPinRaised(4, 7), false);
	
	panel.setCharToBraillePins(0, 'p');
	assertEquals(panel.checkPinRaised(0, 0), false);
	assertEquals(panel.checkPinRaised(0, 1), false);
	assertEquals(panel.checkPinRaised(0, 2), false);
	assertEquals(panel.checkPinRaised(0, 3), true);
	assertEquals(panel.checkPinRaised(0, 4), false);
	assertEquals(panel.checkPinRaised(0, 5), true);
	assertEquals(panel.checkPinRaised(0, 6), true);
	assertEquals(panel.checkPinRaised(0, 7), false);
	
	panel.setCharToBraillePins(1, 'q');
	assertEquals(panel.checkPinRaised(1, 0), false);
	assertEquals(panel.checkPinRaised(1, 1), false);
	assertEquals(panel.checkPinRaised(1, 2), false);
	assertEquals(panel.checkPinRaised(1, 3), false);
	assertEquals(panel.checkPinRaised(1, 4), false);
	assertEquals(panel.checkPinRaised(1, 5), true);
	assertEquals(panel.checkPinRaised(1, 6), true);
	assertEquals(panel.checkPinRaised(1, 7), true);
	
	panel.setCharToBraillePins(2, 'r');
	assertEquals(panel.checkPinRaised(2, 0), false);
	assertEquals(panel.checkPinRaised(2, 1), false);
	assertEquals(panel.checkPinRaised(2, 2), false);
	assertEquals(panel.checkPinRaised(2, 3), true);
	assertEquals(panel.checkPinRaised(2, 4), false);
	assertEquals(panel.checkPinRaised(2, 5), false);
	assertEquals(panel.checkPinRaised(2, 6), true);
	assertEquals(panel.checkPinRaised(2, 7), false);
	
	panel.setCharToBraillePins(3, 's');
	assertEquals(panel.checkPinRaised(3, 0), false);
	assertEquals(panel.checkPinRaised(3, 1), false);
	assertEquals(panel.checkPinRaised(3, 2), false);
	assertEquals(panel.checkPinRaised(3, 3), false);
	assertEquals(panel.checkPinRaised(3, 4), false);
	assertEquals(panel.checkPinRaised(3, 5), true);
	assertEquals(panel.checkPinRaised(3, 6), true);
	assertEquals(panel.checkPinRaised(3, 7), false);
	
	panel.setCharToBraillePins(4, 't');
	assertEquals(panel.checkPinRaised(4, 0), false);
	assertEquals(panel.checkPinRaised(4, 1), false);
	assertEquals(panel.checkPinRaised(4, 2), false);
	assertEquals(panel.checkPinRaised(4, 3), false);
	assertEquals(panel.checkPinRaised(4, 4), false);
	assertEquals(panel.checkPinRaised(4, 5), false);
	assertEquals(panel.checkPinRaised(4, 6), true);
	assertEquals(panel.checkPinRaised(4, 7), true);
	
	panel.setCharToBraillePins(0, 'u');
	assertEquals(panel.checkPinRaised(0, 0), false);
	assertEquals(panel.checkPinRaised(0, 1), false);
	assertEquals(panel.checkPinRaised(0, 2), true);
	assertEquals(panel.checkPinRaised(0, 3), false);
	assertEquals(panel.checkPinRaised(0, 4), true);
	assertEquals(panel.checkPinRaised(0, 5), false);
	assertEquals(panel.checkPinRaised(0, 6), false);
	assertEquals(panel.checkPinRaised(0, 7), false);
	
	panel.setCharToBraillePins(1, 'v');
	assertEquals(panel.checkPinRaised(1, 0), false);
	assertEquals(panel.checkPinRaised(1, 1), false);
	assertEquals(panel.checkPinRaised(1, 2), true);
	assertEquals(panel.checkPinRaised(1, 3), true);
	assertEquals(panel.checkPinRaised(1, 4), true);
	assertEquals(panel.checkPinRaised(1, 5), false);
	assertEquals(panel.checkPinRaised(1, 6), false);
	assertEquals(panel.checkPinRaised(1, 7), false);
	
	panel.setCharToBraillePins(2, 'w');
	assertEquals(panel.checkPinRaised(2, 0), false);
	assertEquals(panel.checkPinRaised(2, 1), false);
	assertEquals(panel.checkPinRaised(2, 2), true);
	assertEquals(panel.checkPinRaised(2, 3), false);
	assertEquals(panel.checkPinRaised(2, 4), true);
	assertEquals(panel.checkPinRaised(2, 5), true);
	assertEquals(panel.checkPinRaised(2, 6), false);
	assertEquals(panel.checkPinRaised(2, 7), false);
	
	panel.setCharToBraillePins(3, 'x');
	assertEquals(panel.checkPinRaised(3, 0), false);
	assertEquals(panel.checkPinRaised(3, 1), false);
	assertEquals(panel.checkPinRaised(3, 2), true);
	assertEquals(panel.checkPinRaised(3, 3), false);
	assertEquals(panel.checkPinRaised(3, 4), true);
	assertEquals(panel.checkPinRaised(3, 5), false);
	assertEquals(panel.checkPinRaised(3, 6), false);
	assertEquals(panel.checkPinRaised(3, 7), true);
	
	panel.setCharToBraillePins(4, 'y');
	assertEquals(panel.checkPinRaised(4, 0), true);
	assertEquals(panel.checkPinRaised(4, 1), false);
	assertEquals(panel.checkPinRaised(4, 2), false);
	assertEquals(panel.checkPinRaised(4, 3), false);
	assertEquals(panel.checkPinRaised(4, 4), false);
	assertEquals(panel.checkPinRaised(4, 5), false);
	assertEquals(panel.checkPinRaised(4, 6), true);
	assertEquals(panel.checkPinRaised(4, 7), false);
	
	panel.setCharToBraillePins(0, 'z');
	assertEquals(panel.checkPinRaised(0, 0), true);
	assertEquals(panel.checkPinRaised(0, 1), false);
	assertEquals(panel.checkPinRaised(0, 2), false);
	assertEquals(panel.checkPinRaised(0, 3), true);
	assertEquals(panel.checkPinRaised(0, 4), false);
	assertEquals(panel.checkPinRaised(0, 5), false);
	assertEquals(panel.checkPinRaised(0, 6), true);
	assertEquals(panel.checkPinRaised(0, 7), false);
	}

}
