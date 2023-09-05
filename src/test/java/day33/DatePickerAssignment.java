package day33;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePickerAssignment {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		driver.switchTo().frame("frame-one796456169");

		String month = "April";
		String date = "22";
		// String year="1996";

		driver.findElement(By.xpath("//span[@class='icon_calendar']")).click();

		while (true) 
		{
			String currentmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			if (currentmonth.equals(month)) {
				break;
			}

			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();

		}
		
		WebElement yeardropdown = driver.findElement(By.xpath("//select[@aria-label='Select year']"));

		Select requiredYear = new Select(yeardropdown);
		requiredYear.selectByValue("1996");
		List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//td"));

		for (WebElement actualDate : allDates) {

			if (actualDate.getText().equals(date)) {
				actualDate.click();
				break;
			}

		}

	}

}
