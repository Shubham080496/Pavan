package day34;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick_Assignment1 {

	//double click
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		WebElement f1 = driver.findElement(By.id("field1"));
		WebElement f2 = driver.findElement(By.id("field2"));
		WebElement copyTextButton = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));

		f1.clear();
		f1.sendKeys("welcome");


		Actions act = new Actions(driver);
		
		act.doubleClick(copyTextButton).perform();
		
		String text=f2.getAttribute("value");
		
		System.out.println("copied text is: "+text);
		
		if(text.equals("welcome"))
		{
			System.out.println("same text copied...");
		}
		else
		{
			System.out.println("same text is NOT Copied....");
		}
		

	}

}
