package edu.umd.cs.guitar.model.data;

import junit.framework.TestCase;

public class FullComponentTypeTest extends TestCase {
    
    /**
     * Test of getWindow method, of class FullComponentType.
     */
    public void testGetWindow() {
        FullComponentType instance = new FullComponentType();
        ComponentType expResult = new ComponentType();
        instance.window = expResult;
        ComponentType result = instance.getWindow();
        assertEquals(expResult, result);
    }

    /**
     * Test of setWindow method, of class FullComponentType.
     */
    public void testSetWindow() {
        ComponentType value = new ComponentType();
        FullComponentType instance = new FullComponentType();
        instance.setWindow(value);
        assertEquals(instance.window,value);
    }

    /**
     * Test of getComponent method, of class FullComponentType.
     */
    public void testGetComponent() {
        FullComponentType instance = new FullComponentType();
        ComponentType expResult = new ComponentType();
        instance.component=expResult;
        ComponentType result = instance.getComponent();
        assertEquals(expResult, result);
    }

    /**
     * Test of setComponent method, of class FullComponentType.
     */
    public void testSetComponent() {
        ComponentType value = new ComponentType();
        FullComponentType instance = new FullComponentType();
        instance.setComponent(value);
        assertEquals(instance.component,value);
    }

}
