package edu.umd.cs.guitar.model.data;

import java.util.ArrayList;
import java.util.List;
import junit.framework.TestCase;

public class EventGraphTypeTest extends TestCase {

	/**
	 * Test of getRow method, of class EventGraphType.
	 */
	public void testGetRow() {
		EventGraphType instance = new EventGraphType();
		List<RowType> expResult = new ArrayList<RowType>();

		/* Test 1 - row = null */
		List<RowType> result = instance.getRow();
		assertEquals(expResult, result);

		/* Test 2 - row != null */
		instance.row = expResult;
		result = instance.getRow();
		assertEquals(expResult, result);

	}

	/**
	 * Test of setRow method, of class EventGraphType.
	 */
	public void testSetRow() {
		List<RowType> row = new ArrayList<RowType>();
		EventGraphType instance = new EventGraphType();
		instance.setRow(row);
		assertEquals(instance.row, row);

	}

}
