package day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class HandleInnerframe {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();

		// frame 1
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Welcome");

		driver.switchTo().defaultContent(); // go to main page

		// frame3
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);

		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("welcome123");

		// switching to inner frame
		driver.switchTo().frame(0); // usinf index of frame

		driver.findElement(By.xpath("(//div[@class='AB7Lab Id5V1'])[2]")).click();
		driver.switchTo().defaultContent();

		// if ElementNotInteractableException: use java script as below

//		WebElement ele=driver.findElement(By.xpath("//div[@aria-label='I am a human']//div[@class='rseUEf nQOrEb']"));
//		
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("arguments[0].click();",ele );

		// frame 5

		WebElement frame5 = driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		driver.switchTo().frame(frame5);
		driver.findElement(By.name("mytext5")).sendKeys("carpedium");

		driver.findElement(By.linkText("https://a9t9.com")).click();
		boolean logo = driver.findElement(By.xpath("//img[@alt='UI Vision by a9t9 software - Image-Driven Automation']")).isDisplayed();

		System.out.println("Status of the logo displayed is: " + logo);

	}
}
