package day35;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ScrollingPage {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		//ChromeDriver driver=new ChromeDriver();
		//JavascriptExecutor js=driver;
		
		driver.get("https://www.countries-ofthe-world.com/flags-of-the-world.html");
		driver.manage().window().maximize();
		
		//1) scroll down page by pixel number
		//js.executeScript("window.scrollBy(0,3000)","");
		//System.out.println(js.executeScript("return window.pageYOffset;"));
		
		//2) scroll down page till the element is visible
		//WebElement flag=driver.findElement(By.xpath("//img[@alt='Flag of India']"));
		//js.executeScript("arguments[0].scrollIntoView();",flag);
		//System.out.println(js.executeScript("return window.pageYOffset;")); //7567.7919921875
		
		//3) scroll down the page till  end of the document
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");		
		System.out.println(js.executeScript("return window.pageYOffset;"));//9247.7919921875
		
		Thread.sleep(5000);
		
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));
	}
}
