package eecs2311simulator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BraillerTester {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		String [] testing = Braille.getChoices ();
		assertTrue("Yes it works! Answer: " + testing [0] + " || Option 1: " + testing [1] + " || Option 2: " + testing [2] + " || Option 3: " + testing [3],
				testing[0].equals(testing[1]) || testing[0].equals(testing[2])|| testing[0].equals(testing[3])); 
	}
	
	@Test
	
	public void falseTest () 
	{
		String [] testing = Braille.getChoices ();
		assertFalse("Yes it works! Answer: " + testing [0] + " || Option 1: " + testing [1] + " || Option 2: " + testing [2] + " || Option 3: " + testing [3], testing[0].equals(testing[1]) 
				|| testing[0].equals(testing[2])|| testing[0].equals(testing[3])); 
	}

}
