package gov.va.bbmi.automatedtesting.suites.example;

import static org.junit.Assert.assertTrue;
import gov.va.bbmi.automatedtesting.suites.AutomatedTestingSuite;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class Testcase1  extends AutomatedTestingSuite {

	//@Test(timeout= 15 * 1000) //can add an optional timeout, this is 15 seconds
	@Test
	public void testForNotePadOpening() throws FindFailed {

		/*driver.get(getProperties().getProperty("URL"));
		driver.findElement(By.name("loginId")).clear();
		driver.findElement(By.name("loginId")).sendKeys(getProperties().getProperty("userID"));
		r.delay(5000);
		driver.findElement(By.cssSelector("input.mhv_button")).click();
		r.delay(5000);
		driver.findElement(By.cssSelector("strong > a")).click();
		r.delay(5000);
		driver.findElement(By.linkText("Continue")).click();*/
		r.delay(5000);
		driver.findElement(By.id("date_custom")).click();
		r.delay(5000);
		new Select(driver.findElement(By.id("startMonth")))
				.selectByVisibleText(getProperties().getProperty("StartMonth"));
		r.delay(5000);
		new Select(driver.findElement(By.id("startDay")))
				.selectByVisibleText(getProperties().getProperty("StartDate"));
		r.delay(5000);
		new Select(driver.findElement(By.id("startYear")))
				.selectByVisibleText(getProperties().getProperty("StartYear"));
		r.delay(5000);
		new Select(driver.findElement(By.id("endMonth")))
				.selectByVisibleText(getProperties().getProperty("EndMonth"));
		r.delay(5000);
		new Select(driver.findElement(By.id("endDay")))
				.selectByVisibleText(getProperties().getProperty("Endday"));
		r.delay(5000);
		driver.findElement(By.cssSelector("input.bbmi_button")).click();
		r.delay(5000);
		driver.findElement(By.linkText("Text")).click();
		r.delay(10000);
			
		Screen s = new Screen(); 
//		C:/BBMI Automated Testing/main/src/Img1
		s.click("C:/BBMI Automated Testing/main/src/Img1/OK.png"); //TODO: will need to refer to this on the class path and not the actual path
		r.delay(10000);
		s.wait("C:/BBMI Automated Testing/main/src/Img1/E.png");
		r.delay(10000);
		s.click("C:/BBMI Automated Testing/main/src/Img1/E.png");
//	    r.delay(5000);
        /*driver.findElement(By.linkText("Procedure/Test Name")).click();
   		driver.findElement(By.linkText("PDF")).click();
   		driver.findElement(By.cssSelector("img")).click();
   		driver.findElement(By.id("textHead")).click();
   		driver.findElement(By.linkText("Download PDF Report")).click();
   		s.click("C:/BBMI Automated Testing/main/src/Img1/OK.png");
        r.delay(10000);
        s.wait("C:/BBMI Automated Testing/main/src/Img1/E.png");
        r.delay(10000);
        s.click("C:/BBMI Automated Testing/main/src/Img1/E.png");*/
		//driver.close(); //this is now handled in @AfterTest
	}
	
	//@Test(timeout= 15 * 1000) //can add an optional timeout, this is 15 seconds
	@Test
	public void testForThreeMonths() {

		driver.get(getProperties().getProperty("URL"));
		r.delay(5000);
		driver.findElement(By.name("loginId")).clear();
		driver.findElement(By.name("loginId")).sendKeys(getProperties().getProperty("userID"));
		r.delay(5000);
		driver.findElement(By.cssSelector("input.mhv_button")).click();
		r.delay(5000);
		driver.findElement(By.cssSelector("strong > a")).click();
		r.delay(5000);
		driver.findElement(By.linkText("Continue")).click();
		
		r.delay(5000);
		
		driver.findElement(By.id("date_3_mo")).click();
		r.delay(5000);
		driver.findElement(By.cssSelector("input.bbmi_button")).click();
		r.delay(5000);
//			if(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Found 0 reports for the timeframe[\\s\\S]*$"))
//				results.add( new TestResult(testName, true));
//			else
//				results.add( new TestResult(testName, false));
		assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Found 0 reports for the timeframe[\\s\\S]*$"));
		
		driver.findElement(By.linkText("Cancel")).click();
		driver.findElement(By.linkText("Continue")).click();
		
		//NOTE: these will now be called by JUnit and not called directly from witin this test
		//results.add(testForSixMonths("testForSixMonths"));
		//results.add(testForNotePadOpening("testForNotePadOpening"));
	}
	
	@Test
	public void testForSixMonths() {
		//boolean result	=	true;

		/*driver.get("http://158.147.211.128:8080/BBMI/");
		r.delay(5000);
		driver.findElement(By.name("loginId")).clear();
		
		driver.findElement(By.name("loginId")).sendKeys("p1011");
		r.delay(5000);
		driver.findElement(By.cssSelector("input.mhv_button")).click();
		r.delay(5000);
		driver.findElement(By.cssSelector("strong > a")).click();
		r.delay(5000);
		driver.findElement(By.linkText("Continue")).click();*/
		r.delay(5000);
		driver.findElement(By.id("date_6_mo")).click();
		r.delay(5000);
		driver.findElement(By.cssSelector("input.bbmi_button")).click();
		r.delay(5000);
		
		assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Found 0 reports for the timeframe:[\\s\\S]*$"));
		//if(!driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Found 0 reports for the timeframe:[\\s\\S]*$"))
			//result	=	false;
			 
		driver.findElement(By.linkText("Cancel")).click();
		driver.findElement(By.linkText("Continue")).click();
	}
	
//	@Override
//	public void preTestSuiteRun() {
//		// TODO Auto-generated method stub
//		System.out.println("the properties file name "+propertiesFileName);
//		prop = new Properties();
//		ClassLoader loader = Thread.currentThread().getContextClassLoader();           
//		InputStream stream = loader.getResourceAsStream(propertiesFileName+".properties");
//		try {
//			getProperties().load(stream);
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
//		return "Testcase1";
//	}

}
