package edu.umd.cs.guitar.model.data;

import java.util.ArrayList;
import java.util.List;
import junit.framework.TestCase;

public class AttributesTypeTest extends TestCase {

	/**
	 * Test of getProperty method, of class AttributesType. Test Case 1 -
	 * property is null Test 2 - property returned is the one set manually
	 * 
	 */
	public void testGetProperty() {
		AttributesType attrType = new AttributesType();
		List<PropertyType> proplist = new ArrayList<PropertyType>();

		/* Test 1 - property is null */
		assertEquals(attrType.getProperty(), proplist);

		/* Test 2 - property returned is the one set manually */
		attrType.property = proplist;
		assertEquals(attrType.getProperty(), proplist);
	}

	/**
	 * Test of setProperty method, of class AttributesType.
	 */
	public void testSetProperty() {
		AttributesType attrType = new AttributesType();
		List<PropertyType> proplist = new ArrayList<PropertyType>();
		/* Test 1 - setting empty array list */
		attrType.setProperty(proplist);
		assertEquals(attrType.property, proplist);
	}

}
