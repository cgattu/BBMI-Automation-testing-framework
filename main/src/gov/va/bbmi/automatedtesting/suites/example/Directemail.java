package gov.va.bbmi.automatedtesting.suites.example;

import java.util.concurrent.TimeUnit;

import gov.va.bbmi.automatedtesting.suites.AutomatedTestingSuite;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.sikuli.script.Match;
import org.sikuli.script.Region;

public class Directemail extends AutomatedTestingSuite {
	
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
		s.wait("C:/BBMI-Automation-testing-framework-master/BBMI-Automation-testing-framework-master/main/src/Img1/ZlarllnlnnvF.png");
		s.click("C:/BBMI-Automation-testing-framework-master/BBMI-Automation-testing-framework-master/main/src/Img1/ZlarllnlnnvF.png"); //TODO: will need to refer to this on the class path and not the actual path
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
		//System.out.println("pagesource is --->"+driver.getPageSource());
		//Region region 	=	s.find("C:/BBMI-Automation-testing-framework-master/BBMI-Automation-testing-framework-master/main/src/Img1/hccp15814721.png");
		//System.out.println("Text is -->"+region.text());
		
		//open pdf in email
		//logger.info(driver.switchTo().)
		
		logger.info(driver.getWindowHandles().toString());
		Match content = s.wait("C:/BBMI-Automation-testing-framework-master/BBMI-Automation-testing-framework-master/main/src/Img1/hccp15814721.png");
		String contentstring	= content.text();
		logger.info(contentstring);
		r.delay(5000);
		//s.hover("C:/BBMI-Automation-testing-framework-master/BBMI-Automation-testing-framework-master/main/src/Img1/hccp15814721.png"); //TODO: will need to refer to this on the class path and not the actual path
		//r.delay(5000);
   		s.click("C:/BBMI-Automation-testing-framework-master/BBMI-Automation-testing-framework-master/main/src/Img1/hccp15814721.png"); //TODO: will need to refer to this on the class path and not the actual path
   		r.delay(2000);
		logger.info("::Sikuli Click on Download link::");
		System.out.println("Current url is "+driver.getCurrentUrl());
		// driver.findElement(By.cssSelector("a.rowLink > span")).click();
		r.delay(5000);
		logger.info("::Sikuli waiting to  load Download Button ::");
		String mainTab = driver.getWindowHandles().toArray()[0].toString();
		String otherTab = driver.getWindowHandles().toArray()[1].toString();
		logger.info(driver.getWindowHandles().toString());
		driver.switchTo().window(otherTab);
		logger.info("Current window handle: " + driver.getWindowHandle().toString());
		//driver.switchTo().window(arg0);
		logger.info(driver.getTitle());
		 driver.findElement(By.xpath("//a[@class='regular']")).click();//By.linkText("Download File")).click();
//		s.wait("C:/BBMI-Automation-testing-framework-master/BBMI-Automation-testing-framework-master/main/src/Img1/DmDownload.png");
//		driver.findElement(By.("Download")).click();
//		s.click("C:/BBMI-Automation-testing-framework-master/BBMI-Automation-testing-framework-master/main/src/Img1/DmDownload.png"); //TODO: will need to refer to this on the class path and not the actual path
		
		r.delay(10000);
		//Ok button for downlaod
		s.click("C:/BBMI-Automation-testing-framework-master/BBMI-Automation-testing-framework-master/main/src/Img1/OK.png"); //TODO: will need to refer to this on the class path and not the actual path
		logger.info("::Sikuli Click on OK Image::");
		r.delay(10000);
		/*//Close button for download
		
		s.wait("C:/BBMI-Automation-testing-framework-master/BBMI-Automation-testing-framework-master/main/src/Img1/E.png");
		logger.info(":; Sikuli  Wait for Close image loaded::");
		r.delay(10000);
		
		s.click("C:/BBMI-Automation-testing-framework-master/BBMI-Automation-testing-framework-master/main/src/Img1/E.png");
		logger.info("::Sikuli Click on CLOSE Image::");
		r.delay(10000);*/
		
		s.wait("C:/Direct mail sikuli images.sikuli/IHEES2FXEEEE.png");
		logger.info(":; Sikuli  Wait for mhv prototype folder loaded::");
		r.delay(5000);
		s.doubleClick("C:/Direct mail sikuli images.sikuli/IHEES2FXEEEE.png");
		logger.info("::Sikuli Click on mhv prototype folder Image::");
		r.delay(5000);
		
		s.wait("C:/Direct mail sikuli images.sikuli/mhv_protctyp.png");
		logger.info("::Sikuli wait for mhv prototype notepad Image::");
		r.delay(10000);
		s.doubleClick("C:/Direct mail sikuli images.sikuli/mhv_protctyp.png");
		logger.info("::Sikuli Click on mhv prototype notepad Image::");
		r.delay(10000);
		
		s.wait("C:/Direct mail sikuli images.sikuli/E.png");
		logger.info("::Sikuli wait for CLOSE Image::");
		r.delay(2000);
		s.click("C:/Direct mail sikuli images.sikuli/E.png");
		logger.info("::Sikuli Click on CLOSE Image::");
		r.delay(2000);
		
		s.wait("C:/Direct mail sikuli images.sikuli/IITIBQES.png");
		logger.info("::Sikuli wait on images folder Image::");
		r.delay(5000);
		s.doubleClick("C:/Direct mail sikuli images.sikuli/IITIBQES.png");
		logger.info("::Sikuli Click on images folder Image::");
		r.delay(5000);
		
		s.wait("C:/Direct mail sikuli images.sikuli/ljseries1.png");
		logger.info("::Sikuli wait on series1 folder Image::");
		r.delay(5000);
		s.doubleClick("C:/Direct mail sikuli images.sikuli/ljseries1.png");
		logger.info("::Sikuli Click on series1 folder Image::");
		r.delay(5000);
		
		s.wait("C:/Direct mail sikuli images.sikuli/Lurmvaimage6.png");
		logger.info("::Sikuli wait for dicom image Image::");
		r.delay(10000);
		s.doubleClick("C:/Direct mail sikuli images.sikuli/Lurmvaimage6.png");
		logger.info("::Sikuli Click on dicom Image::");
		r.delay(10000);
		
		s.wait("C:/Direct mail sikuli images.sikuli/1360855464111.png");
		logger.info("::Sikuli wait on dicom CLOSE Image::");
		r.delay(5000);
		s.click("C:/Direct mail sikuli images.sikuli/1360855464111.png");
		logger.info("::Sikuli Click on dicom CLOSE Image::");
		r.delay(5000);
		
		s.wait("C:/Direct mail sikuli images.sikuli/1360854843903.png");
		logger.info("::Sikuli Click on zip CLOSE Image::");
		r.delay(5000);
		s.click("C:/Direct mail sikuli images.sikuli/1360854843903.png");
		logger.info("::Sikuli Click on zip CLOSE Image::");
		r.delay(5000);
		
		// switch to main tab
		driver.switchTo().window(mainTab);
		
	//	driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
		// Warning: verifyTextPresent may require manual changes
		/*try {
			assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Error\r\nThere was an error retrieving your download\r\n\r\nThere was an error retrieving your file for download\\.[\\s\\S]*$"));
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}*/
	}
	
}


	
	