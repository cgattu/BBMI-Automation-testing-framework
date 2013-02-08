package gov.va.bbmi.automatedtesting.suites.example;


	import static org.junit.Assert.fail;
import gov.va.bbmi.automatedtesting.suites.AutomatedTestingSuite;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Screen;

	public class bbmigmailtest  extends AutomatedTestingSuite{
		private WebDriver driver;
		private String baseUrl;
		private StringBuffer verificationErrors = new StringBuffer();
		@Before
		public void setUp() throws Exception {
			driver = new FirefoxDriver();
			baseUrl = "https://accounts.google.com/";
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}

		@Test
		public void testUntitled() throws Exception {
			driver.get(baseUrl + "/ServiceLogin?service=mail&passive=true&rm=false&continue=http://mail.google.com/mail/&scc=1&ltmpl=default&ltmplcache=2");
			driver.findElement(By.id("Email")).sendKeys("bbmitestuser");
			driver.findElement(By.id("Passwd")).clear();
			driver.findElement(By.id("Passwd")).sendKeys("bbmi123");
			driver.findElement(By.id("signIn")).click();
			driver.findElement(By.id("Passwd")).clear();
			driver.findElement(By.id("Passwd")).sendKeys("bbmitest123");
			driver.findElement(By.id("signIn")).click();
			driver.manage().window().maximize();
			Screen s=null;
			Robot r	=	null;
			try {
				s = new Screen();
				r = new Robot();
			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		//	r.delay(10000);
			r.delay(10000);
			s.wait("C:/BBMI-Automation-testing-framework-master/BBMI-Automation-testing-framework-master/main/src/Img1/Nmiticatiun0.png");
			logger.info(":; Sikuli  Wait for Subject is loaded::");
			r.delay(10000);
			s.click("C:/BBMI-Automation-testing-framework-master/BBMI-Automation-testing-framework-master/main/src/Img1/Nmiticatiun0.png");
			logger.info("::Sikuliopen the gmail subject::");
			//driver.findElement(By.className("T-I J-J5-Ji nu T-I-ax7 L3")).click();//T-I J-J5-Ji nu T-I-ax7 L3
		//	driver.findElement(By.xpath("//div[@id=':ro']/div/div/div/div/div/div[4]/div/div/div")).click();
		//	//driver.findElement(By.linkText("exact:https://158.147.211.124/JavaBridge/mail/src/login.php")).click();
	///		r.delay(5000);
			// ERROR: Caught exception [ERROR: Unsupported command [waitForPopUp | _blank | 30000]]
		///	driver.findElement(By.name("login_username")).clear();
			//driver.findElement(By.name("login_username")).sendKeys("providerthree@Florida-HIE.net");
		//	driver.findElement(By.name("secretkey")).clear();
			////driver.findElement(By.name("secretkey")).sendKeys("testuser");
			//driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
			// ERROR: Caught exception [ERROR: Unsupported command [selectFrame | right | ]]
			//driver.findElement(By.cssSelector("span.messageSubject")).click();
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



