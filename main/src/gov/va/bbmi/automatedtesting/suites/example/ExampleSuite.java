package gov.va.bbmi.automatedtesting.suites.example;

import gov.va.bbmi.automatedtesting.suites.AutomatedTestingSuite;

import java.awt.Robot;
import java.util.logging.FileHandler;
import java.util.logging.Level;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class ExampleSuite extends AutomatedTestingSuite {

//	public ExampleSuite(WebDriver driver, Screen s, FileHandler handler, Robot r) {
//		super(driver, s, handler, r);
//	}

	@Test
	public void testp1011() {
		try{
			logger.log(Level.INFO, "Launch Firefox driver\n");
			driver.get("http://158.147.211.128:8080/BBMI/");
			logger.log(Level.INFO, "Maximize Firefox window\n");
			driver.manage().window().maximize();
			driver.findElement(By.name("loginId")).clear();
			logger.log(Level.INFO, "Login Patient p1011\n");
			driver.findElement(By.name("loginId")).sendKeys("p1011");
			driver.findElement(By.cssSelector("input.mhv_button")).click();
			r.delay(8000);
			logger.log(Level.INFO, "Selenium click 'Download My Data'\n");
			driver.findElement(By.cssSelector("input.mhv_button"));
			driver.findElement(By.linkText("Download My Data")).click();
			r.delay(2000);
			logger.log(Level.INFO, "Selenium click 'Continue'\n");
			driver.findElement(By.linkText("Continue")).click();
			r.delay(5000);
			logger.log(Level.INFO, "Selenium click 'Search by Date Range'\n");
			driver.findElement(By.linkText("Search by Date Range")).click();
			logger.log(Level.INFO, "Sikuli wait for 'imgs1/2011.png'\n");
			logger.log(Level.INFO, "Sikuli click 'imgs1/2011.png'\n");
			s.click("imgs1/2011.png");
			logger.log(Level.INFO, "Sikuli wait for 'imgs1/yearlist.png'\n");
			s.wait("imgs1/yearlist.png");
			logger.log(Level.INFO, "Sikuli click 'imgs1/1995.png'\n");
			s.click("imgs1/1995.png");
			logger.log(Level.INFO, "Selenium click 'searchBtn'\n");
			driver.findElement(By.id("searchBtn")).click();
			r.delay(6000);
			
			logger.log(Level.INFO, "Selenium click 'Text Report' 3\n");
			driver.findElement(By.xpath("(//a[contains(text(),'Text')])[3]")).click();
			r.delay(4000);
			logger.log(Level.INFO, "Sikuli click 'imgs1/OK.png' \n");
			s.click("imgs1/OK.png");
			logger.log(Level.INFO, "Sikuli wait for 'imgs1/Pname.png'\n");
			s.wait("imgs1/Pname.png");
			logger.log(Level.INFO, "Sikuli close window\n");
			s.click("imgs1/1342199646983.png");
			logger.log(Level.INFO, "Selenium click 'PDF Report' 3\n");
			driver.findElement(By.xpath("(//a[contains(text(),'PDF')])[4]")).click();		
			r.delay(4000);
			logger.log(Level.INFO, "Sikuli click 'imgs1/OK.png'\n");
			s.click("imgs1/OK.png");
			logger.log(Level.INFO, "Sikuli wait 'imgs1/pagefull.pdf'\n");
			s.wait("imgs1/pagefull.png");
			logger.log(Level.INFO, "Sikuli click 'imgs1/pagefull.pdf'\n");
			s.click("imgs1/pagefull.png");
			s.wait("imgs1/P1pdf.png");
			s.click("imgs1/darrow.png");
			s.click("imgs1/darrow.png");
			s.click("imgs1/darrow.png");
			s.click("imgs1/darrow.png");
			s.click("imgs1/darrow.png");
			s.wait("imgs1/echogram.png");
			logger.log(Level.INFO, "Sikuli close window \n");
			s.click("imgs1/1342199646983.png");
			driver.findElement(By.xpath("//div[@id='main']/section/div/section/table/tbody/tr[3]/td[4]/a/span")).click();
			driver.findElement(By.cssSelector("img[alt=\"Radiology image thumbnail\"]")).click();
			driver.findElement(By.cssSelector("span.ui-icon.ui-icon-closethick")).click();
			driver.findElement(By.xpath("(//img[@alt='Radiology image thumbnail'])[8]")).click();
			driver.findElement(By.cssSelector("span.ui-icon.ui-icon-closethick")).click();
			driver.findElement(By.xpath("(//img[@alt='Radiology image thumbnail'])[13]")).click();
			driver.findElement(By.cssSelector("span.ui-icon.ui-icon-closethick")).click();
			driver.navigate().back();
			logger.log(Level.INFO, "Selenium click 'Text Report' 6\n");
			driver.findElement(By.xpath("(//a[contains(text(),'Text')])[6]")).click();
			r.delay(6000);
			logger.log(Level.INFO, "Sikuli click 'imgs1/OK.png'\n");
			s.click("imgs1/OK.png");
			logger.log(Level.INFO, "Sikuli wait 'imgs1/Pname.png'\n");
			s.wait("imgs1/Pname.png");
			logger.log(Level.INFO, "Sikuli close window \n");
			s.click("imgs1/1342199646983.png");
			logger.log(Level.INFO, "Selenium click 'PDF Report' 6\n");
			driver.findElement(By.xpath("(//a[contains(text(),'PDF')])[7]")).click();
			r.delay(6000);
			logger.log(Level.INFO, "Sikuli click 'imgs1/OK.png'\n");
			s.click("imgs1/OK.png");
			logger.log(Level.INFO, "Sikuli wait 'imgs1/pagefull.pdf'\n");
			s.wait("imgs1/pagefull.png");
			logger.log(Level.INFO, "Sikuli click 'imgs1/pagefull.pdf'\n");
			s.click("imgs1/pagefull.png");
			s.wait("imgs1/P1pdf.png");
			s.click("imgs1/darrow.png");
			s.click("imgs1/darrow.png");
			s.click("imgs1/darrow.png");
			s.click("imgs1/darrow.png");
			s.click("imgs1/darrow.png");
			s.wait("imgs1/shoulder.png");
			logger.log(Level.INFO, "Sikuli close window \n");
			s.click("imgs1/1342199646983.png");
			driver.findElement(By.xpath("//div[@id='main']/section/div/section/table/tbody/tr[6]/td[4]/a/span")).click();
			driver.findElement(By.cssSelector("img[alt=\"Radiology image thumbnail\"]")).click();
			driver.findElement(By.cssSelector("span.ui-icon.ui-icon-closethick")).click();
			driver.findElement(By.xpath("(//img[@alt='Radiology image thumbnail'])[2]")).click();
			driver.findElement(By.cssSelector("span.ui-icon.ui-icon-closethick")).click();
			driver.navigate().back();
			
			logger.log(Level.INFO, "Selenium click 'Text Report' 10\n");
			driver.findElement(By.xpath("(//a[contains(text(),'Text')])[10]")).click();
			r.delay(5000);
			logger.log(Level.INFO, "Sikuli click 'imgs1/OK.png'\n");
			s.click("imgs1/OK.png");
			logger.log(Level.INFO, "Sikuli wait 'imgs1/Pname.png'\n");
			s.wait("imgs1/Pname.png");
			logger.log(Level.INFO, "Sikuli close window\n");
			s.click("imgs1/1342199646983.png");
			logger.log(Level.INFO, "Selenium click 'PDF Report' 10\n");
			driver.findElement(By.xpath("(//a[contains(text(),'PDF')])[11]")).click();
			r.delay(8000);
			logger.log(Level.INFO, "Sikuli click 'imgs1/OK.png'\n");
			s.click("imgs1/OK.png");
			r.delay(6000);
			logger.log(Level.INFO, "Sikuli wait 'imgs1/arrow.png'\n");
			s.wait("imgs1/arrow.png");
			logger.log(Level.INFO, "Sikuli click 'imgs1/arrow.png'\n");
			s.click("imgs1/arrow.png");
			logger.log(Level.INFO, "Sikuli wait 'imgs1/percents.png'\n");
			s.wait("imgs1/percents.png");
			logger.log(Level.INFO, "Sikuli click 'imgs1/100.png'\n");
			s.click("imgs1/100.png");
			logger.log(Level.INFO, "Sikuli wait 'imgs1/PDFconf.png'\n");
			s.wait("imgs1/PDFconf.png");
			logger.log(Level.INFO, "Sikuli close window\n");
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
			logger.log(Level.INFO, "Return to MyHealtheVet homepage\n");
			driver.get("http://158.147.211.128:8080/BBMI/");
			driver.findElement(By.cssSelector("input.mhv_button")).click();
			driver.findElement(By.cssSelector("input.mhv_button"));
			logger.log(Level.INFO, "Login Patient p1211\n");			
			driver.findElement(By.name("loginId")).sendKeys("p1211");
			driver.findElement(By.cssSelector("input.mhv_button")).click();
			r.delay(5000);
			logger.log(Level.INFO, "Selenium click 'Download My Data'\n");
			driver.findElement(By.cssSelector("input.mhv_button"));
			driver.findElement(By.linkText("Download My Data")).click();
			r.delay(2000);
			logger.log(Level.INFO, "Selenium click 'Continue'\n");
			driver.findElement(By.linkText("Continue")).click();
			r.delay(5000);
			logger.log(Level.INFO, "Selenium click 'Search by Date Range'\n");
			driver.findElement(By.linkText("Search by Date Range")).click();
			logger.log(Level.INFO, "Sikuli wait for 'imgs1/2011.png'\n");
			s.wait("imgs1/2011.png");
			logger.log(Level.INFO, "Sikuli click 'imgs1/2011.png'\n");
			s.click("imgs1/2011.png");
			logger.log(Level.INFO, "Sikuli wait for 'imgs1/yearlist.png'\n");
			s.wait("imgs1/yearlist.png");
			logger.log(Level.INFO, "Sikuli click 'imgs1/1995.png'\n");
			s.click("imgs1/1995.png");
			logger.log(Level.INFO, "Selenium click 'searchBtn'\n");
			driver.findElement(By.id("searchBtn")).click();
			r.delay(6000);
			
			logger.log(Level.INFO, "Selenium click 'Text Report' 1\n");
			driver.findElement(By.linkText("Text")).click();
			r.delay(7000);
			logger.log(Level.INFO, "Sikuli click 'imgs1/OK.png' \n");
			s.click("imgs1/OK.png");
			logger.log(Level.INFO, "Sikuli wait for 'imgs1/Pname2.png'\n");
			s.wait("imgs1/Pname2.png");
			logger.log(Level.INFO, "Sikuli close window\n");
			s.click("imgs1/1342199646983.png");
			logger.log(Level.INFO, "Selenium click 'PDF Report' 1\n");
			driver.findElement(By.linkText("PDF")).click();			
			r.delay(6000);
			logger.log(Level.INFO, "Sikuli click 'imgs1/OK.png'\n");
			s.click("imgs1/OK.png");
			logger.log(Level.INFO, "Sikuli wait 'imgs1/arrow.png'\n");
			s.wait("imgs1/arrow.png");
			logger.log(Level.INFO, "Sikuli click 'imgs1/arrow.png'\n");
			s.click("imgs1/arrow.png");
			logger.log(Level.INFO, "Sikuli wait 'imgs1/percents.png'\n");
			s.wait("imgs1/percents.png");
			logger.log(Level.INFO, "Sikuli click 'imgs1/blank.png'\n");
			s.click("imgs1/blank.png");
			s.wait("imgs1/PDFconf.png");
			logger.log(Level.INFO, "Sikuli close window \n");
			s.click("imgs1/1342199646983.png");
			logger.log(Level.INFO, "Selenium click 'Text Report' 8\n");
			driver.findElement(By.xpath("(//a[contains(text(),'Text')])[8]")).click();
			r.delay(6000);
			logger.log(Level.INFO, "Sikuli click 'imgs1/OK.png'\n");
			s.click("imgs1/OK.png");
			logger.log(Level.INFO, "Sikuli wait 'imgs1/Pname2.png'\n");
			s.wait("imgs1/Pname2.png");
			logger.log(Level.INFO, "Sikuli close window \n");
			s.click("imgs1/1342199646983.png");
			logger.log(Level.INFO, "Selenium click 'PDF Report' 8\n");
			driver.findElement(By.xpath("(//a[contains(text(),'PDF')])[9]")).click();
			r.delay(6000);
			logger.log(Level.INFO, "Sikuli click 'imgs1/OK.png'\n");
			s.click("imgs1/OK.png");
			logger.log(Level.INFO, "Sikuli wait 'imgs1/arrow.png'\n");
			s.wait("imgs1/arrow.png");
			logger.log(Level.INFO, "Sikuli click 'imgs1/arrow.png'\n");
			s.click("imgs1/arrow.png");
			logger.log(Level.INFO, "Sikuli wait 'imgs1/percents.png'\n");
			s.wait("imgs1/percents.png");
			logger.log(Level.INFO, "Sikuli click 'imgs1/100.png'\n");
			s.click("imgs1/100.png");
			logger.log(Level.INFO, "Sikuli wait 'imgs1/PDFconf.png'\n");
			s.wait("imgs1/PDFconf.png");
			logger.log(Level.INFO, "Sikuli close window \n");
			s.click("imgs1/1342199646983.png");
			logger.log(Level.INFO, "Selenium click 'Text Report' 10\n");
			driver.findElement(By.xpath("(//a[contains(text(),'Text')])[10]")).click();
			r.delay(5000);
			logger.log(Level.INFO, "Sikuli click 'imgs1/OK.png'\n");
			s.click("imgs1/OK.png");
			logger.log(Level.INFO, "Sikuli wait 'imgs1/Pname2.png'\n");
			s.wait("imgs1/Pname2.png");
			logger.log(Level.INFO, "Sikuli close window\n");
			s.click("imgs1/1342199646983.png");
			logger.log(Level.INFO, "Selenium click 'PDF Report' 10\n");
			driver.findElement(By.xpath("(//a[contains(text(),'PDF')])[11]")).click();
			r.delay(10000);
			logger.log(Level.INFO, "Sikuli click 'imgs1/OK.png'\n");
			s.click("imgs1/OK.png");
			r.delay(3000);
			logger.log(Level.INFO, "Sikuli wait 'imgs1/arrow.png'\n");
			s.wait("imgs1/arrow.png");
			logger.log(Level.INFO, "Sikuli click 'imgs1/arrow.png'\n");
			s.click("imgs1/arrow.png");
			logger.log(Level.INFO, "Sikuli wait 'imgs1/percents.png'\n");
			s.wait("imgs1/percents.png");
			logger.log(Level.INFO, "Sikuli click 'imgs1/100.png'\n");
			s.click("imgs1/100.png");
			logger.log(Level.INFO, "Sikuli wait 'imgs1/PDFconf.png'\n");
			s.wait("imgs1/PDFconf.png");
			logger.log(Level.INFO, "Sikuli close window\n");
			s.click("imgs1/1342199646983.png");
			logger.log(Level.INFO, "Return to MyHealtheVet homepage\n");
			driver.get("http://158.147.211.128:8080/BBMI/");
			driver.findElement(By.cssSelector("input.mhv_button")).click();
			driver.findElement(By.cssSelector("input.mhv_button"));
			logger.log(Level.INFO, "Exit driver, close browser.\n");
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
