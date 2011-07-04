/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.umd.cs.guitar.model.wrapper;

import java.util.ArrayList;

import junit.framework.TestCase;
import edu.umd.cs.guitar.model.data.GUIStructure;
import edu.umd.cs.guitar.model.data.GUIType;

/**
 *
 * @author user
 */
public class GUIStructureWrapperTest extends TestCase {
    
    public GUIStructureWrapperTest(String testName) {
        super(testName);
    }

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * Test of addGUI method, of class GUIStructureWrapper.
     */
    public void testAddGUI_GUIType() {
        System.out.println("addGUI");
        GUIType dGUI = new GUIType();
        GUIStructureWrapper instance = new GUIStructureWrapper(new GUIStructure());
        instance.dGUIStructure.setGUI(new ArrayList());
        instance.addGUI(dGUI);
        assert(instance.dGUIStructure.getGUI().contains(dGUI));
    }

}
