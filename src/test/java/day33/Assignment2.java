package day33;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {

        WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		//driver.findElement(By.id("datepicker")).sendKeys("04/22/1996");
		
		String date="22";
		String month="December";
		String year="2024";
		
		driver.findElement(By.id("datepicker")).click();
		
		while(true) {
			
			String currentMonth= driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String currentYear= driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(currentMonth.equals(month) && currentYear.equals(year)) 
			{
				break;
			}
			
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();

		}
		
		List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));

		for(WebElement dt:alldates)
		{
			if(dt.getText().equals(date))
			{
				dt.click();
				break;
			}
		}
	}

}
