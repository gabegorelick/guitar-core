package edu.umd.cs.guitar.model.data;

import java.util.ArrayList;
import java.util.List;
import junit.framework.TestCase;

public class EventsTypeTest extends TestCase {

	/**
	 * Test of getEvent method, of class EventsType.
	 */
	public void testGetEvent() {
		EventsType instance = new EventsType();
		List<EventType> expResult = new ArrayList<EventType>();

		/* test 1 - event = null */
		List<EventType> result = instance.getEvent();
		assertEquals(expResult, result);

		/* test 2 - event != null */
		instance.event = expResult;
		result = instance.getEvent();
		assertEquals(expResult, result);
	}

	/**
	 * Test of setEvent method, of class EventsType.
	 */
	public void testSetEvent() {
		List<EventType> event = new ArrayList<EventType>();
		EventsType instance = new EventsType();
		instance.setEvent(event);
		assertEquals(instance.event, event);
	}

}
