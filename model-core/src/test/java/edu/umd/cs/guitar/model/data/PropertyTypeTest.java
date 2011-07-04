package edu.umd.cs.guitar.model.data;

import java.util.ArrayList;
import java.util.List;
import junit.framework.TestCase;

public class PropertyTypeTest extends TestCase {

	/**
	 * Test of getName method, of class PropertyType.
	 */
	public void testGetName() {
		PropertyType instance = new PropertyType();
		String expResult = "";
		instance.name = expResult;
		String result = instance.getName();
		assertEquals(expResult, result);
	}

	/**
	 * Test of setName method, of class PropertyType.
	 */
	public void testSetName() {
		String value = "";
		PropertyType instance = new PropertyType();
		instance.setName(value);
		assertEquals(instance.name, value);
	}

	/**
	 * Test of getValue method, of class PropertyType.
	 */
	public void testGetValue() {
		PropertyType instance = new PropertyType();
		List<String> expResult = new ArrayList<String>();

		/* Test 1 - value = null */
		List<String> result = instance.getValue();
		assertEquals(expResult, result);

		/* Test 2 - value != null */
		instance.value = expResult;
		result = instance.getValue();
		assertEquals(expResult, result);

	}

	/**
	 * Test of setValue method, of class PropertyType.
	 */
	public void testSetValue() {
		List<String> value = new ArrayList<String>();
		PropertyType instance = new PropertyType();
		instance.setValue(value);
		assertEquals(instance.value, value);
	}

}
