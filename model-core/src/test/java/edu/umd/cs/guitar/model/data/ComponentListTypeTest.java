package edu.umd.cs.guitar.model.data;

import java.util.ArrayList;
import java.util.List;
import junit.framework.TestCase;

public class ComponentListTypeTest extends TestCase {

	/**
	 * Test of getFullComponent method, of class ComponentListType.
	 */
	public void testGetFullComponent() {
		ComponentListType attrType = new ComponentListType();
		List<FullComponentType> proplist = new ArrayList<FullComponentType>();

		/* Test 1 - fullComponent is null */
		assertEquals(attrType.getFullComponent(), proplist);

		/* Test 2 - fullComponent returned is the one set manually */
		attrType.fullComponent = proplist;
		assertEquals(attrType.getFullComponent(), proplist);
	}

	/**
	 * Test of setFullComponent method, of class ComponentListType.
	 */
	public void testSetFullComponent() {
		ComponentListType attrType = new ComponentListType();
		List<FullComponentType> proplist = new ArrayList<FullComponentType>();
		/* Test 1 - setting empty array list */
		attrType.setFullComponent(proplist);
		assertEquals(attrType.fullComponent, proplist);
	}

}
