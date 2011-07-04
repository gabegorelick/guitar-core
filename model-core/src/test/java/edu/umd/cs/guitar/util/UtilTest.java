package edu.umd.cs.guitar.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import junit.framework.TestCase;

public class UtilTest extends TestCase {

	/**
	 * Test of getTimeStamp method, of class Util.
	 */
	public void testGetTimeStamp() {
		DateFormat df = new SimpleDateFormat("yyyyMMddhhmmss");
		df.setTimeZone(TimeZone.getTimeZone("GMT"));
		String expResult = df.format(new Date());
		String result = Util.getTimeStamp();

		/* check for small variation in two strings */
		assert (expResult.startsWith(result.substring(0, 11)));
	}

}
