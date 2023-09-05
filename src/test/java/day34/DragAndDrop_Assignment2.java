package day34;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop_Assignment2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();

		Actions act = new Actions(driver);

		WebElement source = driver.findElement(By.xpath("//p[normalize-space()='Drag me to my target']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));

		act.dragAndDrop(source, target).perform(); // drag and drop

	}

}
