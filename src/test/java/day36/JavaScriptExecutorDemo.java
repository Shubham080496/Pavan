package day36;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorDemo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//inputbox
		WebElement inputbox=driver.findElement(By.xpath("//input[@id='name']"));
		js.executeScript("arguments[0].setAttribute('value','john')",inputbox);

		// radio button/checkbox/button/link
		WebElement male_rd=driver.findElement(By.xpath("//input[@id='male']"));
		js.executeScript("arguments[0].click()",male_rd);
		
		
		//checkbox
		WebElement chkbox=driver.findElement(By.xpath("//input[@id='sunday']"));
		js.executeScript("arguments[0].click()",chkbox);
	}
}
