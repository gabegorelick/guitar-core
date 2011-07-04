package edu.umd.cs.guitar.model.data;

import junit.framework.TestCase;

public class ConfigurationTest extends TestCase {

	/**
	 * Test of getIgnoredComponents method, of class Configuration.
	 */
	public void testGetIgnoredComponents() {
		Configuration instance = new Configuration();
		ComponentListType expResult = new ComponentListType();
		instance.ignoredComponents = expResult;
		ComponentListType result = instance.getIgnoredComponents();
		assertEquals(expResult, result);
	}

	/**
	 * Test of setIgnoredComponents method, of class Configuration.
	 */
	public void testSetIgnoredComponents() {
		ComponentListType value = new ComponentListType();
		Configuration instance = new Configuration();
		instance.setIgnoredComponents(value);
		assertEquals(instance.ignoredComponents, value);
	}

	/**
	 * Test of getTerminalComponents method, of class Configuration.
	 */
	public void testGetTerminalComponents() {
		Configuration instance = new Configuration();
		ComponentListType expResult = new ComponentListType();
		instance.terminalComponents = expResult;
		ComponentListType result = instance.getTerminalComponents();
		assertEquals(expResult, result);
	}

	/**
	 * Test of setTerminalComponents method, of class Configuration.
	 */
	public void testSetTerminalComponents() {
		ComponentListType value = new ComponentListType();
		Configuration instance = new Configuration();
		instance.setTerminalComponents(value);
		assertEquals(instance.terminalComponents, value);
	}

}
