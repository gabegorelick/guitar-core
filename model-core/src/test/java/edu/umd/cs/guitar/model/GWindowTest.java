package edu.umd.cs.guitar.model;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;
import edu.umd.cs.guitar.model.data.ComponentType;
import edu.umd.cs.guitar.model.data.GUIType;
import edu.umd.cs.guitar.model.data.PropertyType;
import edu.umd.cs.guitar.model.wrapper.ComponentTypeWrapper;
import edu.umd.cs.guitar.model.wrapper.PropertyTypeWrapper;

public class GWindowTest extends TestCase {

	/**
	 * Test of extractWindow method, of class GWindow.
	 */
	public void testExtractWindow() {
		/*
		 * Test 1 guiproperties null
		 */
		GWindowImpl instance = new GWindowImpl();
		instance.modal = true;
		instance.isRoot = true;
		instance.guiproplist = null;

		GUIType result = instance.extractWindow();
		List<PropertyType> resultProps = result.getWindow().getAttributes()
				.getProperty();
		ComponentTypeWrapper expComp = new ComponentTypeWrapper(
				new ComponentType());
		expComp.addValueByName(GUITARConstants.ID_TAG_NAME, "test");
		expComp.addValueByName(GUITARConstants.MODAL_TAG_NAME, "" + true);
		expComp.addValueByName(GUITARConstants.ROOTWINDOW_TAG_NAME, "" + true);

		List<PropertyTypeWrapper> retProp = new ArrayList<PropertyTypeWrapper>();
		for (int i = 0; i < resultProps.size(); i++) {
			retProp.add(new PropertyTypeWrapper(resultProps.get(i)));
		}
		List<PropertyType> expP = expComp.getDComponentType().getAttributes()
				.getProperty();
		List<PropertyTypeWrapper> expProp = new ArrayList<PropertyTypeWrapper>();
		for (int i = 0; i < expP.size(); i++) {
			expProp.add(new PropertyTypeWrapper(expP.get(i)));
		}

		assertNotNull(result.getContainer());
		assertNotNull(result.getContainer().getContents());

		/*
		 * Test 2 gui properties not null
		 */
		instance = new GWindowImpl();
		instance.modal = true;
		instance.isRoot = true;
		instance.guiproplist = new ArrayList<PropertyType>();

		result = instance.extractWindow();
		resultProps = result.getWindow().getAttributes().getProperty();
		expComp = new ComponentTypeWrapper(new ComponentType());
		expComp.addValueByName(GUITARConstants.ID_TAG_NAME, "test");
		expComp.addValueByName(GUITARConstants.MODAL_TAG_NAME, "" + true);
		expComp.addValueByName(GUITARConstants.ROOTWINDOW_TAG_NAME, "" + true);

		retProp = new ArrayList<PropertyTypeWrapper>();
		for (int i = 0; i < resultProps.size(); i++) {
			retProp.add(new PropertyTypeWrapper(resultProps.get(i)));
		}
		expP = expComp.getDComponentType().getAttributes().getProperty();
		expProp = new ArrayList<PropertyTypeWrapper>();
		for (int i = 0; i < expP.size(); i++) {
			expProp.add(new PropertyTypeWrapper(expP.get(i)));
		}

		assertNotNull(result.getContainer());
		assertNotNull(result.getContainer().getContents());
	}

	/**
	 * Test of isRoot method, of class GWindow.
	 */
	public void testIsRoot() {
		/* sets root */
		GWindowImpl instance = new GWindowImpl();
		instance.isRoot = true;
		assertEquals(true, instance.isRoot());
		instance.isRoot = false;
		assertEquals(false, instance.isRoot());
	}

	/**
	 * Test of setRoot method, of class GWindow.
	 */
	public void testSetRoot() {
		GWindowImpl instance = new GWindowImpl();
		instance.setRoot(true);
		assertEquals(true, instance.isRoot);
		instance.setRoot(false);
		assertEquals(false, instance.isRoot);
	}

	private class GWindowImpl extends GWindow {
		boolean modal;
		List<PropertyType> guiproplist;
		GComponent container;

		public GComponent getContainer() {
			return container;
		}

		public List<PropertyType> getGUIProperties() {
			return guiproplist;
		}

		public GUIType extractGUIProperties() {
			return null;
		}

		public boolean isModal() {
			return modal;
		}

		public boolean equals(Object window) {
			return false;
		}

		public boolean isValid() {
			return false;
		}

		public String getTitle() {
			return null;// real value needs to be put here
		}

		@Override
		public int getX() {
			// TODO Auto-generated method stub
			return 0;
		}

		@Override
		public int getY() {
			// TODO Auto-generated method stub
			return 0;
		}
	}

}
