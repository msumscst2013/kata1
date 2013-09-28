package org.kata1;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringAdditionTest {

	private StringAddition testClass = new StringAddition();
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testParseStringWithBestCase() {
		Integer [] ints = testClass.parseString("1,2,3,4,5,6");
		assertEquals(ints.length, 6);
	}

}
