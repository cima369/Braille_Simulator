package eecs2311simulator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SimulatorTest {
	
	Simulator panel;
	Simulator panel2;
	Simulator panel3;
	Simulator panel4;
	Simulator panel5;

	@Before
	public void setUp(  ) throws Exception {
		panel = new Simulator (true, 5, 2);
		panel2 = new Simulator (true, 4, 1);
		panel3 = new Simulator (true, 3, 3);
		panel4 = new Simulator (true, 2, 4);
		panel5 = new Simulator (true, 1, 5);
    }
	
	@Test
	public void testBrailleCellSize() {
		assertEquals(panel.getBrailleCellsSize(), 5);
		assertEquals(panel2.getBrailleCellsSize(), 4);
		assertEquals(panel3.getBrailleCellsSize(), 3);
		assertEquals(panel4.getBrailleCellsSize(), 2);
		assertEquals(panel5.getBrailleCellsSize(), 1);
	}
	
	@Test 
	public void testButtonSize(){	
		assertEquals(panel.getButtonsSize(), 2);
		assertEquals(panel2.getButtonsSize(), 1);
		assertEquals(panel3.getButtonsSize(), 3);
		assertEquals(panel4.getButtonsSize(), 4);
		assertEquals(panel5.getButtonsSize(), 5);
	}
	
	@Test
	public void testRaisePin() {
		panel.raisePin(0, 0);
		panel.raisePin(0, 2);
		panel.raisePin(0, 4);
		panel.raisePin(0, 6);
		
		panel.raisePin(1, 1);
		panel.raisePin(1, 3);
		panel.raisePin(1, 5);
		panel.raisePin(1, 7);
		
		panel.raisePin(2, 0);
		panel.raisePin(2, 2);
		panel.raisePin(2, 4);
		panel.raisePin(2, 6);
			
		panel.raisePin(3, 1);
		panel.raisePin(3, 3);
		panel.raisePin(3, 5);
		panel.raisePin(3, 7);
		
		panel.raisePin(4, 0);
		panel.raisePin(4, 2);
		panel.raisePin(4, 4);
		panel.raisePin(4, 6);
		
		assertEquals(panel.checkPinRaised(0, 0), true);
		assertEquals(panel.checkPinRaised(0, 2), true);
		assertEquals(panel.checkPinRaised(0, 4), true);
		assertEquals(panel.checkPinRaised(0, 6), true);
		
		assertEquals(panel.checkPinRaised(1, 1), true);
		assertEquals(panel.checkPinRaised(1, 3), true);
		assertEquals(panel.checkPinRaised(1, 5), true);
		assertEquals(panel.checkPinRaised(1, 7), true);
		
		assertEquals(panel.checkPinRaised(2, 0), true);
		assertEquals(panel.checkPinRaised(2, 2), true);
		assertEquals(panel.checkPinRaised(2, 4), true);
		assertEquals(panel.checkPinRaised(2, 6), true);
		
		assertEquals(panel.checkPinRaised(3, 1), true);
		assertEquals(panel.checkPinRaised(3, 3), true);
		assertEquals(panel.checkPinRaised(3, 5), true);
		assertEquals(panel.checkPinRaised(3, 7), true);
		
		assertEquals(panel.checkPinRaised(4, 0), true);
		assertEquals(panel.checkPinRaised(4, 2), true);
		assertEquals(panel.checkPinRaised(4, 4), true);
		assertEquals(panel.checkPinRaised(4, 6), true);
	}
	
	@Test
	public void testLowerPin() {
		panel.raisePin(0, 0);
		panel.raisePin(0, 2);
		panel.raisePin(0, 4);
		panel.raisePin(0, 6);
		
		panel.raisePin(1, 1);
		panel.raisePin(1, 3);
		panel.raisePin(1, 5);
		panel.raisePin(1, 7);
		
		panel.raisePin(2, 0);
		panel.raisePin(2, 2);
		panel.raisePin(2, 4);
		panel.raisePin(2, 6);
			
		panel.raisePin(3, 1);
		panel.raisePin(3, 3);
		panel.raisePin(3, 5);
		panel.raisePin(3, 7);
		
		panel.raisePin(4, 0);
		panel.raisePin(4, 2);
		panel.raisePin(4, 4);
		panel.raisePin(4, 6);
		
		assertEquals(panel.checkPinRaised(0, 0), true);
		assertEquals(panel.checkPinRaised(0, 2), true);
		assertEquals(panel.checkPinRaised(0, 4), true);
		assertEquals(panel.checkPinRaised(0, 6), true);
		
		assertEquals(panel.checkPinRaised(1, 1), true);
		assertEquals(panel.checkPinRaised(1, 3), true);
		assertEquals(panel.checkPinRaised(1, 5), true);
		assertEquals(panel.checkPinRaised(1, 7), true);
		
		assertEquals(panel.checkPinRaised(2, 0), true);
		assertEquals(panel.checkPinRaised(2, 2), true);
		assertEquals(panel.checkPinRaised(2, 4), true);
		assertEquals(panel.checkPinRaised(2, 6), true);
		
		assertEquals(panel.checkPinRaised(3, 1), true);
		assertEquals(panel.checkPinRaised(3, 3), true);
		assertEquals(panel.checkPinRaised(3, 5), true);
		assertEquals(panel.checkPinRaised(3, 7), true);
		
		assertEquals(panel.checkPinRaised(4, 0), true);
		assertEquals(panel.checkPinRaised(4, 2), true);
		assertEquals(panel.checkPinRaised(4, 4), true);
		assertEquals(panel.checkPinRaised(4, 6), true);
		
		panel.lowerPin(0, 0);
		panel.lowerPin(0, 2);
		panel.lowerPin(0, 4);
		panel.lowerPin(0, 6);
		
		panel.lowerPin(1, 1);
		panel.lowerPin(1, 3);
		panel.lowerPin(1, 5);
		panel.lowerPin(1, 7);
		
		panel.lowerPin(2, 0);
		panel.lowerPin(2, 2);
		panel.lowerPin(2, 4);
		panel.lowerPin(2, 6);
			
		panel.lowerPin(3, 1);
		panel.lowerPin(3, 3);
		panel.lowerPin(3, 5);
		panel.lowerPin(3, 7);
		
		panel.lowerPin(4, 0);
		panel.lowerPin(4, 2);
		panel.lowerPin(4, 4);
		panel.lowerPin(4, 6);
		
		assertEquals(panel.checkPinRaised(0, 0), false);
		assertEquals(panel.checkPinRaised(0, 2), false);
		assertEquals(panel.checkPinRaised(0, 4), false);
		assertEquals(panel.checkPinRaised(0, 6), false);
		
		assertEquals(panel.checkPinRaised(1, 1), false);
		assertEquals(panel.checkPinRaised(1, 3), false);
		assertEquals(panel.checkPinRaised(1, 5), false);
		assertEquals(panel.checkPinRaised(1, 7), false);
		
		assertEquals(panel.checkPinRaised(2, 0), false);
		assertEquals(panel.checkPinRaised(2, 2), false);
		assertEquals(panel.checkPinRaised(2, 4), false);
		assertEquals(panel.checkPinRaised(2, 6), false);
		
		assertEquals(panel.checkPinRaised(3, 1), false);
		assertEquals(panel.checkPinRaised(3, 3), false);
		assertEquals(panel.checkPinRaised(3, 5), false);
		assertEquals(panel.checkPinRaised(3, 7), false);
		
		assertEquals(panel.checkPinRaised(4, 0), false);
		assertEquals(panel.checkPinRaised(4, 2), false);
		assertEquals(panel.checkPinRaised(4, 4), false);
		assertEquals(panel.checkPinRaised(4, 6), false);
	}

	@Test
	public void testReset(){
		panel.raisePin(0, 0);
		panel.raisePin(0, 2);
		panel.raisePin(0, 4);
		panel.raisePin(0, 6);
	
		assertEquals(panel.checkPinRaised(0, 0), true);
		assertEquals(panel.checkPinRaised(0, 2), true);
		assertEquals(panel.checkPinRaised(0, 4), true);
		assertEquals(panel.checkPinRaised(0, 6), true);
		panel.reset(0);
		
		assertEquals(panel.checkPinRaised(0, 0), false);
		assertEquals(panel.checkPinRaised(0, 1), false);
		assertEquals(panel.checkPinRaised(0, 2), false);
		assertEquals(panel.checkPinRaised(0, 3), false);
		assertEquals(panel.checkPinRaised(0, 4), false);
		assertEquals(panel.checkPinRaised(0, 5), false);
		assertEquals(panel.checkPinRaised(0, 6), false);
		assertEquals(panel.checkPinRaised(0, 7), false);
			
		panel.raisePin(1, 1);
		panel.raisePin(1, 3);
		panel.raisePin(1, 5);
		panel.raisePin(1, 7);
		
		assertEquals(panel.checkPinRaised(1, 1), true);
		assertEquals(panel.checkPinRaised(1, 3), true);
		assertEquals(panel.checkPinRaised(1, 5), true);
		assertEquals(panel.checkPinRaised(1, 7), true);
		panel.reset(1);
		
		assertEquals(panel.checkPinRaised(1, 0), false);
		assertEquals(panel.checkPinRaised(1, 1), false);
		assertEquals(panel.checkPinRaised(1, 2), false);
		assertEquals(panel.checkPinRaised(1, 3), false);
		assertEquals(panel.checkPinRaised(1, 4), false);
		assertEquals(panel.checkPinRaised(1, 5), false);
		assertEquals(panel.checkPinRaised(1, 6), false);
		assertEquals(panel.checkPinRaised(1, 7), false);
		
		panel.raisePin(2, 0);
		panel.raisePin(2, 2);
		panel.raisePin(2, 4);
		panel.raisePin(2, 6);
		
		assertEquals(panel.checkPinRaised(2, 0), true);
		assertEquals(panel.checkPinRaised(2, 2), true);
		assertEquals(panel.checkPinRaised(2, 4), true);
		assertEquals(panel.checkPinRaised(2, 6), true);
		panel.reset(2);
		
		assertEquals(panel.checkPinRaised(2, 0), false);
		assertEquals(panel.checkPinRaised(2, 1), false);
		assertEquals(panel.checkPinRaised(2, 2), false);
		assertEquals(panel.checkPinRaised(2, 3), false);
		assertEquals(panel.checkPinRaised(2, 4), false);
		assertEquals(panel.checkPinRaised(2, 5), false);
		assertEquals(panel.checkPinRaised(2, 6), false);
		assertEquals(panel.checkPinRaised(2, 7), false);

		
		panel.raisePin(3, 1);
		panel.raisePin(3, 3);
		panel.raisePin(3, 5);
		panel.raisePin(3, 7);
		
		panel.raisePin(3, 1);
		panel.raisePin(3, 3);
		panel.raisePin(3, 5);
		panel.raisePin(3, 7);
		panel.reset(3);
		
		assertEquals(panel.checkPinRaised(3, 0), false);
		assertEquals(panel.checkPinRaised(3, 1), false);
		assertEquals(panel.checkPinRaised(3, 2), false);
		assertEquals(panel.checkPinRaised(3, 3), false);
		assertEquals(panel.checkPinRaised(3, 4), false);
		assertEquals(panel.checkPinRaised(3, 5), false);
		assertEquals(panel.checkPinRaised(3, 6), false);
		assertEquals(panel.checkPinRaised(3, 7), false);
		
		panel.raisePin(4, 0);
		panel.raisePin(4, 2);
		panel.raisePin(4, 4);
		panel.raisePin(4, 6);
		
		assertEquals(panel.checkPinRaised(4, 0), true);
		assertEquals(panel.checkPinRaised(4, 2), true);
		assertEquals(panel.checkPinRaised(4, 4), true);
		assertEquals(panel.checkPinRaised(4, 6), true);
		panel.reset(4);
		
		assertEquals(panel.checkPinRaised(4, 0), false);
		assertEquals(panel.checkPinRaised(4, 1), false);
		assertEquals(panel.checkPinRaised(4, 2), false);
		assertEquals(panel.checkPinRaised(4, 3), false);
		assertEquals(panel.checkPinRaised(4, 4), false);
		assertEquals(panel.checkPinRaised(4, 5), false);
		assertEquals(panel.checkPinRaised(4, 6), false);
		assertEquals(panel.checkPinRaised(4, 7), false);
	}
	
	@Test
	public void testsetCharToBraillePins () {
	
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
	
	panel.setCharToBraillePins(1, 'f');
	assertEquals(panel.checkPinRaised(1, 0), false);
	assertEquals(panel.checkPinRaised(1, 1), false);
	assertEquals(panel.checkPinRaised(1, 2), true);
	assertEquals(panel.checkPinRaised(1, 3), true);
	assertEquals(panel.checkPinRaised(1, 4), false);
	assertEquals(panel.checkPinRaised(1, 5), false);
	assertEquals(panel.checkPinRaised(1, 6), false);
	assertEquals(panel.checkPinRaised(1, 7), false);
	
	panel.setCharToBraillePins(2, 'g');
	assertEquals(panel.checkPinRaised(2, 0), false);
	assertEquals(panel.checkPinRaised(2, 1), false);
	assertEquals(panel.checkPinRaised(2, 2), true);
	assertEquals(panel.checkPinRaised(2, 3), false);
	assertEquals(panel.checkPinRaised(2, 4), false);
	assertEquals(panel.checkPinRaised(2, 5), true);
	assertEquals(panel.checkPinRaised(2, 6), false);
	assertEquals(panel.checkPinRaised(2, 7), false);
	
	panel.setCharToBraillePins(3, 'h');
	assertEquals(panel.checkPinRaised(3, 0), false);
	assertEquals(panel.checkPinRaised(3, 1), false);
	assertEquals(panel.checkPinRaised(3, 2), true);
	assertEquals(panel.checkPinRaised(3, 3), false);
	assertEquals(panel.checkPinRaised(3, 4), false);
	assertEquals(panel.checkPinRaised(3, 5), false);
	assertEquals(panel.checkPinRaised(3, 6), false);
	assertEquals(panel.checkPinRaised(3, 7), true);
	
	panel.setCharToBraillePins(4, 'i');
	assertEquals(panel.checkPinRaised(4, 0), false);
	assertEquals(panel.checkPinRaised(4, 1), false);
	assertEquals(panel.checkPinRaised(4, 2), false);
	assertEquals(panel.checkPinRaised(4, 3), false);
	assertEquals(panel.checkPinRaised(4, 4), true);
	assertEquals(panel.checkPinRaised(4, 5), false);
	assertEquals(panel.checkPinRaised(4, 6), false);
	assertEquals(panel.checkPinRaised(4, 7), false);
	
	panel.setCharToBraillePins(0, 'j');
	assertEquals(panel.checkPinRaised(0, 0), false);
	assertEquals(panel.checkPinRaised(0, 1), false);
	assertEquals(panel.checkPinRaised(0, 2), false);
	assertEquals(panel.checkPinRaised(0, 3), true);
	assertEquals(panel.checkPinRaised(0, 4), true);
	assertEquals(panel.checkPinRaised(0, 5), true);
	assertEquals(panel.checkPinRaised(0, 6), false);
	assertEquals(panel.checkPinRaised(0, 7), false);
	
	panel.setCharToBraillePins(1, 'k');
	assertEquals(panel.checkPinRaised(1, 0), false);
	assertEquals(panel.checkPinRaised(1, 1), false);
	assertEquals(panel.checkPinRaised(1, 2), false);
	assertEquals(panel.checkPinRaised(1, 3), false);
	assertEquals(panel.checkPinRaised(1, 4), true);
	assertEquals(panel.checkPinRaised(1, 5), true);
	assertEquals(panel.checkPinRaised(1, 6), false);
	assertEquals(panel.checkPinRaised(1, 7), true);
	
	panel.setCharToBraillePins(2, 'l');
	assertEquals(panel.checkPinRaised(2, 0), false);
	assertEquals(panel.checkPinRaised(2, 1), false);
	assertEquals(panel.checkPinRaised(2, 2), false);
	assertEquals(panel.checkPinRaised(2, 3), true);
	assertEquals(panel.checkPinRaised(2, 4), true);
	assertEquals(panel.checkPinRaised(2, 5), false);
	assertEquals(panel.checkPinRaised(2, 6), false);
	assertEquals(panel.checkPinRaised(2, 7), false);
	
	panel.setCharToBraillePins(3, 'm');
	assertEquals(panel.checkPinRaised(3, 0), false);
	assertEquals(panel.checkPinRaised(3, 1), false);
	assertEquals(panel.checkPinRaised(3, 2), false);
	assertEquals(panel.checkPinRaised(3, 3), false);
	assertEquals(panel.checkPinRaised(3, 4), true);
	assertEquals(panel.checkPinRaised(3, 5), true);
	assertEquals(panel.checkPinRaised(3, 6), false);
	assertEquals(panel.checkPinRaised(3, 7), false);
	
	panel.setCharToBraillePins(4, 'n');
	assertEquals(panel.checkPinRaised(4, 0), false);
	assertEquals(panel.checkPinRaised(4, 1), false);
	assertEquals(panel.checkPinRaised(4, 2), false);
	assertEquals(panel.checkPinRaised(4, 3), false);
	assertEquals(panel.checkPinRaised(4, 4), true);
	assertEquals(panel.checkPinRaised(4, 5), false);
	assertEquals(panel.checkPinRaised(4, 6), false);
	assertEquals(panel.checkPinRaised(4, 7), true);
	
	panel.setCharToBraillePins(4, 'o');
	assertEquals(panel.checkPinRaised(4, 0), false);
	assertEquals(panel.checkPinRaised(4, 1), false);
	assertEquals(panel.checkPinRaised(4, 2), false);
	assertEquals(panel.checkPinRaised(4, 3), false);
	assertEquals(panel.checkPinRaised(4, 4), false);
	assertEquals(panel.checkPinRaised(4, 5), false);
	assertEquals(panel.checkPinRaised(4, 6), true);
	assertEquals(panel.checkPinRaised(4, 7), false);
	
	panel.setCharToBraillePins(3, 'p');
	assertEquals(panel.checkPinRaised(3, 0), false);
	assertEquals(panel.checkPinRaised(3, 1), false);
	assertEquals(panel.checkPinRaised(3, 2), false);
	assertEquals(panel.checkPinRaised(3, 3), true);
	assertEquals(panel.checkPinRaised(3, 4), false);
	assertEquals(panel.checkPinRaised(3, 5), true);
	assertEquals(panel.checkPinRaised(3, 6), true);
	assertEquals(panel.checkPinRaised(3, 7), false);
	
	panel.setCharToBraillePins(4, 'q');
	assertEquals(panel.checkPinRaised(4, 0), false);
	assertEquals(panel.checkPinRaised(4, 1), false);
	assertEquals(panel.checkPinRaised(4, 2), false);
	assertEquals(panel.checkPinRaised(4, 3), false);
	assertEquals(panel.checkPinRaised(4, 4), false);
	assertEquals(panel.checkPinRaised(4, 5), true);
	assertEquals(panel.checkPinRaised(4, 6), true);
	assertEquals(panel.checkPinRaised(4, 7), true);
	
	panel.setCharToBraillePins(0, 'r');
	assertEquals(panel.checkPinRaised(0, 0), false);
	assertEquals(panel.checkPinRaised(0, 1), false);
	assertEquals(panel.checkPinRaised(0, 2), false);
	assertEquals(panel.checkPinRaised(0, 3), true);
	assertEquals(panel.checkPinRaised(0, 4), false);
	assertEquals(panel.checkPinRaised(0, 5), false);
	assertEquals(panel.checkPinRaised(0, 6), true);
	assertEquals(panel.checkPinRaised(0, 7), false);
	
	panel.setCharToBraillePins(1, 's');
	assertEquals(panel.checkPinRaised(1, 0), false);
	assertEquals(panel.checkPinRaised(1, 1), false);
	assertEquals(panel.checkPinRaised(1, 2), false);
	assertEquals(panel.checkPinRaised(1, 3), false);
	assertEquals(panel.checkPinRaised(1, 4), false);
	assertEquals(panel.checkPinRaised(1, 5), true);
	assertEquals(panel.checkPinRaised(1, 6), true);
	assertEquals(panel.checkPinRaised(1, 7), false);
	
	panel.setCharToBraillePins(2, 't');
	assertEquals(panel.checkPinRaised(2, 0), false);
	assertEquals(panel.checkPinRaised(2, 1), false);
	assertEquals(panel.checkPinRaised(2, 2), false);
	assertEquals(panel.checkPinRaised(2, 3), false);
	assertEquals(panel.checkPinRaised(2, 4), false);
	assertEquals(panel.checkPinRaised(2, 5), false);
	assertEquals(panel.checkPinRaised(2, 6), true);
	assertEquals(panel.checkPinRaised(2, 7), true);
	
	panel.setCharToBraillePins(3, 'u');
	assertEquals(panel.checkPinRaised(3, 0), false);
	assertEquals(panel.checkPinRaised(3, 1), false);
	assertEquals(panel.checkPinRaised(3, 2), true);
	assertEquals(panel.checkPinRaised(3, 3), false);
	assertEquals(panel.checkPinRaised(3, 4), true);
	assertEquals(panel.checkPinRaised(3, 5), false);
	assertEquals(panel.checkPinRaised(3, 6), false);
	assertEquals(panel.checkPinRaised(3, 7), false);
	
	panel.setCharToBraillePins(4, 'v');
	assertEquals(panel.checkPinRaised(4, 0), false);
	assertEquals(panel.checkPinRaised(4, 1), false);
	assertEquals(panel.checkPinRaised(4, 2), true);
	assertEquals(panel.checkPinRaised(4, 3), true);
	assertEquals(panel.checkPinRaised(4, 4), true);
	assertEquals(panel.checkPinRaised(4, 5), false);
	assertEquals(panel.checkPinRaised(4, 6), false);
	assertEquals(panel.checkPinRaised(4, 7), false);
	
	panel.setCharToBraillePins(0, 'w');
	assertEquals(panel.checkPinRaised(0, 0), false);
	assertEquals(panel.checkPinRaised(0, 1), false);
	assertEquals(panel.checkPinRaised(0, 2), true);
	assertEquals(panel.checkPinRaised(0, 3), false);
	assertEquals(panel.checkPinRaised(0, 4), true);
	assertEquals(panel.checkPinRaised(0, 5), true);
	assertEquals(panel.checkPinRaised(0, 6), false);
	assertEquals(panel.checkPinRaised(0, 7), false);
	
	panel.setCharToBraillePins(1, 'x');
	assertEquals(panel.checkPinRaised(1, 0), false);
	assertEquals(panel.checkPinRaised(1, 1), false);
	assertEquals(panel.checkPinRaised(1, 2), true);
	assertEquals(panel.checkPinRaised(1, 3), false);
	assertEquals(panel.checkPinRaised(1, 4), true);
	assertEquals(panel.checkPinRaised(1, 5), false);
	assertEquals(panel.checkPinRaised(1, 6), false);
	assertEquals(panel.checkPinRaised(1, 7), true);
	
	panel.setCharToBraillePins(2, 'y');
	assertEquals(panel.checkPinRaised(2, 0), true);
	assertEquals(panel.checkPinRaised(2, 1), false);
	assertEquals(panel.checkPinRaised(2, 2), false);
	assertEquals(panel.checkPinRaised(2, 3), false);
	assertEquals(panel.checkPinRaised(2, 4), false);
	assertEquals(panel.checkPinRaised(2, 5), false);
	assertEquals(panel.checkPinRaised(2, 6), true);
	assertEquals(panel.checkPinRaised(2, 7), false);
	
	panel.setCharToBraillePins(3, 'z');
	assertEquals(panel.checkPinRaised(3, 0), true);
	assertEquals(panel.checkPinRaised(3, 1), false);
	assertEquals(panel.checkPinRaised(3, 2), false);
	assertEquals(panel.checkPinRaised(3, 3), true);
	assertEquals(panel.checkPinRaised(3, 4), false);
	assertEquals(panel.checkPinRaised(3, 5), false);
	assertEquals(panel.checkPinRaised(3, 6), true);
	assertEquals(panel.checkPinRaised(3, 7), false);
	}
}
