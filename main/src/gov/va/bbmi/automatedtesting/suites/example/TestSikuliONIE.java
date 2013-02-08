package gov.va.bbmi.automatedtesting.suites.example;

import java.awt.Robot;
import java.io.File;
import java.util.logging.Level;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.slf4j.Logger;

public class TestSikuliONIE {
	protected Logger logger; //logger called by the tests manually
	protected static WebDriver driver; //TODO: do we want a new instance of this each time, or should this be singleton?
	protected static Screen s;
	protected static Robot r;
	@Test
	public void testForFileOpening() throws FindFailed {

		File file = new File("C:/SeliniumDrivers/IEDriverServer.exe");
		System.setProperty("webdriver.ie.driver", file.getAbsolutePath());
		
		LoggingPreferences logs = new LoggingPreferences(); 
		logs.enable(LogType.DRIVER, Level.ALL); 
		DesiredCapabilities caps = DesiredCapabilities.internetExplorer(); 
		caps.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		
		caps.setCapability(CapabilityType.LOGGING_PREFS, logs); 
			driver	=	new InternetExplorerDriver(caps);
		s = new Screen();
		driver.get("http://158.147.211.124:8080/BBMI/");
		//r.delay(5000);
		driver.manage().window().maximize();
		driver.findElement(By.name("loginId")).clear();
		driver.findElement(By.name("loginId")).sendKeys("p1011");
//		r.delay(5000);
		s.click("C:/BBMI-Automation-testing-framework-master/BBMI-Automation-testing-framework-master/main/src/Img1/IE/1358181582259.png");
	}
}
