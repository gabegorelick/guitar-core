package edu.umd.cs.guitar.model.data;

import java.util.ArrayList;
import java.util.List;
import junit.framework.TestCase;

public class GUIStructureTest extends TestCase {

	/**
	 * Test of getGUI method, of class GUIStructure.
	 */
	public void testGetGUI() {
		GUIStructure instance = new GUIStructure();
		List<GUIType> expResult = new ArrayList<GUIType>();

		/* Test 1 - gui = null */
		List<GUIType> result = instance.getGUI();
		assertEquals(expResult, result);

		/* Test 2 - gui != null */
		instance.gui = expResult;
		result = instance.getGUI();
		assertEquals(expResult, result);
	}

	/**
	 * Test of setGUI method, of class GUIStructure.
	 */
	public void testSetGUI() {
		List<GUIType> gui = new ArrayList<GUIType>();
		GUIStructure instance = new GUIStructure();
		instance.setGUI(gui);
		assertEquals(instance.gui, gui);
	}

}
