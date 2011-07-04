package edu.umd.cs.guitar.model.data;

import junit.framework.TestCase;

public class EventTypeTest extends TestCase {

	/**
	 * Test of getEventId method, of class EventType.
	 */
	public void testGetEventId() {
		EventType instance = new EventType();
		String expResult = "";
		instance.eventId = expResult;
		String result = instance.getEventId();
		assertEquals(expResult, result);
	}

	/**
	 * Test of setEventId method, of class EventType.
	 */
	public void testSetEventId() {
		String value = "";
		EventType instance = new EventType();
		instance.setEventId(value);
		assertEquals(instance.eventId, value);
	}

	/**
	 * Test of getWidgetId method, of class EventType.
	 */
	public void testGetWidgetId() {
		EventType instance = new EventType();
		String expResult = "";
		instance.widgetId = expResult;
		String result = instance.getWidgetId();
		assertEquals(expResult, result);
	}

	/**
	 * Test of setWidgetId method, of class EventType.
	 */
	public void testSetWidgetId() {
		String value = "";
		EventType instance = new EventType();
		instance.setWidgetId(value);
		assertEquals(instance.widgetId, value);
	}

	/**
	 * Test of getType method, of class EventType.
	 */
	public void testGetType() {
		EventType instance = new EventType();
		String expResult = "";
		instance.type = expResult;
		String result = instance.getType();
		assertEquals(expResult, result);
	}

	/**
	 * Test of setType method, of class EventType.
	 */
	public void testSetType() {
		String value = "";
		EventType instance = new EventType();
		instance.setType(value);
		assertEquals(instance.type, value);
	}

	/**
	 * Test of isInitial method, of class EventType.
	 */
	public void testIsInitial() {
		EventType instance = new EventType();
		boolean expResult = false;
		instance.initial = expResult;
		boolean result = instance.isInitial();
		assertEquals(expResult, result);
	}

	/**
	 * Test of setInitial method, of class EventType.
	 */
	public void testSetInitial() {
		boolean value = false;
		EventType instance = new EventType();
		instance.setInitial(value);
		assertEquals(instance.initial, value);
	}

	/**
	 * Test of getAction method, of class EventType.
	 */
	public void testGetAction() {
		EventType instance = new EventType();
		String expResult = "";
		instance.action = expResult;
		String result = instance.getAction();
		assertEquals(expResult, result);
	}

	/**
	 * Test of setAction method, of class EventType.
	 */
	public void testSetAction() {
		String value = "";
		EventType instance = new EventType();
		instance.setAction(value);
		assertEquals(instance.action, value);
	}

	/**
	 * Test of getOptional method, of class EventType.
	 */
	public void testGetOptional() {
		EventType instance = new EventType();
		AttributesType expResult = new AttributesType();
		instance.optional = expResult;
		AttributesType result = instance.getOptional();
		assertEquals(expResult, result);
	}

	/**
	 * Test of setOptional method, of class EventType.
	 */
	public void testSetOptional() {
		AttributesType value = new AttributesType();
		EventType instance = new EventType();
		instance.setOptional(value);
		assertEquals(instance.optional, value);
	}

}
