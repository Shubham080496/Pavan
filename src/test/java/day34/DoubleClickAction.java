package day34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class DoubleClickAction {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		
		WebElement f1=driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement f2=driver.findElement(By.xpath("//input[@id='field2']"));
		WebElement copybutton=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		f1.clear();
		f1.sendKeys("welcome");
		
		
		Actions act=new Actions(driver);
		act.doubleClick(copybutton).perform(); //double click
		
		//String text=f2.getText();
		String text=f2.getAttribute("value");
			
		
		System.out.println("copied text is:=====>"+ text);
		
		if(text.equals("welcome"))
		{
			System.out.println("same text copied...");
		}
		else
		{
			System.out.println("Not NOT Copied....");
		}
				
				
	}

}
