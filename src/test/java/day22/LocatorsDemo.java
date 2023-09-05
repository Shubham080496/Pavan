package day22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//name
		//driver.findElement(By.name("search")).sendKeys("Mac");
		
		//id
		//boolean logoDisplaystatus=driver.findElement(By.id("logo")).isDisplayed();
		//System.out.println(logoDisplaystatus); //true
		
		
		//linktext & partialLinkText
		//driver.findElement(By.linkText("Tablets")).click(); //prefer
		//driver.findElement(By.partialLinkText("Table")).click(); // not prefered
			
		
		//classname   - prefered to locate multiple web elements
		//List<WebElement> headerLinks=driver.findElements(By.className("list-inline-item"));
		//System.out.println("Number of header links:"+headerLinks.size());
		
		//tagname
		/*List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links:"+links.size());//76
		
		for(WebElement link:links)
		{
			System.out.println(link.getText());
			
		}
		*/
		
		List<WebElement> images=driver.findElements(By.tagName("img"));		
		System.out.println("Number of images:"+images.size()); //18;
	}

}
