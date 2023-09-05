package day40;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/*
1) Launch browser and open url "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"
2) Check logo presence
3) Login
4) Close app 

*/

public class OrangeHRMTest {
	
	WebDriver driver;
	
  @Test(priority=1)
  public void openApp () 
  { 
		driver = new ChromeDriver();
     	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  }
  
  @Test(priority=2)
  public void testLogo()
  {
	  boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	  System.out.println("Logo display status:"+status);
  }
  
  @Test(priority=3)
  public void testLogin()
  {
	  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	  driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
  }
  
  @Test(priority=4)
  public void closeApp() 
  {
	  
	  driver.close();
	  
  }
}
