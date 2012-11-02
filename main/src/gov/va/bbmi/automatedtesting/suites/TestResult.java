package gov.va.bbmi.automatedtesting.suites;

/**
 * Results of a single test.
 * @author jspivey
 *
 */
public class TestResult {
	
	private String testName; //required
	private boolean pass; //required
	//private String message; //optional message
	private Throwable throwable; //optional, should be present if an exception happened
	
	public TestResult(String testName, boolean pass, Throwable throwable) {
		super();
		this.testName = testName;
		this.pass = pass;
		this.throwable = throwable;
	}

	public TestResult(String testName, boolean pass) {
		super();
		this.testName = testName;
		this.pass = pass;
	}
	
	public String getTestName() {
		return testName;
	}

	public boolean isPass() {
		return pass;
	}

	public Throwable getThrowable() {
		return throwable;
	}


}
