package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		
		// tag #id
		
		//driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
		//driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("T-shirts");
		
		//tag .class
		
		//driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("T-shirts");
		//driver.findElement(By.cssSelector(".search-box-text")).sendKeys("T-shirts");
		
		//tag [atttribute]
		
		//driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("T-shirts");
		//driver.findElement(By.cssSelector("[placeholder='Search store']")).sendKeys("T-shirts");
		
		//tag class attibute
		
        //driver.findElement(By.cssSelector("input.search-box-text[name=q]")).sendKeys("T-shirts");
		driver.findElement(By.cssSelector(".search-box-text[name=q]")).sendKeys("T-shirts");
		
		
	}

}
