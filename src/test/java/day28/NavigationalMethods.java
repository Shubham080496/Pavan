package day28;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalMethods {

	public static void main(String[] args) throws MalformedURLException {
		
		WebDriver driver=new ChromeDriver();
		
		//driver.get("https://demo.opencart.com/");
		
		//1)
		//driver.navigate().to("https://demo.opencart.com/");
				
		//2)
		//URL myurl=new URL("https://demo.opencart.com/");
		//driver.navigate().to(myurl);
		
		
		driver.navigate().to("https://demo.opencart.com/");
		//driver.get("https://demo.opencart.com/");
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().to("https://www.orangehrm.com/");
		//driver.get("https://www.orangehrm.com/");
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());  // opencart
		
		driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());  // ornagehrm
		
		driver.navigate().refresh();  // reload the page
			
	}
}
