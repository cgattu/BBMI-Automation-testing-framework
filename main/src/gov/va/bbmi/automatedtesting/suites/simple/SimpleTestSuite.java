package gov.va.bbmi.automatedtesting.suites.simple;

import static org.junit.Assert.assertTrue;
import gov.va.bbmi.automatedtesting.ResultsLogWatchMan;

import org.junit.Rule;
import org.junit.Test;

public class SimpleTestSuite {
	
	@Rule
	public ResultsLogWatchMan resultLogWatchMan = ResultsLogWatchMan.getInstance();

	@Test
	public void simpleTestTEstTest1()  {
		throw new RuntimeException();
	}
	
	@Test
	public void simple2() {
		assertTrue(true);
	}
	
	@Test
	public void simpleTest3() {
		assertTrue(false);
	}


}
