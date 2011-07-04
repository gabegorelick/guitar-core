package edu.umd.cs.guitar.model.data;

import java.util.ArrayList;
import java.util.List;
import junit.framework.TestCase;

public class RowTypeTest extends TestCase {

	/**
	 * Test of getE method, of class RowType.
	 */
	public void testGetE() {
		RowType instance = new RowType();
		List<Integer> expResult = new ArrayList<Integer>();

		/* Test 1 - e = null */
		List<Integer> result = instance.getE();
		assertEquals(expResult, result);

		/* Test 2 - e != null */
		instance.e = expResult;
		result = instance.getE();
		assertEquals(expResult, result);

	}

	/**
	 * Test of setE method, of class RowType.
	 */
	public void testSetE() {
		List<Integer> e = new ArrayList<Integer>();
		RowType instance = new RowType();
		instance.setE(e);
		assertEquals(instance.e, e);
	}

}
