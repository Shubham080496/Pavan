package day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BootstrapMultiSelectDropDown {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		//clicking on dropdown to open all the options
		driver.findElement(By.xpath("//button[contains(@class, 'multiselect')]")).click();
		
		//select one item
		//driver.findElement(By.xpath("//input[@value='Bootstrap']")).click();
		
		//get all the items
		List<WebElement>items=driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
		
		//total number of items
		System.out.println("total number of items in dropdown:"+items.size()); //14
		
		//print all the items
		/*for(WebElement item:items)
		{
			System.out.println(item.getText());
		}*/
		
		//select multiple items by choice
		for(WebElement item:items)
		{
			String itemtext=item.getText();
						
			if(itemtext.equals("Java") || itemtext.equals("Python")) {
				item.click();
			}
		}
		
		
	}
}
