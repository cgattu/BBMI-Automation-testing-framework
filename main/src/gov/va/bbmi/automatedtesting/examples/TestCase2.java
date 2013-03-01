package gov.va.bbmi.automatedtesting.examples;

import gov.va.bbmi.automatedtesting.AutomatedTestingSuite;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class TestCase2 extends AutomatedTestingSuite {

	@Test
	public void testFor3Months() {

		// Warning: verifyTextPresent may require manual changes
		/*try {
			assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*ack to School: Transitioning from Servicemember to Student\r\n\r\nThe transition to a classroom aft[\\s\\S]*$"));
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}*/
		driver.get("http://158.147.211.128:8080/BBMI/");
		driver.findElement(By.name("loginId")).clear();
		driver.findElement(By.name("loginId")).sendKeys("p1011");
		driver.findElement(By.cssSelector("input.mhv_button")).click();
		driver.findElement(By.cssSelector("strong > a")).click();
		driver.findElement(By.linkText("Continue")).click();
		driver.findElement(By.id("date_3_mo")).click();
		driver.findElement(By.cssSelector("input.bbmi_button")).click();
		if(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Found 0 reports for the timeframe: 24 Jul 2012 to 24 Oct 2012[\\s\\S]*$"))
		{
			//TODO: add junit assert statement
		}else{
			
		}
		driver.findElement(By.linkText("Cancel")).click();
		driver.findElement(By.linkText("Continue")).click();
		driver.findElement(By.id("date_6_mo")).click();
		driver.findElement(By.cssSelector("input.bbmi_button")).click();
		driver.findElement(By.linkText("Cancel")).click();
		driver.findElement(By.linkText("Continue")).click();
		driver.findElement(By.id("date_12_mo")).click();
		driver.findElement(By.cssSelector("input.bbmi_button")).click();
		driver.findElement(By.linkText("Cancel")).click();
		driver.findElement(By.linkText("Continue")).click();
		driver.findElement(By.id("date_custom")).click();
		new Select(driver.findElement(By.id("startMonth"))).selectByVisibleText("Nov");
		new Select(driver.findElement(By.id("startDay"))).selectByVisibleText("25");
		new Select(driver.findElement(By.id("startYear"))).selectByVisibleText("1998");
		new Select(driver.findElement(By.id("endMonth"))).selectByVisibleText("Aug");
		new Select(driver.findElement(By.id("endDay"))).selectByVisibleText("9");
		driver.findElement(By.cssSelector("input.bbmi_button")).click();
		driver.findElement(By.linkText("Procedure/Test Name")).click();
		driver.findElement(By.linkText("PDF")).click();
		driver.findElement(By.cssSelector("img")).click();
		driver.findElement(By.id("textHead")).click();
		driver.findElement(By.linkText("Download PDF Report")).click();
		driver.findElement(By.id("textHead")).click();
		driver.findElement(By.cssSelector("input.bbmi_button")).click();
		new Select(driver.findElement(By.id("provider"))).selectByVisibleText("Provider, One");
		driver.findElement(By.id("verify")).click();
		driver.findElement(By.cssSelector("input.bbmi_button")).click();
		driver.findElement(By.linkText("View Sent Report Log")).click();
		driver.findElement(By.linkText("Next »")).click();
		driver.findElement(By.cssSelector("input.mhv_button")).click();
		//driver.close();
		}

//	@Override
//	public List<TestResult> callAllTests() {
//List<TestResult> results = new ArrayList<TestResult>();
//		
//		//Call each test and store the results into the array list
//		//Also, catch any exception if one happens, then report the test as failed.
//		String testName = null; 
//	/*	try {
//			testName = "testp1011";
//			results.add(testp1011(testName));
//		} catch (Throwable t) {
//			results.add(new TestResult(testName, false, t));
//		}*/
//		
//		try {
//			testName = "testForTest2";
//			results.add(testT1((testName)));
//		} catch (Throwable t) {
//			results.add(new TestResult("testForTest2", false, t));
//		}
//		
//		return results;
//	}

	
	//NOTE: now uses a util method in AutomatedTestingSuite
//	@Override
//	public void preTestSuiteRun() {
//		// TODO Auto-generated method stub
//		System.out.println("the properties file name "+propertiesFileName);
//		prop = new Properties();
//		ClassLoader loader = Thread.currentThread().getContextClassLoader();           
//		InputStream stream = loader.getResourceAsStream(propertiesFileName+".properties");
//		try {
//			prop.load(stream);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//	}

//	@Override
//	public void postTestSuiteRun() {
//		// TODO Auto-generated method stub
//		
//	}
//
//	@Override
//	public String getTestSuiteName() {
//		// TODO Auto-generated method stub
//		return "testForTest2";
//	}
		

}
