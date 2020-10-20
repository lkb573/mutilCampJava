package com.multicampus.biz.junit3;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(AllTests.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(MyCalcTest.class);
		suite.addTestSuite(UserServiceTest.class);
		//$JUnit-END$
		return suite;
	}

}
