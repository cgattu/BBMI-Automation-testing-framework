package gov.va.bbmi.automatedtesting.suites;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Screen;

public abstract class AutomatedTestingSuite {

	protected Logger logger; 
	protected WebDriver driver;
	protected Screen s;
	//protected FileHandler handler;
	protected Robot r;
	
	public AutomatedTestingSuite() {
		driver = new FirefoxDriver(); //TODO: do we want a new instance of this each time, or should this be singleton?
		s = new Screen();
		// Create a file handler that write log record to a file called my.log
		FileHandler handler = null;
		try {
			handler = new FileHandler("C:/selenium/SeleniumLog/combinetestlog.txt");
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //TODO: note, this directory must exist on the machine or testing will not work, maybe tix this
		handler.setFormatter(new SimpleFormatter());
		// Add to the desired logger
		Logger logger = Logger.getLogger(getTestSuiteName());
		logger.addHandler(handler);
		logger.setLevel(Level.ALL);
		try {
			Robot r = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * This is ran before each test suite. It launches a new firefox browser 
	 * and checks to make sure the server is running.
	 */
	@BeforeClass
	public static void checkServer() {
		
		WebDriver checkServerDriver = new FirefoxDriver();

		//if this throws an exception, it should prevent the test from running.
		checkServerDriver.get("http://158.147.211.123:8080/manager/status");
		checkServerDriver.findElement(By.cssSelector("img[alt=\"The Tomcat Servlet/JSP Container\"]"));
		checkServerDriver.get("http://158.147.211.125/EmrSvc.asmx");
		checkServerDriver.findElement(By.linkText("addDataSource"));

	}
	
//	public final List<TestResult> runAll() {
//		logger.info("Running Test Suite.");
//		
//		preTestSuiteRun();
//		List<TestResult> results = callAllTests();
//		postTestSuiteRun();
//		
//		logger.info("Test Suite completed without exception.");
//		
//		return results;
//	}
	
	//utility methods
	
	/**
	 * Get the method name for a depth in call stack. <br />
	 * Utility function
	 * @param depth depth in the call stack (0 means current method, 1 means call method, ...)
	 * @return method name
	 */
	public static String getMethodName(final int depth)
	{
	  final StackTraceElement[] ste = Thread.currentThread().getStackTrace();
	  return ste[ste.length - 1 - depth].getMethodName();
	}
	
	public Properties getProperties() {
		Properties prop = new Properties();
		InputStream in = getClass().getResourceAsStream("foo.properties");
		try {
			prop.load(in);
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		
		return prop;
	}
	
//	public abstract void preTestSuiteRun();
//	public abstract void postTestSuiteRun();
	
	public abstract String getTestSuiteName();
}
