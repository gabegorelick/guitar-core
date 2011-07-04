package edu.umd.cs.guitar.model.wrapper;

import java.util.ArrayList;

import junit.framework.TestCase;
import edu.umd.cs.guitar.model.data.GUIStructure;
import edu.umd.cs.guitar.model.data.GUIType;

public class GUIStructureWrapperTest extends TestCase {

	/**
	 * Test of addGUI method, of class GUIStructureWrapper.
	 */
	public void testAddGUI_GUIType() {
		GUIType dGUI = new GUIType();
		GUIStructureWrapper instance = new GUIStructureWrapper(new GUIStructure());
		instance.dGUIStructure.setGUI(new ArrayList<GUIType>());
		instance.addGUI(dGUI);
		assert (instance.dGUIStructure.getGUI().contains(dGUI));
	}

}
