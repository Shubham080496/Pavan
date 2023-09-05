package day35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class SliderDemo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		
		//min slider
		
		WebElement min_slider=driver.findElement(By.xpath("//span[1]"));
		System.out.println("Current location of min slider:"+min_slider.getLocation()); //(58, 249)  //(x,y)
		act.dragAndDropBy(min_slider, 100, 249).perform();
		System.out.println("After moving location of min slider:"+min_slider.getLocation());  //(162, 249)
		
		//max slider
		WebElement max_slider=driver.findElement(By.xpath("//span[2]"));
		System.out.println("Current location of max slider:"+max_slider.getLocation()); //(795, 249)
		
		act.dragAndDropBy(max_slider, -95, 249).perform();
		System.out.println("After moving location of max slider:"+max_slider.getLocation()); //(700, 249)
		
	}
}
