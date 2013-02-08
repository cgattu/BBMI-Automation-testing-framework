package gov.va.bbmi.automatedtesting.suites.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import gov.va.bbmi.automatedtesting.suites.AutomatedTestingSuite;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.Select;

public class BBMILookAndFeel extends AutomatedTestingSuite{

	@Test
	public void verifyForLoginTable() throws Exception {
		logger.info("::In start of verifyForLoginTable() methdod::");
		logger.info("**********Start open application************");
		driver.get(getProperties().getProperty("URL"));
		
		logger.info("::getting the URL from the properties file :: The URL is ::"+getProperties().getProperty("URL"));
		r.delay(5000);
		logger.info("Verify the Member Login Text Present or not ");
		assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Member Login[\\s\\S]*$"));
		r.delay(5000);
		logger.info("Verify the UserID text Present or not");
		assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*User ID:[\\s\\S]*$"));
		r.delay(5000);
		driver.findElement(By.name("loginId")).clear();
		driver.findElement(By.name("loginId")).sendKeys(getProperties().getProperty("userID"));
		logger.info("::The UserID ::"+getProperties().getProperty("userID"));
		r.delay(5000);
		driver.findElement(By.cssSelector("input.mhv_button")).click();
		logger.info("::The login button was clicked::");
		r.delay(5000);
		driver.findElement(By.cssSelector("strong > a")).click();
		r.delay(5000);
		try{
		assertTrue("Checking the CSS for the Continue button",driver.findElement(By.className("bbmi_button")).getText().matches("^[\\s\\S]*Continue[\\s\\S]*$"));
		}catch (Error e) {
			logger.info(e.toString());
		     fail();
		}
		driver.findElement(By.linkText("Continue")).click();
		logger.info("::The Continue button was clicked::");
		r.delay(5000);
		try {
			assertEquals("Result: ","BBMI - My HealtheVet Prototype - Download My Selected Data", driver.getTitle());
		} catch (Error e) {
			logger.info(e.toString());
		     fail();
		}
		try{
			assertTrue("Checking the va_banner is present or not::",isElementPresent(By.id("va_banner")));
		}catch (Error e) {
			 logger.info(e.toString());
		     fail();
		}
		 try {
		      assertTrue("Checking the United States Department of Veterans Affairs in the body :: ",driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*United States Department of Veterans Affairs[\\s\\S]*$"));
		    } catch (Error e) {
		     logger.info(e.toString());
		     fail();
		    }
		    
		    try {
		      assertEquals("Result:","United States Department of Veterans Affairs", driver.findElement(By.id("va_banner")).getText());
		    } catch (Error e) {
			     logger.info(e.toString());
			     fail();
			    }
		    try {
		      assertEquals("Result:","United States Department of Veterans Affairs", driver.findElement(By.cssSelector("h2.ir")).getText());
		    } catch (Error e) {
			     logger.info(e.toString());
			     fail();
			    }
		    // Warning: assertTextPresent may require manual changes
		   
		    
		    //assertEquals("United States Department of Veterans Affairs", driver.findElement(By.id("va_banner")).getText());
		    
		   // assertEquals("VA Prototype Radiology Reports and Medical Imaging", driver.findElement(By.cssSelector("h2.disclaimer")).getText());
		    try {
		    	assertTrue(isElementPresent(By.cssSelector("h2.disclaimer")));
		      assertEquals("Result:","VA Prototype Radiology Reports and Medical Imaging", driver.findElement(By.cssSelector("h2.disclaimer")).getText());
		    } catch (Error e) {
		    	logger.info(e.toString());
			     fail();
		    }
		    try {
		    assertEquals("Result:","My HealtheVet", driver.findElement(By.cssSelector("#mhv_banner > h2.ir")).getText());
		    }
		    catch (Error e) {
		    	logger.info(e.toString());
			     fail();
			}
		    
		    // Warning: assertTextPresent may require manual changes
		    try{
		    	assertTrue(isElementPresent(By.cssSelector("#mhv_banner > h2.ir")));
		    	assertTrue("Checking VA Home is Present or not",driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*VA Home[\\s\\S]*$"));
		    	assertEquals("VA Home", driver.findElement(By.linkText("VA Home")).getText());
		    }catch (Error e) {
		    	logger.info(e.toString());
			     fail();
			}
		    r.delay(5000);
		    driver.findElement(By.id("date_custom")).click();
			logger.info(":: Custom Date Range Selected::");;
			r.delay(5000);
			new Select(driver.findElement(By.id("startMonth")))
					.selectByVisibleText(getProperties().getProperty("StartMonth"));
			
			r.delay(5000);
			new Select(driver.findElement(By.id("startDay")))
					.selectByVisibleText(getProperties().getProperty("StartDate"));
			r.delay(5000);
			new Select(driver.findElement(By.id("startYear")))
					.selectByVisibleText(getProperties().getProperty("StartYear"));
			logger.info("::Strat Date  is ::"+getProperties().getProperty("StartMonth")+getProperties().getProperty("StartDate")+getProperties().getProperty("StartYear"));
			r.delay(5000);
			new Select(driver.findElement(By.id("endMonth")))
					.selectByVisibleText(getProperties().getProperty("EndMonth"));
			r.delay(5000);
			new Select(driver.findElement(By.id("endDay")))
					.selectByVisibleText(getProperties().getProperty("Endday"));
			logger.info("::End Date  is ::"+getProperties().getProperty("EndMonth")+getProperties().getProperty("Endday"));
			r.delay(5000);
			driver.findElement(By.cssSelector("input.bbmi_button")).click();
			logger.info(":: The Submit Was Clicked");
			r.delay(5000);
			
			//To Check Sort on Date/Time
			logger.info("Verify  Sorting  on Date/Time Start");
			driver.findElement(By.linkText("Date/Time Exam Performed")).click();
			r.delay(5000);
			logger.info("Verify  Sorting  on Date/Time End");
			r.delay(5000);
			logger.info("Start of Verifying the next button");
			 driver.findElement(By.linkText("Next �")).click();
			 logger.info("End of Verifythe next button");
			 r.delay(5000);
			 logger.info("Start of Verifying the previous button");
			 driver.findElement(By.linkText("� Prev")).click();
			 logger.info("End of Verifying the previous button");
			 r.delay(5000);
			 logger.info("Start of Verifying the last button");
			 driver.findElement(By.linkText("Last ��")).click();
			 logger.info("End of Verifying the last button");
			 r.delay(5000);
			 logger.info("Start of Verifying the First button");
		    driver.findElement(By.linkText("�� First")).click();
		    logger.info("End of Verifying the First button");
		    r.delay(5000);
		    logger.info("Start of Verifying 25 records per page");
		    driver.findElement(By.linkText("25")).click();
		    logger.info("End of Verifying 25 records per page");
		    r.delay(5000);
		    logger.info("Start of Verifying 50 records per page");
		    driver.findElement(By.linkText("50")).click();
		    logger.info("End of Verifying 50 records per page");
		    r.delay(5000);
		    logger.info("Start of Verifying 100 records per page");
		    driver.findElement(By.linkText("100")).click();
		    logger.info("End of Verifying 100 records per page");
		    r.delay(5000);
		    logger.info("Start of Verifying 10 records per page");
		    driver.findElement(By.linkText("10")).click();
		    logger.info("End of Verifying 10 records per page");
		    r.delay(5000);
		logger.info("Verify Member Logout is present or not");
		assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Member Logout[\\s\\S]*$"));
		logger.info("Click on the Logout button");
		r.delay(5000);
		driver.findElement(By.cssSelector("input.mhv_button")).click();
		logger.info("::End of verifyForLoginTable(");
	}
	private boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }
}//end of class.
