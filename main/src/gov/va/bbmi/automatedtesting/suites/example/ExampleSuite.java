package gov.va.bbmi.automatedtesting.suites.example;

import gov.va.bbmi.automatedtesting.ResultsLogWatchMan;
import gov.va.bbmi.automatedtesting.suites.AutomatedTestingSuite;

import java.util.logging.Level;

import org.junit.Rule;
import org.junit.Test;
import org.openqa.selenium.By;
import org.sikuli.script.FindFailed;

public class ExampleSuite extends AutomatedTestingSuite {


	@Test
	public void testp1011() {
		try{
			logger.debug("Launch Firefox driver\n");
			driver.get("http://158.147.211.128:8080/BBMI/");
			logger.debug("Maximize Firefox window\n");
			driver.manage().window().maximize();
			driver.findElement(By.name("loginId")).clear();
			logger.debug("Login Patient p1011\n");
			driver.findElement(By.name("loginId")).sendKeys("p1011");
			driver.findElement(By.cssSelector("input.mhv_button")).click();
			r.delay(8000);
			logger.debug("Selenium click 'Download My Data'\n");
			driver.findElement(By.cssSelector("input.mhv_button"));
			driver.findElement(By.linkText("Download My Data")).click();
			r.delay(2000);
			logger.debug("Selenium click 'Continue'\n");
			driver.findElement(By.linkText("Continue")).click();
			r.delay(5000);
			logger.debug("Selenium click 'Search by Date Range'\n");
			driver.findElement(By.linkText("Search by Date Range")).click();
			logger.debug("Sikuli wait for 'imgs1/2011.png'\n");
			logger.debug("Sikuli click 'imgs1/2011.png'\n");
			s.click("imgs1/2011.png");
			logger.debug("Sikuli wait for 'imgs1/yearlist.png'\n");
			s.wait("imgs1/yearlist.png");
			logger.debug("Sikuli click 'imgs1/1995.png'\n");
			s.click("imgs1/1995.png");
			logger.debug("Selenium click 'searchBtn'\n");
			driver.findElement(By.id("searchBtn")).click();
			r.delay(6000);
			
			logger.debug("Selenium click 'Text Report' 3\n");
			driver.findElement(By.xpath("(//a[contains(text(),'Text')])[3]")).click();
			r.delay(4000);
			logger.debug("Sikuli click 'imgs1/OK.png' \n");
			s.click("imgs1/OK.png");
			logger.debug("Sikuli wait for 'imgs1/Pname.png'\n");
			s.wait("imgs1/Pname.png");
			logger.debug("Sikuli close window\n");
			s.click("imgs1/1342199646983.png");
			logger.debug("Selenium click 'PDF Report' 3\n");
			driver.findElement(By.xpath("(//a[contains(text(),'PDF')])[4]")).click();		
			r.delay(4000);
			logger.debug("Sikuli click 'imgs1/OK.png'\n");
			s.click("imgs1/OK.png");
			logger.debug("Sikuli wait 'imgs1/pagefull.pdf'\n");
			s.wait("imgs1/pagefull.png");
			logger.debug("Sikuli click 'imgs1/pagefull.pdf'\n");
			s.click("imgs1/pagefull.png");
			s.wait("imgs1/P1pdf.png");
			s.click("imgs1/darrow.png");
			s.click("imgs1/darrow.png");
			s.click("imgs1/darrow.png");
			s.click("imgs1/darrow.png");
			s.click("imgs1/darrow.png");
			s.wait("imgs1/echogram.png");
			logger.debug("Sikuli close window \n");
			s.click("imgs1/1342199646983.png");
			driver.findElement(By.xpath("//div[@id='main']/section/div/section/table/tbody/tr[3]/td[4]/a/span")).click();
			driver.findElement(By.cssSelector("img[alt=\"Radiology image thumbnail\"]")).click();
			driver.findElement(By.cssSelector("span.ui-icon.ui-icon-closethick")).click();
			driver.findElement(By.xpath("(//img[@alt='Radiology image thumbnail'])[8]")).click();
			driver.findElement(By.cssSelector("span.ui-icon.ui-icon-closethick")).click();
			driver.findElement(By.xpath("(//img[@alt='Radiology image thumbnail'])[13]")).click();
			driver.findElement(By.cssSelector("span.ui-icon.ui-icon-closethick")).click();
			driver.navigate().back();
			logger.debug("Selenium click 'Text Report' 6\n");
			driver.findElement(By.xpath("(//a[contains(text(),'Text')])[6]")).click();
			r.delay(6000);
			logger.debug("Sikuli click 'imgs1/OK.png'\n");
			s.click("imgs1/OK.png");
			logger.debug("Sikuli wait 'imgs1/Pname.png'\n");
			s.wait("imgs1/Pname.png");
			logger.debug("Sikuli close window \n");
			s.click("imgs1/1342199646983.png");
			logger.debug("Selenium click 'PDF Report' 6\n");
			driver.findElement(By.xpath("(//a[contains(text(),'PDF')])[7]")).click();
			r.delay(6000);
			logger.debug("Sikuli click 'imgs1/OK.png'\n");
			s.click("imgs1/OK.png");
			logger.debug("Sikuli wait 'imgs1/pagefull.pdf'\n");
			s.wait("imgs1/pagefull.png");
			logger.debug("Sikuli click 'imgs1/pagefull.pdf'\n");
			s.click("imgs1/pagefull.png");
			s.wait("imgs1/P1pdf.png");
			s.click("imgs1/darrow.png");
			s.click("imgs1/darrow.png");
			s.click("imgs1/darrow.png");
			s.click("imgs1/darrow.png");
			s.click("imgs1/darrow.png");
			s.wait("imgs1/shoulder.png");
			logger.debug("Sikuli close window \n");
			s.click("imgs1/1342199646983.png");
			driver.findElement(By.xpath("//div[@id='main']/section/div/section/table/tbody/tr[6]/td[4]/a/span")).click();
			driver.findElement(By.cssSelector("img[alt=\"Radiology image thumbnail\"]")).click();
			driver.findElement(By.cssSelector("span.ui-icon.ui-icon-closethick")).click();
			driver.findElement(By.xpath("(//img[@alt='Radiology image thumbnail'])[2]")).click();
			driver.findElement(By.cssSelector("span.ui-icon.ui-icon-closethick")).click();
			driver.navigate().back();
			
			logger.debug("Selenium click 'Text Report' 10\n");
			driver.findElement(By.xpath("(//a[contains(text(),'Text')])[10]")).click();
			r.delay(5000);
			logger.debug("Sikuli click 'imgs1/OK.png'\n");
			s.click("imgs1/OK.png");
			logger.debug("Sikuli wait 'imgs1/Pname.png'\n");
			s.wait("imgs1/Pname.png");
			logger.debug("Sikuli close window\n");
			s.click("imgs1/1342199646983.png");
			logger.debug("Selenium click 'PDF Report' 10\n");
			driver.findElement(By.xpath("(//a[contains(text(),'PDF')])[11]")).click();
			r.delay(8000);
			logger.debug("Sikuli click 'imgs1/OK.png'\n");
			s.click("imgs1/OK.png");
			r.delay(6000);
			logger.debug("Sikuli wait 'imgs1/arrow.png'\n");
			s.wait("imgs1/arrow.png");
			logger.debug("Sikuli click 'imgs1/arrow.png'\n");
			s.click("imgs1/arrow.png");
			logger.debug("Sikuli wait 'imgs1/percents.png'\n");
			s.wait("imgs1/percents.png");
			logger.debug("Sikuli click 'imgs1/100.png'\n");
			s.click("imgs1/100.png");
			logger.debug("Sikuli wait 'imgs1/PDFconf.png'\n");
			s.wait("imgs1/PDFconf.png");
			logger.debug("Sikuli close window\n");
			s.click("imgs1/1342199646983.png");
			//TODO: Logout... then verify the login button appears
		}	
		catch(FindFailed e){
			throw new RuntimeException(e);
		}
	}
	
