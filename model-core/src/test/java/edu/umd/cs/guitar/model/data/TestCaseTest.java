package edu.umd.cs.guitar.model.data;

import java.util.ArrayList;
import java.util.List;
import junit.framework.TestCase;

public class TestCaseTest extends TestCase {

	/**
	 * Test of getStep method, of class TestCase.
	 */
	public void testGetStep() {
		edu.umd.cs.guitar.model.data.TestCase instance = new edu.umd.cs.guitar.model.data.TestCase();
		List<StepType> expResult = new ArrayList<StepType>();

		/* Test 1 - step = null */
		List<StepType> result = instance.getStep();
		assertEquals(expResult, result);

		/* Test 2 - step != null */
		instance.step = expResult;
		result = instance.getStep();
		assertEquals(expResult, result);
	}

	/**
	 * Test of setStep method, of class TestCase.
	 */
	public void testSetStep() {
		List<StepType> step = new ArrayList<StepType>();
		edu.umd.cs.guitar.model.data.TestCase instance = new edu.umd.cs.guitar.model.data.TestCase();
		instance.setStep(step);
		assertEquals(instance.step, step);
	}

}
