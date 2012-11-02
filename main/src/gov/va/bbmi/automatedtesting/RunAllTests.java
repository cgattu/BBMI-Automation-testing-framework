//package gov.va.bbmi.automatedtesting;
//
//import java.awt.AWTException;
//import java.awt.Robot;
//import java.io.IOException;
//import java.util.logging.FileHandler;
//import java.util.logging.Level;
//import java.util.logging.Logger;
//import java.util.logging.SimpleFormatter;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.sikuli.script.Screen;
//
//public class RunAllTests {
//
//	public static void main(String[] args) throws AWTException {
//		try{
//			WebDriver driver = new FirefoxDriver();
//			Screen s = new Screen();
//			// Create a file handler that write log record to a file called my.log
//			FileHandler handler = new FileHandler("C:/selenium/SeleniumLog/combinetestlog.txt"); //TODO: note, this directory must exist on the machine or testing will not work, maybe tix this
//			handler.setFormatter(new SimpleFormatter());
//			// Add to the desired logger
//			Logger logger = Logger.getLogger("testscripts");
//			logger.addHandler(handler);
//			logger.setLevel(Level.ALL);
//			Robot r = new Robot();
//			if(servercheck(driver, s, handler, logger, r)==1){ //TODO: remove equals true
//				System.out.println("Server Running");
//				logger.log(Level.WARNING, "Server Running\n");
//				
//				//Invoke test suites here
//				//TODO: refactor all this....
//				
////				//Test Manifest
////				List<AutomatedTestingSuite> testSuites = new ArrayList<AutomatedTestingSuite>();
////				ExampleSuite es = new ExampleSuite(driver, s, handler, r); //TODO: re-use the same instance of webdriver and sikuli for each test??
////				testSuites.add(es);
////				
////				
////				//Run all testSuites
////				for (AutomatedTestingSuite testSuite : testSuites) {
////		            Class<? extends AutomatedTestingSuite> clazz = testSuite.getClass();
////					Logger testSuiteLogger = Logger.getLogger(clazz.getName());
////					testSuiteLogger.info("Running test suite");
////
////		            Method methods[] = clazz.getDeclaredMethods(); //TODO: can parse for preProcessing and postProcessing methods and run those (via a new annotation)
////		            for (int i = 0; i < methods.length; i++) {
////		            	if (methods[i].isAnnotationPresent(BBMITest.class)) {
////		            		Method method = methods[i];
////			            	String testName = method.getName();
////			            	
////			            	//invoke method.
////		            		TestResult testResult = null;
////			            	try {
////								testResult = (TestResult)method.invoke(testSuite, new Object[] {testName});
////								System.out.println(testResult.isPass());
////							} catch (IllegalArgumentException e) {
////								// TODO Auto-generated catch block
////								e.printStackTrace();
////							} catch (IllegalAccessException e) {
////								// TODO Auto-generated catch block
////								e.printStackTrace();
////							} catch (InvocationTargetException e) {
////								// This means a real exception happened inside our method
////								Throwable actual = e.getTargetException();
////								actual.printStackTrace();
////								
////								//TODO: what to do if an exception is thrown back from the test method?
////								//should probably create a testResult object and mark it as failed.
////							}
////			            	
////			            	//TODO: handle testResult logging
////		            	}
////		            }
////				}
//				
//				
//				
//				
////				List<TestResult> results = es.runAll();
////				
////				for (TestResult result : results) {
////					
////					//TODO: add results to file system.
////					if (result.isPass()) {
////						logger.info(result.getTestName() + " - Passed.");
////
////					} else {
////						logger.info(result.getTestName() + " - Failed.");
////						//TODO: send the stack trace somewhere.
////					}
////					
////				}
//				
////				if(testp1011(driver, s, handler, logger, r)==1){
////					System.out.println("Test Username P1011 Passed");
////					logger.log(Level.WARNING, "Test Username P1011 Passed\n");
////				}
////				else{
////					System.out.println("Test Username P1011 FAILED");
////					logger.log(Level.WARNING, "Test Username P1011 Failed\n");
////				}
////				if(testp1211(driver, s, handler, logger, r)==1){
////					System.out.println("Test Username P1211 Passed");
////					logger.log(Level.WARNING, "Test Username P1211 Passed\n");
////				}
////				else{
////					System.out.println("Test Username P1211 FAILED");
////					logger.log(Level.WARNING, "Test Username P1211 Failed\n");
////				}
//			}
//			else{
//				System.out.println("Server Test Failed, Test Aborted");
//				logger.log(Level.WARNING, "Server Test Failed, Test Aborted\n");
//			}
//			
//		}
//		catch (IOException e) {
//		}
//		
//	}
//	
//	public static int servercheck(WebDriver driver, Screen s, FileHandler handler, Logger logger, Robot r) {
//		try{
//			driver.get("http://158.147.211.123:8080/manager/status");
//			driver.findElement(By.cssSelector("img[alt=\"The Tomcat Servlet/JSP Container\"]"));
//			driver.get("http://158.147.211.125/EmrSvc.asmx");
//			driver.findElement(By.linkText("addDataSource"));
//		}
//		catch(Exception e){
//			e.printStackTrace();
//			return 0;
//		}
//			return 1;
//		}
//
//
//	
//}
