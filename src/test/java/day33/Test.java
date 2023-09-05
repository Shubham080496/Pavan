package day33;

	import java.time.Duration;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;
	public class Test {

		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://testautomationpractice.blogspot.com/");
			driver.manage().window().maximize();
			
			driver.switchTo().frame("frame-one796456169");
			driver.findElement(By.xpath("//span[@class='icon_calendar']")).click();
			
			WebElement drpElement=driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
			
			String month="December";
			//String year="2024";
			String date="25";
			
			Select drpSelection=new Select(drpElement);
			drpSelection.selectByValue("2025");
					
			while(true)
			{
				String desiredMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
							
				if(desiredMonth.equals(month))
				{
					break;
				}	
				driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
			}	
			
			
			List<WebElement> allDates=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));
			
			for(WebElement actualDate:allDates)
			{
				
				if(actualDate.getText().equals(date))
				{
					actualDate.click();
					break;
				}	
				
			}	
			
				
		}

}
