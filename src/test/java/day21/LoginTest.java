package day21;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

/*
1) Launch browser 
2) open URL: https://www.demoblaze.com/index.html
3) click on login link
4) enter user name & password
5) click on login button
6) validate logout link present on home page.
7) validate username displayed on the home page
8) close browser
 */

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Enter browser name(chrome/edge):");
		
		Scanner sc=new Scanner(System.in);
		String browserName=sc.next();
		
		WebDriver driver=null;
		
		//1) Launch browser 
		
		switch(browserName)
		{
		case "chrome" : driver=new ChromeDriver();
						break;	
		case "edge": driver=new EdgeDriver();
						break;
		default: System.out.println("Invalid browser");
		}
			
			
			
		//2) open URL: https://www.demoblaze.com/index.html
		try
		{
		driver.get("https://www.demoblaze.com/index.html");
		driver.manage().window().maximize();// maximize browser
				
		//3) click on login link
		//WebElement loginLink=driver.findElement(By.id("login2"));
		//loginLink.click();
		
		driver.findElement(By.id("login2")).click();
		Thread.sleep(3000);
		
		//4) enter user name & password
		driver.findElement(By.id("loginusername")).sendKeys("pavanol");
		driver.findElement(By.id("loginpassword")).sendKeys("test@123");
		
		//5) click on login button
		driver.findElement(By.xpath("//*[@id='logInModal']/div/div/div[3]/button[2]")).click();
		
		Thread.sleep(3000);
		
		//6) validate logout link present on home page.
		boolean status=driver.findElement(By.id("logout2")).isDisplayed();
		
		if(status==true)
		{
			System.out.println("Login succes-test passed");
		}
		else
		{
			System.out.println("Login not succesful- test failed");
		}
		
		//7)validate user name displayed after login
		
		String text=driver.findElement(By.id("nameofuser")).getText(); //Welcome pavanol
		
		if(text.contains("pavanol"))
		{
			System.out.println("test passed - username displayed");
		}
		else
		{
			System.out.println("test failed - user name not displayed");
		}
			
		//8) close browser
		driver.quit();
		
		}
		catch(Exception e) {
			
		}
	}
}
