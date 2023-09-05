package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleDropdownWithoutUsingSelect_Assignment1 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.manage().window().maximize();
		
		//clicking on dropdown to open all the options
		driver.findElement(By.xpath("//select[@id='country-list']")).click();
		
		//get all the items
		List <WebElement> options=driver.findElements(By.xpath("//select[@id='country-list']//option"));
		
		//total number of items
		System.out.println("Total no of options in dropdown= "+options.size());
		
		
		//print all the items 
		for(WebElement option:options)
		{
			System.out.println(option.getText());
			
		}
		
		//select one item/option (India)
	    driver.findElement(By.xpath("//select[@id='country-list']/option[5]")).click();
		
		//normal for loop
		
	   /* for(int i=0; i<options.size();i++)
		   {
		    System.out.println(options.get(i).getText());
		   }
	   */
		
		
		
	
	
	}

}
