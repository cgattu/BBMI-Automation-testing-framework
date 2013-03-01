package gov.va.bbmi.automatedtesting.examples;

import static org.junit.Assert.assertTrue;
import gov.va.bbmi.automatedtesting.AutomatedTestingSuite;
import gov.va.bbmi.automatedtesting.FileDownloader;
import gov.va.bbmi.automatedtesting.RequestMethod;
import gov.va.bbmi.automatedtesting.URLStatusChecker;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

import gov.va.bbmi.automatedtesting.*;
public class IETestcase extends AutomatedTestingSuite {
	

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
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("input.mhv_button")).click();
		logger.info("::The login button was clicked::");
		driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
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
		logger.info("Click on the  Preview link");
		driver.findElement(By.xpath("//div[@id='main']/section/div/section/table/tbody/tr[2]/td[4]/a/span")).click();
		r.delay(7000);
		//Click on the Image.
		logger.info("Click on the scanned images");
		driver.findElement(By.xpath("(//img[@alt='Radiology image thumbnail'])[6]")).click();
		r.delay(5000);
		logger.info("Click on the  close image to close the  scanned image");
		driver.findElement(By.cssSelector("span.ui-icon.ui-icon-closethick")).click();
		r.delay(5000);
		//Back to the reports list.
		logger.info("Back to the Reports List Start");
		driver.findElement(By.linkText("Return to List")).click();
		logger.info("Back to the Reports List End");
		r.delay(5000);
		
		
		
		/*logger.info("Selecting the Provider");
		new Select(driver.findElement(By.id("provider"))).selectByValue(getProperties().getProperty("provider"));*/
		r.delay(5000);
		//
		//for()
		//driver.findElement(By.linkText("Text")).click();	
		final WebElement element = driver.findElement(By.xpath("(//a[contains(text(),'Text')])[2]"));//(By.linkText("Text"));
		logger.info(":: Click on the Text to open the NotePad::");
		//Testing the HTTP Status Codes for downloading.
		//if status codes other than 302 or 202 , then it fails.
		//
		
//	    assertThat(urlChecker.getHTTPStatusCode(), is(equalTo(404)));
		r.delay(5000);
		
		try{
		//s.click("C:/BBMI-Automation-testing-framework-master/BBMI-Automation-testing-framework-master/main/src/Img1/IE/1358182878482.png"); //TODO: will need to refer to this on the class path and not the actual path
			
			IEExecutor ieExecutor = new IEExecutor();
			ieExecutor.executeMethodWithTimeout(new Callable<Void>(){
			           public Void call() {
			               System.out.println("Starting click thread...");
			               element.click();
			                 return null;
			           }
			        },5);
			r.delay(5000);
			logger.info("clicked!");
			
			r.keyPress(KeyEvent.VK_ALT);
	        r.keyPress(KeyEvent.VK_N);
	        r.keyRelease(KeyEvent.VK_ALT);
	        r.keyRelease(KeyEvent.VK_N);
	        logger.info("Notification Bar Selected...");
	        r.delay(5000);
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
		

 		//refresh driver
		AutomatedTestingSuite.refreshDriver();
		
		logger.info("Stated Click on PDF");
        final WebElement elementPDF = driver.findElement(By.xpath("(//a[contains(text(),'PDF')])[3]"));//(By.linkText("PDF")); //.click();   		
   		r.delay(5000);
   		try{
   			
   				IEExecutor ieExecutor2 = new IEExecutor();
   				ieExecutor2.executeMethodWithTimeout(new Callable<Void>(){
   				           public Void call() {
   				               System.out.println("Starting click thread...");
   				            elementPDF.click();
   				                 return null;
   				           }
   				        },5);
   				r.delay(7000);
   				logger.info("clicked!");
   				
   				r.keyPress(KeyEvent.VK_ALT);
   		        r.keyPress(KeyEvent.VK_N);
   		        r.keyRelease(KeyEvent.VK_ALT);
   		        r.keyRelease(KeyEvent.VK_N);
   		        logger.info("Notification Bar Selected...");
   		        
   		        r.delay(5000);
   		        
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
   		        logger.info("closed pdf...");
   		        
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

   			
   		//refresh driver
   		AutomatedTestingSuite.refreshDriver();	
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
        
		
   		logger.info("Click on the SendReport Image");
   		driver.findElement(By.cssSelector("img")).click();
   		r.delay(5000);
   		
   		logger.info("Viewing the Report Text Preview");
		driver.findElement(By.id("textHead")).click();
		r.delay(5000);
		logger.info("Minimising the Report Text Preview");
		driver.findElement(By.id("textHead")).click();
		r.delay(5000);
   		//driver.findElement(By.id("textHead")).click();
   		
		logger.info("Selecting the Provider");
		new Select(driver.findElement(By.id("provider"))).selectByValue(getProperties().getProperty("provider"));
		r.delay(5000);
		logger.info("Click on the ack box");
		driver.findElement(By.id("verify")).click();
		r.delay(5000);
		logger.info("Click on the SendMyReport button");
		driver.findElement(By.cssSelector("input.bbmi_button")).click();
		r.delay(5000); 
			
				
		logger.info("Verify Member Logout is present or not");
		assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Member Logout[\\s\\S]*$"));
		logger.info("Click on the Logout button");
		r.delay(5000);
		driver.findElement(By.cssSelector("input.mhv_button")).click();
		logger.info("logout button was clicked");
   		
        logger.info(":: End of testForFileOpening::");
	}
	
	
}
