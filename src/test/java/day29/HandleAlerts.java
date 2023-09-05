package day29;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlerts {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
				
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		
		//normal alert  - having only OK button
		/*driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		*/
		
		//confirmation alert  - having OK & cancel buttons
		//driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		
		//driver.switchTo().alert().accept();  // close alert using OK button
		//driver.switchTo().alert().dismiss();  // close alert using Cancel button
		
		// Prompt alert - having ok, cancel buttons along with inputbox
				
		//close alert window without using switch() command
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		Thread.sleep(5000);
		Alert alert=driver.switchTo().alert();
		
		System.out.println("text on alert:"+alert.getText());
		alert.sendKeys("Welcome");
		alert.accept();		
			
	}
}
