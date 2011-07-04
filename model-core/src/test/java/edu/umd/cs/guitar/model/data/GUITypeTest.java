package edu.umd.cs.guitar.model.data;

import junit.framework.TestCase;

public class GUITypeTest extends TestCase {

	/**
	 * Test of getWindow method, of class GUIType.
	 */
	public void testGetWindow() {
		GUIType instance = new GUIType();
		ComponentType expResult = new ComponentType();
		instance.window = expResult;
		ComponentType result = instance.getWindow();
		assertEquals(expResult, result);
	}

	/**
	 * Test of setWindow method, of class GUIType.
	 */
	public void testSetWindow() {
		ComponentType value = new ComponentType();
		GUIType instance = new GUIType();
		instance.setWindow(value);
		assertEquals(instance.window, value);
	}

	/**
	 * Test of getContainer method, of class GUIType.
	 */
	public void testGetContainer() {
		GUIType instance = new GUIType();
		ContainerType expResult = new ContainerType();
		instance.container = expResult;
		ContainerType result = instance.getContainer();
		assertEquals(expResult, result);
	}

	/**
	 * Test of setContainer method, of class GUIType.
	 */
	public void testSetContainer() {
		ContainerType value = new ContainerType();
		GUIType instance = new GUIType();
		instance.setContainer(value);
		assertEquals(instance.container, value);
	}

}
