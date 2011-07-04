package edu.umd.cs.guitar.model.wrapper;

import edu.umd.cs.guitar.model.data.AttributesType;
import edu.umd.cs.guitar.model.data.PropertyType;
import java.util.ArrayList;
import java.util.List;
import junit.framework.TestCase;

public class AttributesTypeWrapperTest extends TestCase {

	/**
	 * Test of equals method, of class AttributesTypeWrapper.
	 */
	public void testEquals() {
		AttributesTypeWrapper instance;
		Object compareto;
		boolean expResult;
		boolean result;

		/* Test 1 - objects are the same object */
		expResult = true;
		instance = new AttributesTypeWrapper(new AttributesType());
		result = instance.equals(instance);
		assertEquals(expResult, result);

		/* Test 2 - compare to is null */
		expResult = false;
		instance = new AttributesTypeWrapper(new AttributesType());
		result = instance.equals(null);
		assertEquals(expResult, result);

		/* Test 3 - compare to is of different class */
		expResult = false;
		instance = new AttributesTypeWrapper(new AttributesType());
		result = instance.equals(new AttributesType());
		assertEquals(expResult, result);

		/* Test 4 - wrapped is null and compare to wrapper is not null */
		expResult = false;
		instance = new AttributesTypeWrapper(null);
		compareto = new AttributesTypeWrapper(new AttributesType());
		result = instance.equals(compareto);
		assertEquals(expResult, result);

		/* Test 5 - wrapped is null and compare to wrapped is null */
		expResult = true;
		instance = new AttributesTypeWrapper(null);
		compareto = new AttributesTypeWrapper(null);
		result = instance.equals(compareto);
		assertEquals(expResult, result);

		/* Test 6 - properties of both are null */
		expResult = true;
		instance = new AttributesTypeWrapper(new AttributesType());
		compareto = new AttributesTypeWrapper(new AttributesType());
		result = instance.equals(compareto);
		assertEquals(expResult, result);

		/* Test 8 - properties in each are different */
		expResult = false;
		List<PropertyType> proplist = new ArrayList<PropertyType>();
		PropertyType prop = new PropertyType();
		prop.setName("Test");
		prop.setValue(new ArrayList<String>());
		proplist.add(prop);
		proplist.add(new PropertyType());
		proplist.get(1).setName("test2");
		proplist.get(1).setValue(new ArrayList<String>());
		instance = new AttributesTypeWrapper(new AttributesType());
		instance.dAtrributeType.setProperty(proplist);

		proplist = new ArrayList<PropertyType>();
		proplist.add(new PropertyType());
		proplist.get(0).setName("test2");
		proplist.get(0).setValue(new ArrayList<String>());
		compareto = new AttributesTypeWrapper(new AttributesType());
		((AttributesTypeWrapper) compareto).dAtrributeType.setProperty(proplist);
		result = instance.equals(compareto);
		assertEquals(expResult, result);
	}

	/**
	 * Test of containsAll method, of class AttributesTypeWrapper.
	 */
	public void testContainsAll() {
		AttributesTypeWrapper instance;
		AttributesTypeWrapper compareto;
		boolean expResult;
		boolean result;
		List<PropertyType> proplist;
		PropertyType prop;

		/* Test 1 - properties in first are empty list. other has 1 property */
		expResult = false;
		proplist = new ArrayList<PropertyType>();
		prop = new PropertyType();
		prop.setName("Test");
		prop.setValue(new ArrayList<String>());
		proplist.add(prop);
		instance = new AttributesTypeWrapper(new AttributesType());
		compareto = new AttributesTypeWrapper(new AttributesType());
		instance.dAtrributeType.setProperty(new ArrayList<PropertyType>());
		((AttributesTypeWrapper) compareto).dAtrributeType.setProperty(proplist);
		result = instance.containsAll(compareto);
		assertEquals(expResult, result);

		/* Test 2 - properties in each are same */
		expResult = true;
		proplist = new ArrayList<PropertyType>();
		prop = new PropertyType();
		prop.setName("Test");
		prop.setValue(new ArrayList<String>());
		proplist.add(prop);
		instance = new AttributesTypeWrapper(new AttributesType());
		compareto = new AttributesTypeWrapper(new AttributesType());
		instance.dAtrributeType.setProperty(proplist);
		((AttributesTypeWrapper) compareto).dAtrributeType.setProperty(proplist);
		result = instance.containsAll(compareto);
		assertEquals(expResult, result);

	}

