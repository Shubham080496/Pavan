package day34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionsVsAction {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		WebElement button=driver.findElement(By.xpath("//span[normalize-space()='right click me']"));
		
		Actions act=new Actions(driver);

		Action rightclickaction=act.contextClick(button).build();  // create an action
		rightclickaction.perform();   // perform the action
		
		
		//act.contextClick(button).perform(); 
	
	}
}
