package edu.umd.cs.guitar.model.data;

import java.util.ArrayList;
import java.util.List;
import junit.framework.TestCase;

public class StepTypeTest extends TestCase {

	/**
	 * Test of getEventId method, of class StepType.
	 */
	public void testGetEventId() {
		StepType instance = new StepType();
		String expResult = "";
		instance.eventId = expResult;
		String result = instance.getEventId();
		assertEquals(expResult, result);
	}

	/**
	 * Test of setEventId method, of class StepType.
	 */
	public void testSetEventId() {
		String value = "";
		StepType instance = new StepType();
		instance.setEventId(value);
		assertEquals(instance.eventId, value);
	}

	/**
	 * Test of isReachingStep method, of class StepType.
	 */
	public void testIsReachingStep() {
		StepType instance = new StepType();
		boolean expResult = false;
		instance.reachingStep = expResult;
		boolean result = instance.isReachingStep();
		assertEquals(expResult, result);
	}

	/**
	 * Test of setReachingStep method, of class StepType.
	 */
	public void testSetReachingStep() {
		boolean value = false;
		StepType instance = new StepType();
		instance.setReachingStep(value);
		assertEquals(instance.reachingStep, value);
	}

	/**
	 * Test of getParameter method, of class StepType.
	 */
	public void testGetParameter() {
		StepType instance = new StepType();
		List<String> expResult = new ArrayList<String>();

		/* Test 1 - parameter = null */
		List<String> result = instance.getParameter();
		assertEquals(expResult, result);

		/* Test 2 - parameter != null */
		instance.parameter = expResult;
		result = instance.getParameter();
		assertEquals(expResult, result);
	}

	/**
	 * Test of getOptional method, of class StepType.
	 */
	public void testGetOptional() {
		StepType instance = new StepType();
		AttributesType expResult = new AttributesType();
		instance.optional = expResult;
		AttributesType result = instance.getOptional();
		assertEquals(expResult, result);

	}

	/**
	 * Test of setOptional method, of class StepType.
	 */
	public void testSetOptional() {
		AttributesType value = new AttributesType();
		StepType instance = new StepType();
		instance.setOptional(value);
		assertEquals(instance.optional, value);
	}

	/**
	 * Test of getGUIStructure method, of class StepType.
	 */
	public void testGetGUIStructure() {
		StepType instance = new StepType();
		GUIStructure expResult = new GUIStructure();
		instance.guiStructure = expResult;
		GUIStructure result = instance.getGUIStructure();
		assertEquals(expResult, result);
	}

	/**
	 * Test of setGUIStructure method, of class StepType.
	 */
	public void testSetGUIStructure() {
		GUIStructure value = new GUIStructure();
		StepType instance = new StepType();
		instance.setGUIStructure(value);
		assertEquals(instance.guiStructure, value);
	}

	/**
	 * Test of setParameter method, of class StepType.
	 */
	public void testSetParameter() {
		List<String> parameter = new ArrayList<String>();
		StepType instance = new StepType();
		instance.setParameter(parameter);
		assertEquals(instance.parameter, parameter);
	}

}
