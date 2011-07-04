package edu.umd.cs.guitar.model.data;

import junit.framework.TestCase;

public class ObjectFactoryTest extends TestCase {

	/**
	 * Test of createComponentListType method, of class ObjectFactory.
	 */
	public void testCreateComponentListType() {
		ObjectFactory instance = new ObjectFactory();
		ComponentListType result = instance.createComponentListType();
		assert (result instanceof ComponentListType);
	}

	/**
	 * Test of createEFG method, of class ObjectFactory.
	 */
	public void testCreateEFG() {
		ObjectFactory instance = new ObjectFactory();
		EFG result = instance.createEFG();
		assert (result instanceof EFG);
	}

	/**
	 * Test of createContainerType method, of class ObjectFactory.
	 */
	public void testCreateContainerType() {
		ObjectFactory instance = new ObjectFactory();
		ContainerType result = instance.createContainerType();
		assert (result instanceof ContainerType);
	}

	/**
	 * Test of createFullComponentType method, of class ObjectFactory.
	 */
	public void testCreateFullComponentType() {
		ObjectFactory instance = new ObjectFactory();
		FullComponentType result = instance.createFullComponentType();
		assert (result instanceof FullComponentType);
	}

	/**
	 * Test of createEventsType method, of class ObjectFactory.
	 */
	public void testCreateEventsType() {
		ObjectFactory instance = new ObjectFactory();
		EventsType result = instance.createEventsType();
		assert (result instanceof EventsType);
	}

	/**
	 * Test of createEventGraphType method, of class ObjectFactory.
	 */
	public void testCreateEventGraphType() {
		ObjectFactory instance = new ObjectFactory();
		EventGraphType result = instance.createEventGraphType();
		assert (result instanceof EventGraphType);
	}

	/**
	 * Test of createComponentType method, of class ObjectFactory.
	 */
	public void testCreateComponentType() {
		ObjectFactory instance = new ObjectFactory();
		ComponentType result = instance.createComponentType();
		assert (result instanceof ComponentType);
	}

	/**
	 * Test of createAttributesType method, of class ObjectFactory.
	 */
	public void testCreateAttributesType() {
		ObjectFactory instance = new ObjectFactory();
		AttributesType result = instance.createAttributesType();
		assert (result instanceof AttributesType);
	}

	/**
	 * Test of createContentsType method, of class ObjectFactory.
	 */
	public void testCreateContentsType() {
		ObjectFactory instance = new ObjectFactory();
		ContentsType result = instance.createContentsType();
		assert (result instanceof ContentsType);
	}

	/**
	 * Test of createConfiguration method, of class ObjectFactory.
	 */
	public void testCreateConfiguration() {
		ObjectFactory instance = new ObjectFactory();
		Configuration result = instance.createConfiguration();
		assert (result instanceof Configuration);
	}

	/**
	 * Test of createTestCase method, of class ObjectFactory.
	 */
	public void testCreateTestCase() {
		ObjectFactory instance = new ObjectFactory();
		edu.umd.cs.guitar.model.data.TestCase result = instance
				.createTestCase();
		assert (result instanceof edu.umd.cs.guitar.model.data.TestCase);
	}

	/**
	 * Test of createGUIStructure method, of class ObjectFactory.
	 */
	public void testCreateGUIStructure() {
		ObjectFactory instance = new ObjectFactory();
		GUIStructure result = instance.createGUIStructure();
		assert (result instanceof GUIStructure);
	}

	/**
	 * Test of createGUIType method, of class ObjectFactory.
	 */
	public void testCreateGUIType() {
		ObjectFactory instance = new ObjectFactory();
		GUIType result = instance.createGUIType();
		assert (result instanceof GUIType);
	}

	/**
	 * Test of createRowType method, of class ObjectFactory.
	 */
	public void testCreateRowType() {
		ObjectFactory instance = new ObjectFactory();
		RowType result = instance.createRowType();
		assert (result instanceof RowType);
	}

	/**
	 * Test of createEventType method, of class ObjectFactory.
	 */
	public void testCreateEventType() {
		ObjectFactory instance = new ObjectFactory();
		EventType result = instance.createEventType();
		assert (result instanceof EventType);
	}

	/**
	 * Test of createStepType method, of class ObjectFactory.
	 */
	public void testCreateStepType() {
		ObjectFactory instance = new ObjectFactory();
		StepType result = instance.createStepType();
		assert (result instanceof StepType);
	}

	/**
	 * Test of createPropertyType method, of class ObjectFactory.
	 */
	public void testCreatePropertyType() {
		ObjectFactory instance = new ObjectFactory();
		PropertyType result = instance.createPropertyType();
		assert (result instanceof PropertyType);
	}

}
