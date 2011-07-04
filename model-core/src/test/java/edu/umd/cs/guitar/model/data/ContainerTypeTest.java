package edu.umd.cs.guitar.model.data;

import junit.framework.TestCase;

public class ContainerTypeTest extends TestCase {

	/**
	 * Test of getContents method, of class ContainerType.
	 */
	public void testGetContents() {
		ContainerType instance = new ContainerType();
		ContentsType expResult = new ContentsType();
		instance.contents = expResult;
		ContentsType result = instance.getContents();
		assertEquals(expResult, result);
	}

	/**
	 * Test of setContents method, of class ContainerType.
	 */
	public void testSetContents() {
		ContentsType value = new ContentsType();
		ContainerType instance = new ContainerType();
		instance.setContents(value);
		assertEquals(instance.contents, value);
	}

}
