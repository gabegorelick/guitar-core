package edu.umd.cs.guitar.model.data;

import junit.framework.TestCase;

public class ComponentTypeTest extends TestCase {

	/**
	 * Test of getAttributes method, of class ComponentType.
	 */
	public void testGetAttributes() {
		ComponentType compType = new ComponentType();
		AttributesType expResult = new AttributesType();
		compType.attributes = expResult;
		AttributesType result = compType.getAttributes();
		assertEquals(expResult, result);
	}

	/**
	 * Test of setAttributes method, of class ComponentType.
	 */
	public void testSetAttributes() {
		AttributesType value = new AttributesType();
		ComponentType instance = new ComponentType();
		instance.setAttributes(value);
		assertEquals(instance.attributes, value);
	}

}
