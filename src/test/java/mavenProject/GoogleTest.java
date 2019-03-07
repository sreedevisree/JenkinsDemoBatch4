package mavenProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleTest {
	WebDriver driver;
  @Test
  public void launchAppTest() {
	  String expected="Google";
	  String actual=driver.getTitle();
	  Assert.assertEquals(expected, actual);
  }
  
  @BeforeTest
  public void LaunchAppTest(){
	  System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Selenium\\Drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("http://www.google.com");
  }
  @AfterTest
  public void browserCloseTest(){
	  driver.quit();
  }
}
