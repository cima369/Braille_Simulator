package eecs2311simulator;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class SimulatorTestException {

	Simulator panel;
	
	@Before
	public void setUp() throws Exception {
		panel = new Simulator (true, 5, 2);
	}

	@Rule
	public final ExpectedException exception = ExpectedException.none();
	
	@Test
	public void testIllegalArgumentExceptionSimulator(){
		exception.expect(IllegalArgumentException.class);
		panel = new Simulator (true, 4, 0);
	}
	
	@Test
	public void testIllegalArgumentExceptionSimulator2(){
		exception.expect(IllegalArgumentException.class);
		panel = new Simulator (true, 0, 8);
	}
	
	@Test
	public void testIllegalArgumentExceptionSimulator3(){
		exception.expect(IllegalArgumentException.class);
		panel = new Simulator (true, -1, 0);
	}
	
	@Test
	public void testIllegalArgumentExceptionSimulator4(){
		exception.expect(IllegalArgumentException.class);
		panel = new Simulator (true, 0, -4);
	}
	
	@Test
	public void testIllegalArgumentExceptionSimulator5(){
		exception.expect(IllegalArgumentException.class);
		panel = new Simulator (true, -2, -5);
	}
	
	@Test
	public void testIndexOutOfBoundsSetButtonText(){
		exception.expect(IndexOutOfBoundsException.class);
		panel.setButtonText(5, "B");
	}
	
	@Test
	public void testIndexOutOfBoundsSetButtonText2(){
		exception.expect(IndexOutOfBoundsException.class);
		panel.setButtonText(777, "T");
	}
	
	@Test
	public void testIndexOutOfBoundsSetButtonText3(){
		exception.expect(IndexOutOfBoundsException.class);
		panel.setButtonText(-2, "R");
	}
	
	@Test
	public void testIndexOutOfBoundsSetButtonText4(){
		exception.expect(IndexOutOfBoundsException.class);
		panel.setButtonText(-43, "L");
	}
	
	@Test
	public void testIndexOutOfBoundsGetButtonText(){
		exception.expect(IndexOutOfBoundsException.class);
		panel.getButtonText(5);
	}
	
	@Test
	public void testIndexOutOfBoundsGetButtonText2(){
		exception.expect(IndexOutOfBoundsException.class);
		panel.getButtonText(800);
	}
	
	@Test
	public void testIndexOutOfBoundsGetButtonText3(){
		exception.expect(IndexOutOfBoundsException.class);
		panel.getButtonText(-1);
	}
	
	@Test
	public void testIndexOutOfBoundsGetButtonText4(){
		exception.expect(IndexOutOfBoundsException.class);
		panel.getButtonText(-455);
	}
	
	@Test
	public void testIndexOutOfBoundsExceptionRaisePin(){
		exception.expect(IndexOutOfBoundsException.class);
		panel.raisePin(5, 0);
	}
	
	@Test
	public void testIndexOutOfBoundsExceptionRaisePin2(){
		exception.expect(IndexOutOfBoundsException.class);
		panel.raisePin(3, 8);
	}
	
	@Test
	public void testIndexOutOfBoundsExceptionRaisePin3(){
		exception.expect(IndexOutOfBoundsException.class);
		panel.raisePin(4, -1);
	}
	
	@Test
	public void testIndexOutOfBoundsExceptionRaisePin4(){
		exception.expect(IndexOutOfBoundsException.class);
		panel.raisePin(-4, 3);
	}
	
	@Test
	public void testIndexOutOfBoundsExceptionRaisePin5(){
		exception.expect(IndexOutOfBoundsException.class);
		panel.raisePin(988, 1111);
	}
	
	@Test
	public void testIndexOutOfBoundsExceptionRaisePin6(){
		exception.expect(IndexOutOfBoundsException.class);
		panel.raisePin(-2, -5);
	}
	
	@Test
	public void testIndexOutOfBoundsExceptionLowerPin(){
		exception.expect(IndexOutOfBoundsException.class);
		panel.lowerPin(0, 9);
	}
	
	@Test
	public void testIndexOutOfBoundsExceptionLowerPin2(){
		exception.expect(IndexOutOfBoundsException.class);
		panel.lowerPin(6, 7);
	}
	
	@Test
	public void testIndexOutOfBoundsExceptionLowerPin3(){
		exception.expect(IndexOutOfBoundsException.class);
		panel.lowerPin(2, -3);
	}
	
	@Test
	public void testIndexOutOfBoundsExceptionLowerPin4(){
		exception.expect(IndexOutOfBoundsException.class);
		panel.lowerPin(-1, 4);
	}
	
	@Test
	public void testIndexOutOfBoundsExceptionLowerPin5(){
		exception.expect(IndexOutOfBoundsException.class);
		panel.lowerPin(1000, 454);
	}
	
	@Test
	public void testIndexOutOfBoundsExceptionLowerPin6(){
		exception.expect(IndexOutOfBoundsException.class);
		panel.lowerPin(-90, -21);
	}
	
	@Test
	public void testIndexOutOfBoundsExceptionReset(){
		exception.expect(IndexOutOfBoundsException.class);
		panel.reset(5);
	}
	
	@Test
	public void testIndexOutOfBoundsExceptionReset2(){
		exception.expect(IndexOutOfBoundsException.class);
		panel.reset(55);
	}
	
	@Test
	public void testIndexOutOfBoundsExceptionReset3(){
		exception.expect(IndexOutOfBoundsException.class);
		panel.reset(-2);
	}
	
	@Test
	public void testIndexOutOfBoundsExceptionReset4(){
		exception.expect(IndexOutOfBoundsException.class);
		panel.reset(-444);
	}
	
	@Test
	public void testIndexOutOfBoundsExceptionReset5(){
		exception.expect(IndexOutOfBoundsException.class);
		panel.reset(987878);
	}
	
	@Test
	public void testIndexOutOfBoundsExceptionSetCharToBraillePins(){
		exception.expect(IndexOutOfBoundsException.class);
		panel.setCharToBraillePins(5, 'b');
	}
	
	@Test
	public void testIndexOutOfBoundsExceptionSetCharToBraillePins2(){
		exception.expect(IndexOutOfBoundsException.class);
		panel.setCharToBraillePins(999, 'd');
	}
	
	@Test
	public void testIndexOutOfBoundsExceptionSetCharToBraillePins3(){
		exception.expect(IndexOutOfBoundsException.class);
		panel.setCharToBraillePins(-3, 'f');
	}
	
	@Test
	public void testIndexOutOfBoundsExceptionSetCharToBraillePins4(){
		exception.expect(IndexOutOfBoundsException.class);
		panel.setCharToBraillePins(-465, 'z');
	}
	
	@Test
	public void testIllegalArgumentExceptionSetCharToBraillePins(){
		exception.expect(IllegalArgumentException.class);
		panel.setCharToBraillePins(0, '!');
	}
	
	@Test
	public void testIllegalArgumentExceptionSetCharToBraillePins2(){
		exception.expect(IllegalArgumentException.class);
		panel.setCharToBraillePins(0, '.');
	}
	
	@Test
	public void testIllegalArgumentExceptionSetCharToBraillePins3(){
		exception.expect(IllegalArgumentException.class);
		panel.setCharToBraillePins(0, '+');
	}
	
	@Test
	public void testIllegalArgumentExceptionSetCharToBraillePins4(){
		exception.expect(IllegalArgumentException.class);
		panel.setCharToBraillePins(0, '*');
	}
	
	@Test
	public void testIndexOutOfBoundsExceptionCheckPinRaised(){
		exception.expect(IndexOutOfBoundsException.class);
		panel.checkPinRaised(5, 6);
	}
	
	@Test
	public void testIndexOutOfBoundsExceptionCheckPinRaised2(){
		exception.expect(IndexOutOfBoundsException.class);
		panel.checkPinRaised(0, 8);
	}
	
	@Test
	public void testIndexOutOfBoundsExceptionCheckPinRaised3(){
		exception.expect(IndexOutOfBoundsException.class);
		panel.checkPinRaised(3, -6);
	}
	
	@Test
	public void testIndexOutOfBoundsExceptionCheckPinRaised4(){
		exception.expect(IndexOutOfBoundsException.class);
		panel.checkPinRaised(-5, 2);
	}
	
	@Test
	public void testIndexOutOfBoundsExceptionCheckPinRaised5(){
		exception.expect(IndexOutOfBoundsException.class);
		panel.checkPinRaised(8999, 12022);
	}
	
	@Test
	public void testIndexOutOfBoundsExceptionCheckPinRaised6(){
		exception.expect(IndexOutOfBoundsException.class);
		panel.checkPinRaised(-34, -9);
	}
	
	@Test
	public void testIllegalArgumentExceptionSetSize(){
		exception.expect(IllegalArgumentException.class);
		panel.setSize(499, 500);
	}

	@Test
	public void testIllegalArgumentExceptionSetSize2(){
		exception.expect(IllegalArgumentException.class);
		panel.setSize(500, 499);
	}

	@Test
	public void testIllegalArgumentExceptionSetSize3(){
		exception.expect(IllegalArgumentException.class);
		panel.setSize(106, 522);
	}

	@Test
	public void testIllegalArgumentExceptionSetSize4(){
		exception.expect(IllegalArgumentException.class);
		panel.setSize(999, -455);
	}

	@Test
	public void testIllegalArgumentExceptionSetSize5(){
		exception.expect(IllegalArgumentException.class);
		panel.setSize(-900, 600);
	}

	@Test
	public void testIllegalArgumentExceptionSetSize6(){
		exception.expect(IllegalArgumentException.class);
		panel.setSize(-800, -555);
	}

}
