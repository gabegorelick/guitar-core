/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.umd.cs.guitar.event;

import java.util.Hashtable;
import java.util.List;

import junit.framework.TestCase;
import edu.umd.cs.guitar.model.GComponent;

/**
 *
 * @author user
 */
public class GThreadEventTest extends TestCase {
    
    public GThreadEventTest(String testName) {
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

    public class GThreadEventImpl extends GThreadEvent {

        public void performImpl(GComponent gComponent) {
        }

        public void performImpl(GComponent gComponent, Object parameters) {
        }

		@Override
		public boolean isSupportedBy(GComponent gComponent) {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		protected void performImpl(GComponent gComponent,
				Hashtable<String, List<String>> optionalData) {
			// TODO Auto-generated method stub
			
		}

		@Override
		protected void performImpl(GComponent gComponent, Object parameters,
				Hashtable<String, List<String>> optionalData) {
			// TODO Auto-generated method stub
			
		}
    }

}
