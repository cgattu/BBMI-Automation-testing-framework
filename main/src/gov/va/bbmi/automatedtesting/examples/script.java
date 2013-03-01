package gov.va.bbmi.automatedtesting.examples;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class script {
	

	

	
		private WebDriver driver;
		private String baseUrl;
		private StringBuffer verificationErrors = new StringBuffer();
		@Before
		public void setUp() throws Exception {
			driver = new FirefoxDriver();
			baseUrl = "http://158.147.211.128:8080/";
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}

		@Test
		public void testUntitled() throws Exception {
			driver.get(baseUrl + "/BBMI/reports?startDate=11%2F25%2F1998&endDate=8%2F9%2F2012");
			driver.findElement(By.linkText("Date/Time Exam Performed")).click();
			driver.findElement(By.linkText("PDF")).click();
			driver.findElement(By.cssSelector("img")).click();
			driver.findElement(By.id("textHead")).click();
			driver.findElement(By.id("textHead")).click();
			new Select(driver.findElement(By.id("provider"))).selectByVisibleText("Provider, One");
			driver.findElement(By.id("verify")).click();
			driver.findElement(By.cssSelector("input.bbmi_button")).click();
		}

		@After
		public void tearDown() throws Exception {
			driver.quit();
			String verificationErrorString = verificationErrors.toString();
			if (!"".equals(verificationErrorString)) {
				fail(verificationErrorString);
			}
		}

		private boolean isElementPresent(By by) {
			try {
				driver.findElement(by);
				return true;
			} catch (NoSuchElementException e) {
				return false;
			}
		}
	}


