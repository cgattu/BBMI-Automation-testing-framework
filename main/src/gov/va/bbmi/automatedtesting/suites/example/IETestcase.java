package gov.va.bbmi.automatedtesting.suites.example;

import static org.junit.Assert.assertTrue;
import gov.va.bbmi.automatedtesting.FileDownloader;
import gov.va.bbmi.automatedtesting.RequestMethod;
import gov.va.bbmi.automatedtesting.URLStatusChecker;
import gov.va.bbmi.automatedtesting.suites.AutomatedTestingSuite;

import java.awt.event.KeyEvent;
import java.util.concurrent.Callable;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.FindFailed;

import gov.va.bbmi.automatedtesting.*;
public class IETestcase extends AutomatedTestingSuite {
	
/*	

	@Test
	public void testForThreeMonths() throws Exception {
		logger.info("::In start of testForThreeMonths() methdod::");
		logger.info("**********Start open application************");
		driver.get(getProperties().getProperty("URL"));
		logger.info("::getting the URL from the properties file :: The URL is ::"+getProperties().getProperty("URL"));
		r.delay(5000);
		driver.manage().window().maximize();
		driver.findElement(By.name("loginId")).clear();
		driver.findElement(By.name("loginId")).sendKeys(getProperties().getProperty("userID"));
		logger.info("::The UserID ::"+getProperties().getProperty("userID"));
		r.delay(5000);
		driver.findElement(By.cssSelector("input.mhv_button")).click();
		logger.info("::The login button was clicked::");
		r.delay(5000);
		driver.findElement(By.cssSelector("strong > a")).click();
		r.delay(5000);
		driver.findElement(By.linkText("Continue")).click();
		logger.info("::The Continue button was clicked::");
		r.delay(5000);
		driver.findElement(By.id("date_3_mo")).click();
		logger.info("::Selected the 3 months data range::");
		r.delay(5000);
		driver.findElement(By.cssSelector("input.bbmi_button")).click();
		logger.info("::The Submit button was clicked to view the 3 months data::");
		r.delay(5000);
		logger.info("::Check for the Found 0 reports Text for three months on browser started::");
		assertFalse(!driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Found 0 reports for the timeframe[\\s\\S]*$"));
		logger.info("::Check for the Found 0 reports Text on browser end::");
		driver.findElement(By.linkText("Cancel")).click();
		logger.info(":: The Cancel button was clicked::");
		driver.findElement(By.linkText("Continue")).click();
		logger.info("::The Continue button was clicked::");
		logger.info("::In End of testForThreeMonths() methdod::");
	}
	
	@Test
	public void testForSixMonths() {
		logger.info("::In Start of testForSixMonths() methdod::");
		r.delay(5000);
		driver.findElement(By.id("date_6_mo")).click();
		logger.info("::Selected the 6 months data range::");
		r.delay(5000);
		driver.findElement(By.cssSelector("input.bbmi_button")).click();
		logger.info(":: The Submit button was clicked::");
		r.delay(5000);
		logger.info("::Check for the Found 0 reports Text for six months on browser started::");
		assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Found 0 reports for the timeframe:[\\s\\S]*$"));
		logger.info("::Check for the Found 0 reports Text for six months on browser End::");
		driver.findElement(By.linkText("Cancel")).click();
		logger.info(":: The Cancel button was clicked::");
		driver.findElement(By.linkText("Continue")).click();
		r.delay(5000);
		logger.info("::The Continue button was clicked::");
		logger.info("::In End of testForSixMonths() methdod::");
	}
	@Test
	public void testForOneYear() {
		logger.info("::In Start of testForOneYear() methdod::");
		r.delay(5000);
		driver.findElement(By.id("date_12_mo")).click();
		logger.info("::Selected the OneYear data range::");
		r.delay(5000);
		driver.findElement(By.cssSelector("input.bbmi_button")).click();
		logger.info(":: The Submit button was clicked::");
		r.delay(5000);
		logger.info("::Check for the Found 0 reports Text for OneYear on browser started::");
		assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Found 0 reports for the timeframe:[\\s\\S]*$"));
		logger.info("::Check for the Found 0 reports Text for OneYear on browser End::");
		driver.findElement(By.linkText("Cancel")).click();
		logger.info(":: The Cancel button was clicked::");
		driver.findElement(By.linkText("Continue")).click();
		logger.info("::The Continue button was clicked::");
		logger.info("::In End of testForOneYear() methdod::");
		r.delay(5000);
	}*/
	