	@Test
	public void testp1211() {
		try{
			logger.debug("Return to MyHealtheVet homepage\n");
			driver.get("http://158.147.211.128:8080/BBMI/");
			driver.findElement(By.cssSelector("input.mhv_button")).click();
			driver.findElement(By.cssSelector("input.mhv_button"));
			logger.debug("Login Patient p1211\n");			
			driver.findElement(By.name("loginId")).sendKeys("p1211");
			driver.findElement(By.cssSelector("input.mhv_button")).click();
			r.delay(5000);
			logger.debug("Selenium click 'Download My Data'\n");
			driver.findElement(By.cssSelector("input.mhv_button"));
			driver.findElement(By.linkText("Download My Data")).click();
			r.delay(2000);
			logger.debug("Selenium click 'Continue'\n");
			driver.findElement(By.linkText("Continue")).click();
			r.delay(5000);
			logger.debug("Selenium click 'Search by Date Range'\n");
			driver.findElement(By.linkText("Search by Date Range")).click();
			logger.debug("Sikuli wait for 'imgs1/2011.png'\n");
			s.wait("imgs1/2011.png");
			logger.debug("Sikuli click 'imgs1/2011.png'\n");
			s.click("imgs1/2011.png");
			logger.debug("Sikuli wait for 'imgs1/yearlist.png'\n");
			s.wait("imgs1/yearlist.png");
			logger.debug("Sikuli click 'imgs1/1995.png'\n");
			s.click("imgs1/1995.png");
			logger.debug("Selenium click 'searchBtn'\n");
			driver.findElement(By.id("searchBtn")).click();
			r.delay(6000);
			
			logger.debug("Selenium click 'Text Report' 1\n");
			driver.findElement(By.linkText("Text")).click();
			r.delay(7000);
			logger.debug("Sikuli click 'imgs1/OK.png' \n");
			s.click("imgs1/OK.png");
			logger.debug("Sikuli wait for 'imgs1/Pname2.png'\n");
			s.wait("imgs1/Pname2.png");
			logger.debug("Sikuli close window\n");
			s.click("imgs1/1342199646983.png");
			logger.debug("Selenium click 'PDF Report' 1\n");
			driver.findElement(By.linkText("PDF")).click();			
			r.delay(6000);
			logger.debug("Sikuli click 'imgs1/OK.png'\n");
			s.click("imgs1/OK.png");
			logger.debug("Sikuli wait 'imgs1/arrow.png'\n");
			s.wait("imgs1/arrow.png");
			logger.debug("Sikuli click 'imgs1/arrow.png'\n");
			s.click("imgs1/arrow.png");
			logger.debug("Sikuli wait 'imgs1/percents.png'\n");
			s.wait("imgs1/percents.png");
			logger.debug("Sikuli click 'imgs1/blank.png'\n");
			s.click("imgs1/blank.png");
			s.wait("imgs1/PDFconf.png");
			logger.debug("Sikuli close window \n");
			s.click("imgs1/1342199646983.png");
			logger.debug("Selenium click 'Text Report' 8\n");
			driver.findElement(By.xpath("(//a[contains(text(),'Text')])[8]")).click();
			r.delay(6000);
			logger.debug("Sikuli click 'imgs1/OK.png'\n");
			s.click("imgs1/OK.png");
			logger.debug("Sikuli wait 'imgs1/Pname2.png'\n");
			s.wait("imgs1/Pname2.png");
			logger.debug("Sikuli close window \n");
			s.click("imgs1/1342199646983.png");
			logger.debug("Selenium click 'PDF Report' 8\n");
			driver.findElement(By.xpath("(//a[contains(text(),'PDF')])[9]")).click();
			r.delay(6000);
			logger.debug("Sikuli click 'imgs1/OK.png'\n");
			s.click("imgs1/OK.png");
			logger.debug("Sikuli wait 'imgs1/arrow.png'\n");
			s.wait("imgs1/arrow.png");
			logger.debug("Sikuli click 'imgs1/arrow.png'\n");
			s.click("imgs1/arrow.png");
			logger.debug("Sikuli wait 'imgs1/percents.png'\n");
			s.wait("imgs1/percents.png");
			logger.debug("Sikuli click 'imgs1/100.png'\n");
			s.click("imgs1/100.png");
			logger.debug("Sikuli wait 'imgs1/PDFconf.png'\n");
			s.wait("imgs1/PDFconf.png");
			logger.debug("Sikuli close window \n");
			s.click("imgs1/1342199646983.png");
			logger.debug("Selenium click 'Text Report' 10\n");
			driver.findElement(By.xpath("(//a[contains(text(),'Text')])[10]")).click();
			r.delay(5000);
			logger.debug("Sikuli click 'imgs1/OK.png'\n");
			s.click("imgs1/OK.png");
			logger.debug("Sikuli wait 'imgs1/Pname2.png'\n");
			s.wait("imgs1/Pname2.png");
			logger.debug("Sikuli close window\n");
			s.click("imgs1/1342199646983.png");
			logger.debug("Selenium click 'PDF Report' 10\n");
			driver.findElement(By.xpath("(//a[contains(text(),'PDF')])[11]")).click();
			r.delay(10000);
			logger.debug("Sikuli click 'imgs1/OK.png'\n");
			s.click("imgs1/OK.png");
			r.delay(3000);
			logger.debug("Sikuli wait 'imgs1/arrow.png'\n");
			s.wait("imgs1/arrow.png");
			logger.debug("Sikuli click 'imgs1/arrow.png'\n");
			s.click("imgs1/arrow.png");
			logger.debug("Sikuli wait 'imgs1/percents.png'\n");
			s.wait("imgs1/percents.png");
			logger.debug("Sikuli click 'imgs1/100.png'\n");
			s.click("imgs1/100.png");
			logger.debug("Sikuli wait 'imgs1/PDFconf.png'\n");
			s.wait("imgs1/PDFconf.png");
			logger.debug("Sikuli close window\n");
			s.click("imgs1/1342199646983.png");
			logger.debug("Return to MyHealtheVet homepage\n");
			driver.get("http://158.147.211.128:8080/BBMI/");
			driver.findElement(By.cssSelector("input.mhv_button")).click();
			driver.findElement(By.cssSelector("input.mhv_button"));
			logger.debug("Exit driver, close browser.\n");
			driver.close();
		}	
		catch(FindFailed e){
			throw new RuntimeException(e);
		}
	}

//	@Override
//	public List<TestResult> callAllTests() {
//		List<TestResult> results = new ArrayList<TestResult>();
//		
//		//Call each test and store the results into the array list
//		//Also, catch any exception if one happens, then report the test as failed.
//		String testName = null; 
//		try {
//			testName = "testp1011";
//			results.add(testp1011(testName));
//		} catch (Throwable t) {
//			results.add(new TestResult(testName, false, t));
//		}
//		
//		try {
//			testName = "testp1211";
//			results.add(testp1211(testName));
//		} catch (Throwable t) {
//			results.add(new TestResult("testp1211", false, t));
//		}
//		
//		return results;
//	}
	
	@Override
	public String getTestSuiteName() {
		return "ExampleSuite";
	}
	
}
