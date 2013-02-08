package gov.va.bbmi.automatedtesting.suites.example;

import org.junit.*;
import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExampleTest {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://158.147.211.124:8080/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }
  
  @Test
  public void testUntitled() throws Exception {
    driver.get(baseUrl + "/BBMI");
    driver.manage().window().maximize();
    driver.findElement(By.name("loginId")).clear();
	driver.findElement(By.name("loginId")).sendKeys("p1011");
	driver.findElement(By.cssSelector("input.mhv_button")).click();
	driver.findElement(By.cssSelector("strong > a")).click();
	assertEquals("If you have an upgraded My HealtheVet Premium account you may also download your VA Continuity of Care Document (VA CCD). This is a standard electronic exchange document. It is used for sharing patient information. This is a summary and not intended to be a copy of your complete VA health record. To learn more about this feature, visit VA CCD.", driver.findElement(By.xpath("//div[@id='main']/section/div/div/p[7]")).getText());
	assertEquals("Download my customized Blue Button data", driver.findElement(By.cssSelector("label")).getText());
    assertEquals("Download my VA Continuity of Care Document (VA CCD) data*", driver.findElement(By.xpath("//div[@id='mhv-conditional-box']/div/div[2]/label")).getText());
	    
	    assertEquals("Protect your information and your identity. Send your information to a safe site or device that you or someone you trust controls. Remember, once you have downloaded your information from My HealtheVet, it is your responsibility to keep it safe and private. Learn more about protecting your personal health information .", driver.findElement(By.cssSelector("span.introText")).getText());
    // Warning: verifyTextPresent may require manual changes
    try {
//    	verifyTextPr
      assertTrue (driver.findElement(By.cssSelector("label")).getText().matches("Download my customized Blue Button data"));
    } catch (Error e) {
    	e.printStackTrace();
      verificationErrors.append(e.toString());
    }
    // Warning: verifyTextPresent may require manual changes
    /*  try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]* Download my customized Blue Button data[\\s\\S]*$"));
    } catch (Error e) {
    	e.printStackTrace();
      verificationErrors.append(e.toString());
    }
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*If you have an upgraded My HealtheVet Premium account you may also download your VA Continuity of Care Document \\(VA CCD\\)\\. This is a standard electronic exchange document\\. It is used for sharing patient information\\. This is a summary and not intended to be a copy of your complete VA health record\\. To learn more about this feature, visit VA CCD\\. [\\s\\S]*$"));
    } catch (Error e) {
    	e.printStackTrace();
      verificationErrors.append(e.toString());
    }
    // Warning: verifyTextPresent may require manual changes
    try {
      assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Protect your information and your identity\\. Send your information to a safe site or device that you or someone you trust controls\\. Remember, once you have downloaded your information from My HealtheVet, it is your responsibility to keep it safe and private\\. Learn more about protecting your personal health information \\. [\\s\\S]*$"));
    } catch (Error e) {
    	e.printStackTrace();
      verificationErrors.append(e.toString());
    }*/
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

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alert.getText();
    } finally {
      acceptNextAlert = true;
    }
  }
}

