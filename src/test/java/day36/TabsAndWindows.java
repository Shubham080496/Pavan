package day36;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;



public class TabsAndWindows {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.opencart.com/");
		
		//driver.switchTo().newWindow(WindowType.TAB); // OPENS NEW TAB
		driver.switchTo().newWindow(WindowType.WINDOW); // OPENS NEW WINDOW
		
		driver.get("https://www.orangehrm.com/");
		

	}
}
