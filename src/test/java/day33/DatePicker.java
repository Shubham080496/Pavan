package day33;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);  // switch to frame
		
		//Appraoch1
		//driver.findElement(By.id("datepicker")).sendKeys("08/15/2023");   //format on UI-  mm/dd/yyyy
		
		//Appraoch2 : using date picker
		String year="2021";
		String month="March";
		String date="20";
		
		driver.findElement(By.id("datepicker")).click();  // opens date picker
			
		selectMonthAndYear(driver,month,year);
		selectDate(driver,date);
		
		
	}
	
	static void selectMonthAndYear(WebDriver driver, String month, String year)
	{
		//select month & year
		while(true)
		{
			String currentMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String currentYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(currentMonth.equals(month) && currentYear.equals(year))
			{
				break;
			}
			//driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click(); //next button
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click(); //previous button
		}
	}
	
	
	static void selectDate(WebDriver driver, String date)
	{
		//select date
				List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
				
				for(WebElement dt:allDates)
				{
					if(dt.getText().equals(date))
					{
						dt.click();
						break;
					}
				}
	}
	
	
	
}