	@Test
	public void testForFileOpening() throws FindFailed {

		
		logger.info(":: In Start of testForNotePadOpening() method");
		//r.delay(5000);
		logger.info("**********Start open application************");
		driver.get(getProperties().getProperty("URL"));
		logger.info("::getting the URL from the properties file :: The URL is ::"+getProperties().getProperty("URL"));
		r.delay(5000);
		driver.manage().window().maximize();
		driver.findElement(By.name("loginId")).clear();
		driver.findElement(By.name("loginId")).sendKeys(getProperties().getProperty("userID"));
		logger.info("::The UserID ::"+getProperties().getProperty("userID"));
		r.delay(5000);
		driver.findElement(By.cssSelector("input.mhv_button")).click();
		logger.info("::The login button was clicked::");
		r.delay(5000);
		driver.findElement(By.cssSelector("strong > a")).click();
		r.delay(5000);
		driver.findElement(By.linkText("Continue")).click();
		logger.info("::The Continue button was clicked::");
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
		//for()
		//driver.findElement(By.linkText("Text")).click();	
		final WebElement element = driver.findElement(By.linkText("Text"));
		logger.info(":: Click on the Text to open the NotePad::");
		//Testing the HTTP Status Codes for downloading.
		//if status codes other than 302 or 202 , then it fails.
		//
		/*try{
			URLStatusChecker urlChecker 	=	new URLStatusChecker(driver);
			urlChecker.setURIToCheck(getProperties().getProperty("URL").trim() + "generateReport.do?type=text&report=121798-29");
		    urlChecker.setHTTPRequestMethod(RequestMethod.GET);
		    System.out.println("urlChecker.getHTTPStatusCode()---->"+urlChecker.getHTTPStatusCode());
		}catch (Exception e) {
			e.printStackTrace();
		}*/
//	    assertThat(urlChecker.getHTTPStatusCode(), is(equalTo(404)));
		r.delay(5000);
		
		try{
		//s.click("C:/BBMI-Automation-testing-framework-master/BBMI-Automation-testing-framework-master/main/src/Img1/IE/1358182878482.png"); //TODO: will need to refer to this on the class path and not the actual path
			/*r.keyPress(KeyEvent.VK_ALT);
			r.keyPress(KeyEvent.VK_N);
		     r.keyRelease(KeyEvent.VK_ALT);
		     r.keyRelease(KeyEvent.VK_N);
			r.delay(2000);
		     //r.keyPress(KeyEvent.VK_SPACE);
		     //r.keyRelease(KeyEvent.VK_SPACE); 
			r.keyPress(KeyEvent.VK_ENTER);
		     r.keyRelease(KeyEvent.VK_ENTER);*/
			/*FileDownloader downloadTestFile = new FileDownloader(driver);
		    //driver.get("http://www.localhost.com/downloadTest.html");
		    //WebElement downloadLink = driver.findElement(By.id("fileToDownload"));
		    String downloadedFileAbsoluteLocation = downloadTestFile.downloadFile(downloadLink);
		    Runtime.getRuntime().exec("notepad.exe " + downloadedFileAbsoluteLocation);*/
			IEExecutor ieExecutor = new IEExecutor();
			ieExecutor.executeMethodWithTimeout(new Callable<Void>(){
			           public Void call() {
			               System.out.println("Starting click thread...");
			               element.click();
			                 return null;
			           }
			        },5);			        
			logger.info("clicked!");
			
			r.keyPress(KeyEvent.VK_ALT);
	        r.keyPress(KeyEvent.VK_N);
	        r.keyRelease(KeyEvent.VK_ALT);
	        r.keyRelease(KeyEvent.VK_N);
	        logger.info("Notification Bar Selected...");

	        //Select Save button
	        r.keyPress(KeyEvent.VK_O);
	        r.keyRelease(KeyEvent.VK_O);
	        logger.info("File open...");

	        r.delay(7000);
	        
	      //close notepad..
	        r.keyPress(KeyEvent.VK_ALT);
	        r.keyPress(KeyEvent.VK_F4);
	        r.keyRelease(KeyEvent.VK_ALT);
	        r.keyRelease(KeyEvent.VK_F4);
	        logger.info("closed notepad...");
	        
	        r.delay(5000);
	        
	        //Close notification Bar
	        r.keyPress(KeyEvent.VK_ESCAPE);
	        r.keyRelease(KeyEvent.VK_ESCAPE);
	        logger.info("Notification Bar Closed...");
	        
	        r.delay(5000);
			
	        
			//logger.info("::Sikuli Click on OK Image::");
		}catch(Exception e){
			System.out.println("in the exception");
			e.printStackTrace();
		}
		//r.delay(5000);
//		s.wait("C:/BBMI-Automation-testing-framework-master/BBMI-Automation-testing-framework-master/main/src/Img1/IE/l.png");
//		logger.info(":; Sikuli  Wait for Close image loaded::");
		//r.delay(10000)
//		s.click("C:/BBMI-Automation-testing-framework-master/BBMI-Automation-testing-framework-master/main/src/Img1/IE/l.png");
//		logger.info("::Sikuli Click on CLOSE Image::");
		//r.delay(10000);
		/*try{
            driver.navigate().refresh();
        } catch(Exception e){
            System.out.println(e.getLocalizedMessage());
        }*/

 		
		//To Check Sort on Date/Time
		logger.info("Verify  Sorting  on Date/Time Start");
		driver.findElement(By.linkText("Date/Time Exam Performed")).click();
		r.delay(5000);
		logger.info("Verify  Sorting  on Date/Time End");
		r.delay(5000);
		//To Check Sort on Procedure/Test Name
		logger.info("Verify  Sorting  on Procedure/Test Start");
        driver.findElement(By.linkText("Procedure/Test Name")).click();
        r.delay(5000);
        logger.info("Verify  Sorting  on Procedure/Test End");
        r.delay(5000);
      //To Check Sort on Images
		logger.info("Verify  Sorting  on images");
        driver.findElement(By.linkText("# Images")).click();
        r.delay(5000);
        logger.info("Verify  Sorting  on images End");
      //To Check Sort on PDF File Size
		logger.info("Verify  Sorting  on PDF File Size");
		 r.delay(5000);
		 logger.info("Verify  Sorting  on PDF File Size End");
		 driver.findElement(By.linkText("Est PDF Size")).click();
		 r.delay(5000);
        logger.info("Stated Click on PDF");
   		driver.findElement(By.linkText("PDF")).click();
   		
   		r.delay(5000);
//   		s.click("C:/BBMI-Automation-testing-framework-master/BBMI-Automation-testing-framework-master/main/src/Img1/OK.png"); //TODO: will need to refer to this on the class path and not the actual path
		logger.info("::Sikuli Click on OK Image::");
		r.delay(10000);
//		s.wait("C:/BBMI-Automation-testing-framework-master/BBMI-Automation-testing-framework-master/main/src/Img1/E.png");
		logger.info(":; Sikuli  Wait for Close image loaded::");
		r.delay(10000);
//		s.click("C:/BBMI-Automation-testing-framework-master/BBMI-Automation-testing-framework-master/main/src/Img1/E.png");
		logger.info("::Sikuli Click on CLOSE Image::");
		r.delay(10000);
		logger.info("Click on the SendReport Image");
   		driver.findElement(By.cssSelector("img")).click();
   		r.delay(5000);
   		
   		//driver.findElement(By.id("textHead")).click();
   		logger.info("Viewing the Report Text Preview");
		driver.findElement(By.id("textHead")).click();
		r.delay(5000);
		logger.info("Selecting the Provider");
		new Select(driver.findElement(By.id("provider"))).selectByValue(getProperties().getProperty("provider"));
		r.delay(5000);
		logger.info("Click on the ack box");
		driver.findElement(By.id("verify")).click();
		r.delay(5000);
		logger.info("Click on the SendMyReport button");
		driver.findElement(By.cssSelector("input.bbmi_button")).click();
		r.delay(5000); 
		//Backk to the reports list.
		logger.info("Back to the Reports List Start");
		driver.findElement(By.linkText("Return to Reports List")).click();
		logger.info("Back to the Reports List End");
		r.delay(5000);
		logger.info("Click on the  Preview link");
		driver.findElement(By.xpath("//div[@id='main']/section/div/section/table/tbody/tr[8]/td[4]/a/span")).click();
		r.delay(7000);
		//Click on the Image.
		logger.info("Click on the scanned images");
		driver.findElement(By.xpath("(//img[@alt='Radiology image thumbnail'])[6]")).click();
		r.delay(5000);
		logger.info("Click on the  close image to close the  scanned image");
		driver.findElement(By.cssSelector("span.ui-icon.ui-icon-closethick")).click();
		r.delay(5000);
		logger.info("Verify Member Logout is present or not");
		assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Member Logout[\\s\\S]*$"));
		logger.info("Click on the Logout button");
		r.delay(5000);
		driver.findElement(By.cssSelector("input.mhv_button")).click();
		logger.info("logout button was clicked");
   		//driver.findElement(By.id("textHead")).click();
   		//driver.findElement(By.linkText("Download PDF Report")).click();
   		//s.click("C:/BBMI Automated Testing/main/src/Img1/OK.png");
       // r.delay(10000);
       // s.wait("C:/BBMI Automated Testing/main/src/Img1/E.png");
        //r.delay(10000);
       // s.click("C:/BBMI Automated Testing/main/src/Img1/E.png");
		//driver.close(); //this is now handled in @AfterTest
        logger.info(":: End of testForFileOpening::");
	}
}
