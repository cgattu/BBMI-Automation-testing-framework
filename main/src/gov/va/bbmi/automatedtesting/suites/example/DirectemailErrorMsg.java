package gov.va.bbmi.automatedtesting.suites.example;

import java.util.concurrent.TimeUnit;

import gov.va.bbmi.automatedtesting.suites.AutomatedTestingSuite;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
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
		
		//switch to email list frame
		driver.switchTo().frame(1);
		
		//Click on subject 		
		s.wait("C:/BBMI-Automation-testing-framework-master/BBMI-Automation-testing-framework-master/main/src/Img1/RadiologyRep.png");
		s.click("C:/BBMI-Automation-testing-framework-master/BBMI-Automation-testing-framework-master/main/src/Img1/RadiologyRep.png"); //TODO: will need to refer to this on the class path and not the actual path
		logger.info("::Sikuli Click on Subject RadiologyReport::");
		r.delay(5000);
		
		// click on download link in email
		System.out.println("pagesource is --->"+driver.getPageSource());
		Region region 	=	s.find("C:/BBMI-Automation-testing-framework-master/BBMI-Automation-testing-framework-master/main/src/Img1/hccp15814721.png");
		s.click("C:/BBMI-Automation-testing-framework-master/BBMI-Automation-testing-framework-master/main/src/Img1/hccp15814721.png"); //TODO: will need to refer to this on the class path and not the actual path
		logger.info("::Sikuli Click on the link to open the erro screen::");		
			
	
		//Test error message
		logger.info(":silkuli testchecking Error message");
   		s.click("C:/BBMI-Automation-testing-framework-master/BBMI-Automation-testing-framework-master/main/src/Img1/ErrorTherewa.png"); //TODO: will need to refer to this on the class path and not the actual path
		logger.info("::Sikuli Checking ErrorMsg complete::");
		
		// signout
		if(!AutomatedTestingSuite.fireFoxDriverSelected){			
			logger.info("::close download tab::");
			r.delay(3000);
			s.click("C:/Direct mail sikuli images.sikuli/1360854843903.png");
			logger.info("::Click on download file window close button::");
			r.delay(3000);
		}
		else{
			// switch to main tab and logout			
			driver.switchTo().frame(1);
			logger.info("::switch to email message frame::");
		}			
		r.delay(3000);
		driver.findElement(By.xpath("//a[@class='signoutButton']")).sendKeys(Keys.ENTER);//click();
		logger.info("::Click on signout button::");
		r.delay(5000);
		
	}
	
}


	
	