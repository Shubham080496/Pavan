package day21;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*1) Launch browser( chrome)
  2) open URL https://opensource-demo.orangehrmlive.com/
  3) Provide username - Admin
  4) Provide password - admin123
  5) Click on login button
  6) Verify dashboard page display
  7) close browser */

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Enter browser name: chrome/edge");
		
		Scanner sc =new Scanner(System.in);
		
		String browser=sc.next();
		
		WebDriver driver=null;
		
		switch(browser)
		{
		case "chrome": driver=new ChromeDriver();
		               break;
		               
		case "edge": driver = new ChromeDriver();
		               break;
		               
		default: System.out.println("Invalid browser");               
		}
		
		try {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
		
		Thread.sleep(3000);

		boolean status=driver.findElement(By.xpath("//div[@class='oxd-layout-context']")).isDisplayed();
		
		//System.out.println(status); either true or false
		if(status==true)
		{
			System.out.println("Log in Successful");
		}
		
		else
		{
			System.out.println("Log in Unsuccessful");
		}
		
	String text=driver.findElement(By.xpath("//*[@id='app']//header//span/h6")).getText();
	
	if(text.equals("Dashboard"))
	{
		System.out.println("Test passed- dashboard displayed");

	}
	else
	{
		System.out.println("Test failed- dashboard not displayed");
	}
			
        driver.quit();
		} //try catch ending bracket to handle any kind of exception in above code
		catch(Exception e) { //"Exception" will handle all types of exception
			
		}
	}
	
}
