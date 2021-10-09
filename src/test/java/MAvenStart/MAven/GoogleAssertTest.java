//create maven project..next>next>finish..src/tst/java cretae pkg and testng class
//artifact name is project name should end with Test
//rightclick pom ..maven ..update project
//run as maventest 
//dependency slenium ..junit..testng
package MAvenStart.MAven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleAssertTest {
	WebDriver driver;
  @BeforeTest
  public void launch() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Aswathi\\Desktop\\Selenium\\Selenium drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.google.com/");
	  
  }
  @Test
  public void f() {
	  Assert.assertEquals(driver.getTitle(), "Google");
	  Boolean a=driver.findElement(By.linkText("Gmail")).isDisplayed();
	  if(a)
		  System.out.println("Gmail present");
	  else
		  System.out.println("Gmail not present");
  }
  @AfterTest
  public void close() {
	  
	  driver.close();
	  
  }
}
