package eecs2311simulator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SimulatorTest {
	
	Simulator panel;
	
	@Before
	public void setUp(  ) throws Exception {
		panel = new Simulator (true, 5, 2);
    }
		
	@Test
	public void testraisePin() {
		panel.raisePin(0, 0);
		panel.raisePin(1, 3);
		panel.raisePin(3, 7);
		
		assertEquals(panel.checkPinRaised(0, 0), true);
		assertEquals(panel.checkPinRaised(1, 3), true);
		assertEquals(panel.checkPinRaised(3, 7), true);
	}
	
	@Test
	public void testlowerPin() {
		panel.raisePin(0, 1);
		panel.raisePin(3, 7);
		panel.raisePin(1, 3);
		
		assertEquals(panel.checkPinRaised(0, 1), true);
		assertEquals(panel.checkPinRaised(3, 7), true);
		assertEquals(panel.checkPinRaised(1, 3), true);
		
		panel.lowerPin(0, 1);
		panel.lowerPin(3, 7);
		panel.lowerPin(1, 3);
		
		assertEquals(panel.checkPinRaised(0, 1), false);
		assertEquals(panel.checkPinRaised(3, 7), false);
		assertEquals(panel.checkPinRaised(1, 3), false);
	}

	@Test
	public void testreset(){
		panel.raisePin(0, 1);
		panel.raisePin(0, 4);
		panel.raisePin(0, 6);
		panel.reset(0);
		
		assertEquals(panel.checkPinRaised(0, 0), false);
		assertEquals(panel.checkPinRaised(0, 1), false);
		assertEquals(panel.checkPinRaised(0, 2), false);
		assertEquals(panel.checkPinRaised(0, 3), false);
		assertEquals(panel.checkPinRaised(0, 4), false);
		assertEquals(panel.checkPinRaised(0, 5), false);
		assertEquals(panel.checkPinRaised(0, 6), false);
		assertEquals(panel.checkPinRaised(0, 7), false);
		
		panel.raisePin(3, 3);
		panel.raisePin(3, 7);
		panel.raisePin(3, 2);
		panel.reset(3);
		
		assertEquals(panel.checkPinRaised(3, 0), false);
		assertEquals(panel.checkPinRaised(3, 1), false);
		assertEquals(panel.checkPinRaised(3, 2), false);
		assertEquals(panel.checkPinRaised(3, 3), false);
		assertEquals(panel.checkPinRaised(3, 4), false);
		assertEquals(panel.checkPinRaised(3, 5), false);
		assertEquals(panel.checkPinRaised(3, 6), false);
		assertEquals(panel.checkPinRaised(3, 7), false);
	
		panel.raisePin(1, 1);
		panel.raisePin(1, 4);
		panel.raisePin(1, 6);
		panel.reset(1);
		
		assertEquals(panel.checkPinRaised(1, 0), false);
		assertEquals(panel.checkPinRaised(1, 1), false);
		assertEquals(panel.checkPinRaised(1, 2), false);
		assertEquals(panel.checkPinRaised(1, 3), false);
		assertEquals(panel.checkPinRaised(1, 4), false);
		assertEquals(panel.checkPinRaised(1, 5), false);
		assertEquals(panel.checkPinRaised(1, 6), false);
		assertEquals(panel.checkPinRaised(1, 7), false);
	}
	
	@Test
	public void testsetCharToBraillePins () {
		
	panel.setCharToBraillePins(0, 'a');
	panel.setCharToBraillePins(1, 'b');
	panel.setCharToBraillePins(2, 'c');
	panel.setCharToBraillePins(3, 'p');
	panel.setCharToBraillePins(4, 'q');
	
	assertEquals(panel.checkPinRaised(0, 0), true);
	assertEquals(panel.checkPinRaised(0, 1), false);
	assertEquals(panel.checkPinRaised(0, 2), false);
	assertEquals(panel.checkPinRaised(0, 3), false);
	assertEquals(panel.checkPinRaised(0, 4), false);
	assertEquals(panel.checkPinRaised(0, 5), false);
	assertEquals(panel.checkPinRaised(0, 6), false);
	assertEquals(panel.checkPinRaised(0, 7), false);
	
	assertEquals(panel.checkPinRaised(1, 0), true);
	assertEquals(panel.checkPinRaised(1, 1), false);
	assertEquals(panel.checkPinRaised(1, 2), false);
	assertEquals(panel.checkPinRaised(1, 3), true);
	assertEquals(panel.checkPinRaised(1, 4), false);
	assertEquals(panel.checkPinRaised(1, 5), false);
	assertEquals(panel.checkPinRaised(1, 6), false);
	assertEquals(panel.checkPinRaised(1, 7), false);
	
	assertEquals(panel.checkPinRaised(2, 0), true);
	assertEquals(panel.checkPinRaised(2, 1), false);
	assertEquals(panel.checkPinRaised(2, 2), false);
	assertEquals(panel.checkPinRaised(2, 3), false);
	assertEquals(panel.checkPinRaised(2, 4), false);
	assertEquals(panel.checkPinRaised(2, 5), true);
	assertEquals(panel.checkPinRaised(2, 6), false);
	assertEquals(panel.checkPinRaised(2, 7), false);
	
	assertEquals(panel.checkPinRaised(3, 0), false);
	assertEquals(panel.checkPinRaised(3, 1), false);
	assertEquals(panel.checkPinRaised(3, 2), false);
	assertEquals(panel.checkPinRaised(3, 3), true);
	assertEquals(panel.checkPinRaised(3, 4), false);
	assertEquals(panel.checkPinRaised(3, 5), true);
	assertEquals(panel.checkPinRaised(3, 6), true);
	assertEquals(panel.checkPinRaised(3, 7), false);
	
	assertEquals(panel.checkPinRaised(4, 0), false);
	assertEquals(panel.checkPinRaised(4, 1), false);
	assertEquals(panel.checkPinRaised(4, 2), false);
	assertEquals(panel.checkPinRaised(4, 3), false);
	assertEquals(panel.checkPinRaised(4, 4), false);
	assertEquals(panel.checkPinRaised(4, 5), true);
	assertEquals(panel.checkPinRaised(4, 6), true);
	assertEquals(panel.checkPinRaised(4, 7), true);
	
	}
}
