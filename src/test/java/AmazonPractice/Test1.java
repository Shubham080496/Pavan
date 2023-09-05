package AmazonPractice;

import java.time.Duration;
import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Enter Browser Name:");
		
		Scanner sc = new Scanner(System.in);
		String browserName = sc.next();
		
		WebDriver driver = null;
		
		switch(browserName) 
		{
		case "chrome": driver = new ChromeDriver();
		break;
		case "firefox" : driver = new FirefoxDriver();
		break;
	    default: System.out.println("Invalid Browser");	
		}
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		WebElement Ele = driver.findElement(By.xpath("//span[text()=\"Hello, Shubham\"]"));
		Thread.sleep(3000);
		act.moveToElement(Ele);
		
		
	}

}