	/**
	 * Test of contains method, of class AttributesTypeWrapper.
	 */
	public void testContains() {
		AttributesTypeWrapper instance;
		boolean expResult;
		boolean result;
		List<PropertyType> proplist;
		PropertyType tofind;

		/* Test 1 - current properties is an empty list */
		expResult = false;

		proplist = new ArrayList<PropertyType>();
		instance = new AttributesTypeWrapper(new AttributesType());
		instance.dAtrributeType.setProperty(proplist);

		tofind = new PropertyType();
		tofind.setName("");
		tofind.setValue(new ArrayList<String>());

		result = instance.contains(tofind);
		assertEquals(expResult, result);

		/*
		 * Test 2 - property list not empty and property not in list of
		 * properties
		 */
		expResult = false;

		proplist = new ArrayList<PropertyType>();
		proplist.add(new PropertyType());
		proplist.get(0).setName("At 1");
		proplist.get(0).setValue(new ArrayList<String>());
		instance = new AttributesTypeWrapper(new AttributesType());
		instance.dAtrributeType.setProperty(proplist);

		tofind = new PropertyType();
		tofind.setName("");
		tofind.setValue(new ArrayList<String>());

		result = instance.contains(tofind);
		assertEquals(expResult, result);

		/*
		 * Test 4 - property list has two elements, tofind is in list of
		 * properties, tofind's value is not null but matching property's value
		 * is empty list
		 */
		expResult = true;

		tofind = new PropertyType();
		tofind.setName("At 2");
		tofind.setValue(new ArrayList<String>());

		proplist = new ArrayList<PropertyType>();
		proplist.add(new PropertyType());
		proplist.get(0).setName("At 1");
		proplist.get(0).setValue(new ArrayList<String>());
		proplist.add(tofind);
		instance = new AttributesTypeWrapper(new AttributesType());
		instance.dAtrributeType.setProperty(proplist);

		result = instance.contains(tofind);
		assertEquals(expResult, result);

		/*
		 * Test 5 - tofind has two strings in value. matches on the first but
		 * fails to match on the second
		 */
		expResult = false;

		tofind = new PropertyType();
		tofind.setName("At 1");
		tofind.setValue(new ArrayList<String>());
		tofind.getValue().add("hello");
		tofind.getValue().add("world");

		proplist = new ArrayList<PropertyType>();
		proplist.add(new PropertyType());
		proplist.get(0).setName("At 1");
		proplist.get(0).setValue(new ArrayList<String>());
		proplist.get(0).getValue().add("hello");

		instance = new AttributesTypeWrapper(new AttributesType());
		instance.dAtrributeType.setProperty(proplist);

		result = instance.contains(tofind);
		assertEquals(expResult, result);
	}

	/**
	 * Test of getPropertyByName method, of class AttributesTypeWrapper.
	 */
	public void testGetPropertyByName() {
		AttributesTypeWrapper instance;
		PropertyType expResult;
		PropertyType result;
		List<PropertyType> proplist;

		/* Test 1 - property list is empty */
		instance = new AttributesTypeWrapper(new AttributesType());
		expResult = null;
		proplist = new ArrayList<PropertyType>();

		instance.dAtrributeType.setProperty(proplist);
		result = instance.getPropertyByName("world");
		assertEquals(expResult, result);

		/* Test 2 - property not in property list */
		instance = new AttributesTypeWrapper(new AttributesType());
		expResult = null;
		proplist = new ArrayList<PropertyType>();
		proplist.add(new PropertyType());
		proplist.get(0).setName("At 1");
		proplist.get(0).setValue(new ArrayList<String>());
		proplist.get(0).getValue().add("hello");

		instance.dAtrributeType.setProperty(proplist);
		result = instance.getPropertyByName("world");
		assertEquals(expResult, result);

		/* Test 3 - property in property list */
		instance = new AttributesTypeWrapper(new AttributesType());
		expResult = new PropertyType();
		expResult.setName("At 1");
		expResult.setValue(new ArrayList<String>());
		proplist = new ArrayList<PropertyType>();
		proplist.add(expResult);

		instance.dAtrributeType.setProperty(proplist);
		result = instance.getPropertyByName("At 1");
		assertEquals(expResult, result);
	}

	/**
	 * Test of getFirstValByName method, of class AttributesTypeWrapper.
	 */
	public void testGetFirstValByName() {
		AttributesTypeWrapper instance;
		String expResult;
		String result;
		List<PropertyType> proplist;

		/* Test 1 - property list is empty */
		instance = new AttributesTypeWrapper(new AttributesType());
		expResult = null;
		proplist = new ArrayList<PropertyType>();

		instance.dAtrributeType.setProperty(proplist);
		result = instance.getFirstValByName("world");
		assertEquals(expResult, result);

		/* Test 2 - property not in property list */
		instance = new AttributesTypeWrapper(new AttributesType());
		expResult = null;
		proplist = new ArrayList<PropertyType>();
		proplist.add(new PropertyType());
		proplist.get(0).setName("At 1");
		proplist.get(0).setValue(new ArrayList<String>());
		proplist.get(0).getValue().add("hello");

		instance.dAtrributeType.setProperty(proplist);
		result = instance.getFirstValByName("world");
		assertEquals(expResult, result);

		/* Test 3 - property in property list */
		expResult = null;
		instance = new AttributesTypeWrapper(new AttributesType());
		instance.dAtrributeType.setProperty(new ArrayList<PropertyType>());
		instance.dAtrributeType.getProperty().add(new PropertyType());
		instance.dAtrributeType.getProperty().get(0).setName("test1");
		instance.dAtrributeType.getProperty().get(0).setValue(new ArrayList<String>());
		result = instance.getFirstValByName("test1");
		assertEquals(expResult, result);

		/* Test 4 - property in property list */
		expResult = "B";
		instance = new AttributesTypeWrapper(new AttributesType());
		instance.dAtrributeType.setProperty(new ArrayList<PropertyType>());
		instance.dAtrributeType.getProperty().add(new PropertyType());
		instance.dAtrributeType.getProperty().get(0).setName("test1");
		instance.dAtrributeType.getProperty().get(0).setValue(new ArrayList<String>());
		instance.dAtrributeType.getProperty().get(0).getValue().add("B");
		result = instance.getFirstValByName("test1");
		assertEquals(expResult, result);
	}

	/**
	 * Test of toString method, of class AttributesTypeWrapper.
	 */
	public void testToString() {
		AttributesTypeWrapper instance;
		String expResult;
		String result;

		/* Test 1 - null attributeType */
		expResult = "";
		instance = new AttributesTypeWrapper(null);
		result = instance.toString();
		assertEquals(expResult, result);

		/*
		 * Test 2 - non-empty properties list Return value isn't actually
		 * possible to assert due to how toString() is implemented.
		 */
		instance = new AttributesTypeWrapper(new AttributesType());
		instance.dAtrributeType.setProperty(new ArrayList<PropertyType>());
		instance.dAtrributeType.getProperty().add(new PropertyType());
		result = instance.toString();
		assertNotSame("", result);
	}

}
