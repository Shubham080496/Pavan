package day45;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class LoginTest2 {
	
	WebDriver driver; //declared driver variable at class level
	LoginPage2 lp;
	
	@BeforeClass
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	}
	
	@Test(priority=2)
	public void testLogin()
	{
		lp = new LoginPage2(driver);
		lp.setUsername("Admin");
		lp.setPassword("admin123");
		lp.clickLogin();
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");
	}
	
	@Test(priority=1)
	public void testLinks() 
	{
		lp = new LoginPage2(driver);
		System.out.println(lp.numberOfLinks());
		Assert.assertEquals(lp.numberOfLinks(),5);

	}
	
	@AfterClass
	
	public void tearDown()
	{
		driver.quit();
	}
	
	

}
