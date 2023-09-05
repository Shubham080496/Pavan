package day29;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment2_HandleAlerts {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		//WebDriverWait mywait=new WebDriverWait(driver, Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		
  // normal alert with only 'Ok' button
		
		//driver.findElement(By.xpath("//button[text()='Alert']")).click();

		//driver.switchTo().alert().accept();

	/*
	  	Alert normalAlert=driver.switchTo().alert();
		System.out.println("Alert text is: "+normalAlert.getText());
		normalAlert.accept();
	*/	

  // confirmation alert with 'Ok' and 'Cancel' buttons
           
		//driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
		//driver.switchTo().alert().accept();
		// driver.switchTo().alert().dismiss();
		
		//handle alert using explicit wait
		
	/*	Alert alert=mywait.until(ExpectedConditions.alertIsPresent());
		System.out.println(alert.getText());
		alert.accept();
	*/	
		
		
  // prompt alert having 'Ok' and 'Cancel' buttons along with input box
		
		driver.findElement(By.xpath("//button[text()='Prompt']")).click();
		
		Alert promptAlert=driver.switchTo().alert();
		
		System.out.println("Alert text is: "+promptAlert.getText());
		promptAlert.sendKeys("Deepak");
		promptAlert.accept();
				
	}
}