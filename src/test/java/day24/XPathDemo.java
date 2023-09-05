package day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		String prodname=driver.findElement(By.xpath("//a[text()='MacBook']")).getText();
		System.out.println(prodname);

	}

}
//to replace some letters or words in code use ctrl+f and then replace