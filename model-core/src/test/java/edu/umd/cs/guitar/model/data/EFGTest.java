package edu.umd.cs.guitar.model.data;

import junit.framework.TestCase;

public class EFGTest extends TestCase {

	/**
	 * Test of getEvents method, of class EFG.
	 */
	public void testGetEvents() {
		EFG instance = new EFG();
		EventsType expResult = new EventsType();
		instance.events = expResult;
		EventsType result = instance.getEvents();
		assertEquals(expResult, result);
	}

	/**
	 * Test of setEvents method, of class EFG.
	 */
	public void testSetEvents() {
		EventsType value = new EventsType();
		EFG instance = new EFG();
		instance.setEvents(value);
		assertEquals(instance.events, value);
	}

	/**
	 * Test of getEventGraph method, of class EFG.
	 */
	public void testGetEventGraph() {
		EFG instance = new EFG();
		EventGraphType expResult = new EventGraphType();
		instance.eventGraph = expResult;
		EventGraphType result = instance.getEventGraph();
		assertEquals(expResult, result);
	}

	/**
	 * Test of setEventGraph method, of class EFG.
	 */
	public void testSetEventGraph() {
		EventGraphType value = new EventGraphType();
		EFG instance = new EFG();
		instance.setEventGraph(value);
		assertEquals(instance.eventGraph, value);
	}

}
