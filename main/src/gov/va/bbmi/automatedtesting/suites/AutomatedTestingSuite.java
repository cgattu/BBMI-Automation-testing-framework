package gov.va.bbmi.automatedtesting.suites;

import gov.va.bbmi.automatedtesting.ResultsLogWatchMan;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;

import org.junit.AfterClass;
import org.junit.Rule;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.sikuli.script.Screen;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class AutomatedTestingSuite {

	//should all be thread safe since there won't be multiple threads touching the same TestSuite class
	protected Logger logger; //logger called by the tests manually
	protected WebDriver driver;  //TODO: do we want a new instance of this each time, or should this be singleton?
	protected Screen s;
	protected Robot r;
	
	@Rule
	public ResultsLogWatchMan resultLogWatchMan = ResultsLogWatchMan.getInstance();
	
	public AutomatedTestingSuite() {
		
		//Setup selenium logger
//		LoggingPreferences logs = new LoggingPreferences();
//		logs.enable(LogType.DRIVER, Level.ALL);
//		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
//		capabilities.setCapability(CapabilityType.LOGGING_PREFS, logs);
//		driver = new FirefoxDriver(capabilities);
		
		DesiredCapabilities caps = DesiredCapabilities.firefox(); 
		LoggingPreferences logs = new LoggingPreferences(); 
		logs.enable(LogType.DRIVER, Level.FINEST); 
		caps.setCapability(CapabilityType.LOGGING_PREFS, logs); 
		driver = new FirefoxDriver(caps);
		
		//driver = new FirefoxDriver();
		s = null; //new Screen();
		// Create a file handler that write log record to a file called my.log


		
		// Add to the desired logger
		logger = LoggerFactory.getLogger("bbmi.testing.transcript");
		
		try {
			r = new Robot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

//		FileOutputStream outfos = null;
//		try {
//			outfos = new FileOutputStream("C:/selenium/SeleniumLog/testOutput.html");
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} //create //new output stream
//
//		PrintStream newoutps = new PrintStream(outfos); //create new output //stream
//
//		System.setOut(newoutps); //set the output stream
	}
	
	/**
	 * This is ran before each test suite. It launches a new firefox browser 
	 * and checks to make sure the server is running.
	 */
//	@BeforeClass
//	public static void checkServer() {
//		
//		WebDriver checkServerDriver = new FirefoxDriver();
//
//		//if this throws an exception, it should prevent the test from running.
//		checkServerDriver.get("http://158.147.211.123:8080/manager/status");
//		checkServerDriver.findElement(By.cssSelector("img[alt=\"The Tomcat Servlet/JSP Container\"]"));
//		checkServerDriver.get("http://158.147.211.125/EmrSvc.asmx");
//		checkServerDriver.findElement(By.linkText("addDataSource"));
//
//	}
	
	@AfterClass
	public static void writeResultsToFile() {
		
	}
	
	
	
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
