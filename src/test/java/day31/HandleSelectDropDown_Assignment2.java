package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleSelectDropDown_Assignment2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.manage().window().maximize();

		WebElement dropdown = driver.findElement(By.xpath("//select[@id='country-list']"));

		Select option = new Select(dropdown); // dropdown passed as para in select class constructor

		// option.selectByVisibleText("China");

		// option.selectByValue("3"); //value of value attribute

		option.selectByIndex(5); // USA

		// Total number of options
		List<WebElement> options = option.getOptions();
		System.out.println("total number of options:" + options.size()); // 10

		// Printing countries from dropdown...

		// normal for loop
		
		/*
		  for(int i=0; i<options.size();i++) 
		  {
		  System.out.println(options.get(i).getText()); 
		  }
		  
		 */

		// enhanced for loop

		for (WebElement country : options) 
		{
			System.out.println(country.getText());

		}
	}

}
