package gov.va.bbmi.automatedtesting.suites.example;

import gov.va.bbmi.automatedtesting.suites.AutomatedTestingSuite;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.sikuli.script.Region;

public class DirectemailErrorMsg extends AutomatedTestingSuite {
	
	private boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

	@Test
	public void testSecureProviderEmail() throws Exception {
		logger.info("Directemail::In Start of testing SecureProvider Email::");
		String providerURL	=	getSecureEmailLinkFromGmail();
		logger.info("Directemail::Getting the ProviderURL from  unsecure(gmail)::  Provider URL is::"+providerURL.trim());
		driver.get(providerURL);
		//driver.findElement(By.linkText("Go to the login page")).click();
		driver.findElement(By.name("login_username")).clear();
		driver.findElement(By.name("login_username")).sendKeys(getProperties().getProperty("loginusername"));
		logger.info("Directemail::Getting the login_username from the Properties File :: login_username is::"+getProperties().getProperty("loginusername"));
		driver.findElement(By.name("secretkey")).clear();
		driver.findElement(By.name("secretkey")).sendKeys(getProperties().getProperty("secretkey"));
		logger.info("Directemail::Getting the secretkey from the Properties File :: secretkey is::"+getProperties().getProperty("secretkey"));
		driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
		driver.manage().window().maximize();
		logger.info("Directemail::SubmitButton was clicked");
		r.delay(5000);
		s.wait("C:/BBMI-Automation-testing-framework-master/BBMI-Automation-testing-framework-master/main/src/Img1/RadiologyRep.png");
		s.click("C:/BBMI-Automation-testing-framework-master/BBMI-Automation-testing-framework-master/main/src/Img1/RadiologyRep.png"); //TODO: will need to refer to this on the class path and not the actual path
		logger.info("::Sikuli Click on Subject RadiologyReport::");
		r.delay(5000);
		/* for (int second = 0;; second++) {
		    	//if (second >= 60) fail("timeout");
		    	try { if (isElementPresent(By.cssSelector("a.rowLink > span"))) break; } catch (Exception e) {System.out.println("in first exception block"); e.printStackTrace(); }
		    	//Thread.sleep(1000);
		    }

		    for (int second = 0;; second++) {
		    	//if (second >= 60) fail("timeout");
		    	try { if ("Download".equals(driver.findElement(By.cssSelector("a.rowLink > span")).getText())) break; } catch (Exception e) {System.out.println("in second exception block"); e.printStackTrace();}
		    	//Thread.sleep(1000);
		    }*/

		  // try{ driver.findElement(By.cssSelector("a.rowLink > span")).click();}catch(Exception e){System.out.println("In third exception block");e.printStackTrace();}
		//r.delay(20000);
		
		//String content	=	driver.findElement(By.id("messageBody")).getText();
		//System.out.println("content is ---"+ content);
		System.out.println("pagesource is --->"+driver.getPageSource());
		Region region 	=	s.find("C:/BBMI-Automation-testing-framework-master/BBMI-Automation-testing-framework-master/main/src/Img1/hccp15814721.png");
		//System.out.println("Text is -->"+region.text());
//		System.out.println(s.hover("C:/BBMI-Automation-testing-framework-master/BBMI-Automation-testing-framework-master/main/src/Img1/hccp15814721.png")); //TODO: will need to refer to this on the class path and not the actual path
   		s.click("C:/BBMI-Automation-testing-framework-master/BBMI-Automation-testing-framework-master/main/src/Img1/hccp15814721.png"); //TODO: will need to refer to this on the class path and not the actual path
		logger.info("::Sikuli Click on the link to open the erro screen::");
		
//		Region region 	=	s.find("C:/BBMI-Automation-testing-framework-master/BBMI-Automation-testing-framework-master/main/src/Img1/hccp15814721.png");
		//System.out.println("Text is -->"+region.text());
//		System.out.println(s.hover("C:/BBMI-Automation-testing-framework-master/BBMI-Automation-testing-framework-master/main/src/Img1/hccp15814721.png")); //TODO: will need to refer to this on the class path and not the actual path
		logger.info(":silkuli testchecking Error message");
   		s.click("C:/BBMI-Automation-testing-framework-master/BBMI-Automation-testing-framework-master/main/src/Img1/ErrorTherewa.png"); //TODO: will need to refer to this on the class path and not the actual path
		logger.info("::Sikuli Checking ErrorMsg complete::");
		// driver.findElement(By.cssSelector("a.rowLink > span")).click();
		//r.delay(5000);
		//logger.info("::Sikuli waiting to  load Download Button ::");
		// driver.findElement(By.linkText("Download File")).click();
//		s.wait("C:/BBMI-Automation-testing-framework-master/BBMI-Automation-testing-framework-master/main/src/Img1/DmDownload.png");
//		driver.findElement(By.("Download")).click();
//		s.click("C:/BBMI-Automation-testing-framework-master/BBMI-Automation-testing-framework-master/main/src/Img1/DmDownload.png"); //TODO: will need to refer to this on the class path and not the actual path
		
		//r.delay(10000);
		//s.click("C:/BBMI-Automation-testing-framework-master/BBMI-Automation-testing-framework-master/main/src/Img1/OK.png"); //TODO: will need to refer to this on the class path and not the actual path
		//logger.info("::Sikuli Click on OK Image::");
		//r.delay(10000);
		
		//s.wait("C:/BBMI-Automation-testing-framework-master/BBMI-Automation-testing-framework-master/main/src/Img1/E.png");
		////logger.info(":; Sikuli  Wait for Close image loaded::");
		r.delay(10000);
		
	//	s.click("C:/BBMI-Automation-testing-framework-master/BBMI-Automation-testing-framework-master/main/src/Img1/E.png");
	//	logger.info("::Sikuli Click on CLOSE Image::");
		r.delay(10000);
	//	driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
		// Warning: verifyTextPresent may require manual changes
		/*try {
			assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Error\r\nThere was an error retrieving your download\r\n\r\nThere was an error retrieving your file for download\\.[\\s\\S]*$"));
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}*/
	}
	
}


	
	