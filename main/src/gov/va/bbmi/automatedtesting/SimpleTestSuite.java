package gov.va.bbmi.automatedtesting;

import static org.junit.Assert.assertTrue;

import org.junit.Rule;
import org.junit.Test;

public class SimpleTestSuite {
	
//	@BeforeClass
//	public static void setUp() {
//		//FileHandler fileHandler = new FileHandler(new SimpleDateFormat("yyyy-MM-dd--HH-mm-ss").format(new Date())+"-TestSimple.txt");
//	    
//		//fileHandler.setFormatter(new SimpleFormatter());
//		//resultsLogger.addHandler(fileHandler);
//		
//		String fileName = new SimpleDateFormat("yyyy-MM-dd--HH-mm-ss").format(new Date())+"-TestSimple.txt";
//		
//		LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();
//	    FileAppender fileAppender = new FileAppender();
//	    fileAppender.setContext(loggerContext);
//	    fileAppender.setName("resultsFile");
//	    // set the file name
//	    fileAppender.setFile("logs/" + fileName);
//		
//	    PatternLayoutEncoder encoder = new PatternLayoutEncoder();
//	    encoder.setContext(loggerContext);
//	    encoder.setPattern("%date{dd-MM-yyyy HH:mm:ss} ; %-40(%X{testSuiteName} - %X{testName}) -- %msg%n"); //TODO: add MDC values for expected and actual.
//	    encoder.start();
//
//	    fileAppender.setEncoder(encoder);
//	    fileAppender.start();
//
//	    // attach the rolling file appender to the logger of your choice
//	    resultsLogger = loggerContext.getLogger("bbmi.testing.results"); //note: bbmi.testing.results is defined in logback.xml
//	    resultsLogger.addAppender(fileAppender);
//
//	    // OPTIONAL: print logback internal status messages
//	    StatusPrinter.print(loggerContext);
//	}
	
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
