package day34;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class RightClickAction {

		public static void main(String[] args) {
			WebDriver driver=new ChromeDriver();
			
			driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
			driver.manage().window().maximize();
			
			WebElement button=driver.findElement(By.xpath("//span[normalize-space()='right click me']"));
			
			Actions act=new Actions(driver);

			act.contextClick(button).perform();  // right click
			
			driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click();
			
			
			driver.switchTo().alert().accept();
		}

}
