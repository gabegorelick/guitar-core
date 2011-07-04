package edu.umd.cs.guitar.model.data;

import java.util.ArrayList;
import java.util.List;
import junit.framework.TestCase;

public class ContentsTypeTest extends TestCase {

	/**
	 * Test of getWidgetOrContainer method, of class ContentsType.
	 */
	public void testGetWidgetOrContainer() {
		ContentsType instance = new ContentsType();
		List<ComponentType> expResult = new ArrayList<ComponentType>();

		/* Test 1 - widgetOrContainer is null */
		List<ComponentType> result = instance.getWidgetOrContainer();
		assertEquals(expResult, result);

		/* Test 2 - widgetOrContainer is not null */
		instance.widgetOrContainer = expResult;
		result = instance.getWidgetOrContainer();
		assertEquals(result, expResult);

	}

	/**
	 * Test of setWidgetOrContainer method, of class ContentsType.
	 */
	public void testSetWidgetOrContainer() {
		List<ComponentType> widgetOrContainer = new ArrayList<ComponentType>();
		ContentsType instance = new ContentsType();
		instance.setWidgetOrContainer(widgetOrContainer);
		assertEquals(instance.widgetOrContainer, widgetOrContainer);
	}

}
